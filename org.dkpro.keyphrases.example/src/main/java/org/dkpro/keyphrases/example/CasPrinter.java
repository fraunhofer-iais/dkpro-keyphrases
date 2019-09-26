package org.dkpro.keyphrases.example;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.component.JCasAnnotator_ImplBase;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Lemma;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.NGram;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.tudarmstadt.ukp.dkpro.core.ngrams.NGramIterable;

public class CasPrinter
	extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas jcas) throws AnalysisEngineProcessException {

		System.out.println(jcas.getDocumentText());
		
		
	    for (Sentence s : JCasUtil.select(jcas, Sentence.class)) {
	        for (NGram ngram : NGramIterable.create(JCasUtil.selectCovered(Token.class, s), 2)) {
	          ngram.addToIndexes();
	          System.out.println(ngram);
	          
	        }}
		
		/*for (Sentence sentence : JCasUtil.select(jcas,  Sentence.class)) {
			for (Lemma lemma : JCasUtil.selectCovered(jcas, Lemma.class, sentence)) {
				System.out.println(lemma);
				System.out.println(lemma.getValue());
			}
			System.out.println();
		}
		*/
	}

}
