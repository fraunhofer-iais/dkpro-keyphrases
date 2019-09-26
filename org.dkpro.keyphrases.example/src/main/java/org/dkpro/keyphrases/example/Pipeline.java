package org.dkpro.keyphrases.example;

import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngineDescription;
import static org.apache.uima.fit.factory.CollectionReaderFactory.createReaderDescription;
import static org.apache.uima.fit.pipeline.SimplePipeline.runPipeline;

import de.tudarmstadt.ukp.dkpro.core.io.text.TextReader;
import de.tudarmstadt.ukp.dkpro.core.tokit.BreakIteratorSegmenter;

//import org.dkpro.core.opennlp.OpenNlpNamedEntityRecognizer;

public class Pipeline {

  public static void main(String[] args) throws Exception {
    runPipeline(
//        createReaderDescription(TextReader.class,
//            TextReader.PARAM_SOURCE_LOCATION, "src/main/resources/data/",
//            TextReader.PARAM_PATTERNS, "[+]*.xml",
//            TextReader.PARAM_LANGUAGE, "en"),
        createReaderDescription(TestXmlReader.class,
                TestXmlReader.PARAM_SOURCE_LOCATION, "src/main/resources/data/",
                TestXmlReader.PARAM_PATTERNS, "[+]*.xml",
                TestXmlReader.PARAM_LANGUAGE, "en"),
        createEngineDescription(BreakIteratorSegmenter.class),
        createEngineDescription(CasPrinter.class)
    );
  }
}
