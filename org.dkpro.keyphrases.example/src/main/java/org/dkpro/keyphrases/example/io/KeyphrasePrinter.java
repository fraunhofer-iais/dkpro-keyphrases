package org.dkpro.keyphrases.example.io;

import java.util.List;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.component.JCasAnnotator_ImplBase;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;
import org.dkpro.keyphrases.example.core.util.KeyphraseExtractorUtils;
import org.dkpro.keyphrases.type.Keyphrase;

public class KeyphrasePrinter
	extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas jcas) throws AnalysisEngineProcessException {

		List<Keyphrase> keyphrases = KeyphraseExtractorUtils.getTopRankedUniqueKeyphrases(JCasUtil.select(jcas, Keyphrase.class), 10);
	    for (Keyphrase keyphrase : keyphrases) {
	    	System.out.println(keyphrase.getKeyphrase() + " " + keyphrase.getScore());
	    }
	}
}
