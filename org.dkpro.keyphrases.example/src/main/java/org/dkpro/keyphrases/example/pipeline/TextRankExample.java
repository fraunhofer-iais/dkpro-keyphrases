package org.dkpro.keyphrases.example.pipeline;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngineDescription;
import static org.apache.uima.fit.factory.CollectionReaderFactory.createReaderDescription;
import static org.apache.uima.fit.pipeline.SimplePipeline.runPipeline;

import org.dkpro.keyphrases.example.core.KeyphraseMerger;
import org.dkpro.keyphrases.example.core.candidate.CandidateAnnotatorFactory;
import org.dkpro.keyphrases.example.core.filter.CharacterLengthFilter;
import org.dkpro.keyphrases.example.io.KeyphrasePrinter;
import org.dkpro.keyphrases.example.textgraphs.CooccurrenceGraph;
import org.dkpro.keyphrases.example.textgraphs.NodeDegreeRanking;
import org.dkpro.keyphrases.type.Keyphrase;

import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS_ADJ;
import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS_NOUN;
import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS_PROPN;
import de.tudarmstadt.ukp.dkpro.core.api.resources.DkproContext;
import de.tudarmstadt.ukp.dkpro.core.io.text.TextReader;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpPosTagger;
import de.tudarmstadt.ukp.dkpro.core.tokit.BreakIteratorSegmenter;

public class TextRankExample {

	public static void main(String[] args) throws Exception {

		int windowSize = 3;
		
		String path = DkproContext.getContext().getWorkspace("german_news_articles").getAbsolutePath();
		
		runPipeline(
		        createReaderDescription(TextReader.class,
		            TextReader.PARAM_SOURCE_LOCATION, path,
		            TextReader.PARAM_PATTERNS, "[+]Etat/*11*.txt",
		            TextReader.PARAM_LANGUAGE, "de"),
		        createEngineDescription(BreakIteratorSegmenter.class),
		        createEngineDescription(OpenNlpPosTagger.class,
		        		OpenNlpPosTagger.PARAM_VARIANT, "maxent"),
		        createEngineDescription(CandidateAnnotatorFactory.getKeyphraseCandidateAnnotator(POS_PROPN.class.getName(), false)),
		        createEngineDescription(CandidateAnnotatorFactory.getKeyphraseCandidateAnnotator(POS_NOUN.class.getName(), false)),
		        createEngineDescription(CandidateAnnotatorFactory.getKeyphraseCandidateAnnotator(POS_ADJ.class.getName(), false)),
		        createEngineDescription(
		        		CooccurrenceGraph.class,
                        CooccurrenceGraph.PARAM_FEATURE_PATH, Keyphrase.class.getName(),
                        CooccurrenceGraph.PARAM_WINDOW_SIZE, windowSize
		        ),
		        createEngineDescription(NodeDegreeRanking.class),
		        createEngineDescription(
	                    CharacterLengthFilter.class,
	                    CharacterLengthFilter.MIN_KEYPHRASE_LENGTH, 2,
	                    CharacterLengthFilter.MAX_KEYPHRASE_LENGTH, 100),
		        createEngineDescription(KeyphraseMerger.class,
		        		KeyphraseMerger.PARAM_MAX_LENGTH, 2),
		        createEngineDescription(KeyphrasePrinter.class)
		    );
	}
}
