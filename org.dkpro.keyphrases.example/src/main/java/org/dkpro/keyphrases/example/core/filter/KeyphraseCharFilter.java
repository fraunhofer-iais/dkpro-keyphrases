package org.dkpro.keyphrases.example.core.filter;

import java.util.regex.Pattern;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.component.JCasAnnotator_ImplBase;
import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;
import org.dkpro.keyphrases.type.Keyphrase;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.NGram;

public class KeyphraseCharFilter
    extends JCasAnnotator_ImplBase
{

    /**
     * A regular expression represented as a String defining the set of allowed characters.
     */
    public static final String PARAM_CHAR_SET = "charset";
    @ConfigurationParameter(name = PARAM_CHAR_SET, mandatory = true, defaultValue = "[A-Za-z]+")
    private String charset;

    /*
     * (non-Javadoc)
     *
     * discard all keyphrases which contain characters not included in charset
     */
    @Override
    public void process(JCas jcas) throws AnalysisEngineProcessException
    {
        Pattern pattern = Pattern.compile(charset);
        for (Keyphrase keyphrase : JCasUtil.select(jcas, Keyphrase.class)) {
            if (!pattern.matcher(keyphrase.getCoveredText()).matches()) {
                keyphrase.removeFromIndexes();
            }
        }
    }

}