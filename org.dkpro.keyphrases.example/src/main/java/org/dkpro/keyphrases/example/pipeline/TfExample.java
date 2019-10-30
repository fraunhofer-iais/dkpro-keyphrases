package org.dkpro.keyphrases.example.pipeline;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngineDescription;
import static org.apache.uima.fit.factory.CollectionReaderFactory.createReaderDescription;
import static org.apache.uima.fit.pipeline.SimplePipeline.runPipeline;

import org.dkpro.keyphrases.example.core.candidate.CandidateAnnotatorFactory;
import org.dkpro.keyphrases.example.core.filter.CharacterLengthFilter;
import org.dkpro.keyphrases.example.core.ranking.TfRanking;
import org.dkpro.keyphrases.example.io.KeyphrasePrinter;
import org.dkpro.keyphrases.example.io.TestXmlReader;

import de.tudarmstadt.ukp.dkpro.core.io.text.TextReader;
import de.tudarmstadt.ukp.dkpro.core.tokit.BreakIteratorSegmenter;

public class TfExample {

	public static void main(String[] args) throws Exception {
	    
		runPipeline(
	        createReaderDescription(TextReader.class,
	            TextReader.PARAM_SOURCE_LOCATION, "src/main/resources/data/",
	            TextReader.PARAM_PATTERNS, "[+]*.xml",
	            TextReader.PARAM_LANGUAGE, "en"),
	        createEngineDescription(BreakIteratorSegmenter.class),
	        createEngineDescription(CandidateAnnotatorFactory.getKeyphraseCandidateAnnotator_token(false)),
	        createEngineDescription(TfRanking.class),
	        createEngineDescription(KeyphrasePrinter.class)
	    );
		
		// add a filter to remove unwanted results
		runPipeline(
	        createReaderDescription(TestXmlReader.class,
	            TestXmlReader.PARAM_SOURCE_LOCATION, "src/main/resources/data/",
	            TestXmlReader.PARAM_PATTERNS, "[+]*.xml",
	            TestXmlReader.PARAM_XPATH, "//body",
	            TestXmlReader.PARAM_LANGUAGE, "de"),
	        createEngineDescription(BreakIteratorSegmenter.class),
	        createEngineDescription(CandidateAnnotatorFactory.getKeyphraseCandidateAnnotator_token(false)),
	        createEngineDescription(TfRanking.class),
	        createEngineDescription(
                    CharacterLengthFilter.class,
                    CharacterLengthFilter.MIN_KEYPHRASE_LENGTH, 2,
                    CharacterLengthFilter.MAX_KEYPHRASE_LENGTH, 100),
	        createEngineDescription(KeyphrasePrinter.class)
	    );
	}
}
