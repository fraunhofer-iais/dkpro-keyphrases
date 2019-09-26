package org.dkpro.keyphrases.example;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngineDescription;
import static org.apache.uima.fit.factory.CollectionReaderFactory.createReaderDescription;
import static org.apache.uima.fit.pipeline.SimplePipeline.runPipeline;

import de.tudarmstadt.ukp.dkpro.core.io.text.TextReader;
import de.tudarmstadt.ukp.dkpro.core.io.text.TextWriter;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpSegmenter;
import de.tudarmstadt.ukp.dkpro.core.opennlp.OpenNlpNamedEntityRecognizer;

//import org.dkpro.core.opennlp.OpenNlpNamedEntityRecognizer;

public class Pipeline {

  public static void main(String[] args) throws Exception {
    runPipeline(
        createReaderDescription(TextReader.class,
            TextReader.PARAM_SOURCE_LOCATION,    
            TextReader.PARAM_PATTERNS, "[+]*.xmlr",
            TextReader.PARAM_LANGUAGE, "en"),
        createEngineDescription(OpenNlpSegmenter.class),
        createEngineDescription(OpenNlpNamedEntityRecognizer.class),
        createEngineDescription(TextWriter.class,
        		TextWriter.PARAM_TARGET_LOCATION, "."));
  }
}
