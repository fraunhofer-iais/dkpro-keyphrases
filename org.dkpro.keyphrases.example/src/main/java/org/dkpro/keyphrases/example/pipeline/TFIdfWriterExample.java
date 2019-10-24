package org.dkpro.keyphrases.example.pipeline;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngineDescription;
import static org.apache.uima.fit.factory.CollectionReaderFactory.createReaderDescription;
import static org.apache.uima.fit.pipeline.SimplePipeline.runPipeline;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.NGram;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.tudarmstadt.ukp.dkpro.core.frequency.tfidf.TfIdfWriter;
import de.tudarmstadt.ukp.dkpro.core.frequency.tfidf.model.DfModel;
import de.tudarmstadt.ukp.dkpro.core.frequency.tfidf.util.TfidfUtils;
import de.tudarmstadt.ukp.dkpro.core.io.text.TextReader;
import de.tudarmstadt.ukp.dkpro.core.ngrams.NGramAnnotator;
import de.tudarmstadt.ukp.dkpro.core.tokit.BreakIteratorSegmenter;


public class TFIdfWriterExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//String input_file = "";
		runPipeline(
		        createReaderDescription(TextReader.class,
		        		TextReader.PARAM_SOURCE_LOCATION, "/Users/paggarwal/Downloads/news/",
		        		TextReader.PARAM_PATTERNS, "[+]**/*.txt",
		        		TextReader.PARAM_LANGUAGE, "de"),
		        createEngineDescription(BreakIteratorSegmenter.class),
		        //createEngineDescription(NGramAnnotator.class,
		        //		NGramAnnotator.PARAM_N, 1),		        		
		        createEngineDescription(NGramAnnotator.class,
		        		NGramAnnotator.PARAM_N, 2),
		        createEngineDescription(
		        		TfIdfWriter.class,
		        		TfIdfWriter.PARAM_TARGET_LOCATION, "target/tfidf_ngram.model",
		        		TfIdfWriter.PARAM_FEATURE_PATH, NGram.class.getName())
		        		
		        
		    );

        DfModel dfModel = TfidfUtils.getDfModel("target/tfidf_ngram.model");

        System.out.println(dfModel.getDf("John Lennon"));
        System.out.println(dfModel.getDf("Angela Merkel"));
        System.out.println(dfModel.getDf("Angela"));
        System.out.println(dfModel.getDocumentCount());
	}

}
