package org.dkpro.keyphrases.example.pipeline;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngineDescription;
import static org.apache.uima.fit.factory.CollectionReaderFactory.createReaderDescription;
import static org.apache.uima.fit.pipeline.SimplePipeline.runPipeline;

import org.dkpro.keyphrases.example.core.KeyphraseMerger;
import org.dkpro.keyphrases.example.core.candidate.CandidateAnnotatorFactory;
import org.dkpro.keyphrases.example.core.filter.CharacterLengthFilter;
import org.dkpro.keyphrases.example.core.filter.KeyphraseCharFilter;
import org.dkpro.keyphrases.example.core.filter.NGramCharFilter;
import org.dkpro.keyphrases.example.core.filter.PosSequenceFilter;
import org.dkpro.keyphrases.example.core.frequency.tfidf.TfIdfAnnotator;
import org.dkpro.keyphrases.example.core.ranking.TfRanking;
import org.dkpro.keyphrases.example.core.ranking.TfidfRanking;
import org.dkpro.keyphrases.example.io.CasPrinter;
import org.dkpro.keyphrases.example.io.KeyphrasePrinter;
import org.dkpro.keyphrases.example.io.TestXmlReader;
import org.dkpro.keyphrases.type.Keyphrase;

import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS_ADJ;
import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS_NOUN;
import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS_PROPN;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.NGram;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.tudarmstadt.ukp.dkpro.core.io.text.TextReader;
import de.tudarmstadt.ukp.dkpro.core.ngrams.NGramAnnotator;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpPosTagger;
import de.tudarmstadt.ukp.dkpro.core.tokit.BreakIteratorSegmenter;

public class TfidfPosExample {

	public static void main(String[] args) throws Exception {

		runPipeline(
                createReaderDescription(TestXmlReader.class,
                        TestXmlReader.PARAM_SOURCE_LOCATION, args[0],
                        TestXmlReader.PARAM_PATTERNS, args[1],
                        TestXmlReader.PARAM_XPATH, args[2],
                        TestXmlReader.PARAM_LANGUAGE, "de"),
		        createEngineDescription(BreakIteratorSegmenter.class),
		        createEngineDescription(OpenNlpPosTagger.class,
		        		OpenNlpPosTagger.PARAM_VARIANT, "maxent"),
		        createEngineDescription(CandidateAnnotatorFactory.getKeyphraseCandidateAnnotator(POS_PROPN.class.getName(), false)),
		        createEngineDescription(CandidateAnnotatorFactory.getKeyphraseCandidateAnnotator(POS_NOUN.class.getName(), false)),
		        createEngineDescription(CandidateAnnotatorFactory.getKeyphraseCandidateAnnotator(POS_ADJ.class.getName(), false)),
		        createEngineDescription(KeyphraseMerger.class,
		        		KeyphraseMerger.PARAM_MAX_LENGTH, 3),
                createEngineDescription(
                        CharacterLengthFilter.class,
                        CharacterLengthFilter.MIN_KEYPHRASE_LENGTH, 3,
                        CharacterLengthFilter.MAX_KEYPHRASE_LENGTH, 100),
                createEngineDescription(KeyphraseCharFilter.class,
                        KeyphraseCharFilter.PARAM_CHAR_SET, "[A-ZÄÖÜa-zäöüß ]+"),
                createEngineDescription(PosSequenceFilter.class),
		        createEngineDescription(TfIdfAnnotator.class,
                        TfIdfAnnotator.PARAM_TFDF_PATH, args[3],
		        		TfIdfAnnotator.PARAM_FEATURE_PATH, Keyphrase.class.getName(),
		        		TfIdfAnnotator.PARAM_IDF_MODE, TfIdfAnnotator.WeightingModeIdf.LOG,
                        TfIdfAnnotator.PARAM_TF_MODE, TfIdfAnnotator.WeightingModeTf.LOG_PLUS_ONE),
                createEngineDescription(TfIdfAnnotator.class,
                        TfIdfAnnotator.PARAM_TFDF_PATH, args[3],
                        TfIdfAnnotator.PARAM_FEATURE_PATH, Token.class.getName(),
                        TfIdfAnnotator.PARAM_IDF_MODE, TfIdfAnnotator.WeightingModeIdf.LOG,
                        TfIdfAnnotator.PARAM_TF_MODE, TfIdfAnnotator.WeightingModeTf.LOG_PLUS_ONE),
		        createEngineDescription(TfidfRanking.class,
		        		TfidfRanking.PARAM_AGGREGATE, TfidfRanking.TfidfAggregate.avg),
		        createEngineDescription(KeyphrasePrinter.class)
		    );
	}
}
