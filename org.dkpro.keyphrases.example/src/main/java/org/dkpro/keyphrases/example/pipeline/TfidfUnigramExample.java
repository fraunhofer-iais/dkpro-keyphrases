package org.dkpro.keyphrases.example.pipeline;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngineDescription;
import static org.apache.uima.fit.factory.CollectionReaderFactory.createReaderDescription;
import static org.apache.uima.fit.pipeline.SimplePipeline.runPipeline;

import org.dkpro.keyphrases.example.core.KeyphraseMerger;
import org.dkpro.keyphrases.example.core.candidate.CandidateAnnotatorFactory;
import org.dkpro.keyphrases.example.core.filter.CharacterLengthFilter;
import org.dkpro.keyphrases.example.core.frequency.tfidf.TfIdfAnnotator;
import org.dkpro.keyphrases.example.core.ranking.TfRanking;
import org.dkpro.keyphrases.example.core.ranking.TfidfRanking;
import org.dkpro.keyphrases.example.io.KeyphrasePrinter;
import org.dkpro.keyphrases.type.Keyphrase;

import de.tudarmstadt.ukp.dkpro.core.api.frequency.tfidf.type.Tfidf;
import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS_ADJ;
import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS_NOUN;
import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS_PROPN;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.NGram;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.tudarmstadt.ukp.dkpro.core.io.text.TextReader;
import de.tudarmstadt.ukp.dkpro.core.ngrams.NGramAnnotator;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpPosTagger;
import de.tudarmstadt.ukp.dkpro.core.tokit.BreakIteratorSegmenter;

public class TfidfUnigramExample {

	public static void main(String[] args) throws Exception {
	    
		runPipeline(
	        createReaderDescription(TextReader.class,
	            TextReader.PARAM_SOURCE_LOCATION, args[0],
	            TextReader.PARAM_PATTERNS, args[1],
	            TextReader.PARAM_LANGUAGE, "de"),
	        createEngineDescription(BreakIteratorSegmenter.class),
	        createEngineDescription(CandidateAnnotatorFactory.getKeyphraseCandidateAnnotator_token(false)),
	        createEngineDescription(TfIdfAnnotator.class,
                    TfIdfAnnotator.PARAM_TFDF_PATH, args[2],
	        		TfIdfAnnotator.PARAM_FEATURE_PATH, Token.class.getName(),
	        		TfIdfAnnotator.PARAM_IDF_MODE, TfIdfAnnotator.WeightingModeIdf.LOG,
	        		TfIdfAnnotator.PARAM_TF_MODE, TfIdfAnnotator.WeightingModeTf.NORMAL),
	        createEngineDescription(TfidfRanking.class),
	        createEngineDescription(
                    CharacterLengthFilter.class,
                    CharacterLengthFilter.MIN_KEYPHRASE_LENGTH, 2,
                    CharacterLengthFilter.MAX_KEYPHRASE_LENGTH, 100),
	        createEngineDescription(KeyphrasePrinter.class)
	    );
		

	}
}
