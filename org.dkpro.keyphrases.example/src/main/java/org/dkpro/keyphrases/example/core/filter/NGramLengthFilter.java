package org.dkpro.keyphrases.example.core.filter;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.component.JCasAnnotator_ImplBase;
import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.NGram;


public class NGramLengthFilter
    extends JCasAnnotator_ImplBase
{

    public static final String MIN_NGRAM_LENGTH = "MinKeyphraseLength";
    @ConfigurationParameter(name = MIN_NGRAM_LENGTH, mandatory = true)
    private int minLength;

    public static final String MAX_NGRAM_LENGTH = "MaxKeyphraseLength";
    @ConfigurationParameter(name = MAX_NGRAM_LENGTH, mandatory = true)
    private int maxLength;

    /*
     * (non-Javadoc)
     * 
     * discard all ngrams with less than minLength or more than maxLength characters
     */
    @Override
    public void process(JCas jcas) throws AnalysisEngineProcessException
    {
        int length;
        for (NGram ngram : JCasUtil.select(jcas, NGram.class)) {
            length = ngram.getEnd() - ngram.getBegin();
            if (length < minLength || length > maxLength) {
                ngram.removeFromIndexes();
            }
        }
    }

}