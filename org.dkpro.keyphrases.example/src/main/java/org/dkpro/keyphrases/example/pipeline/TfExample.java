package org.dkpro.keyphrases.example.pipeline;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngineDescription;
import static org.apache.uima.fit.factory.CollectionReaderFactory.createReaderDescription;
import static org.apache.uima.fit.pipeline.SimplePipeline.runPipeline;

import org.dkpro.keyphrases.example.core.candidate.CandidateAnnotatorFactory;
import org.dkpro.keyphrases.example.core.ranking.TfRanking;
import org.dkpro.keyphrases.example.io.KeyphrasePrinter;

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
	}
}
