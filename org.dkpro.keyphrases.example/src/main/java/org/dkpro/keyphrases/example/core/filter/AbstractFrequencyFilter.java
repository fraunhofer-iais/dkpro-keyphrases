package org.dkpro.keyphrases.example.core.filter;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.dkpro.keyphrases.type.Keyphrase;

public abstract class AbstractFrequencyFilter
    extends AbstractKeyphraseFilter
{

    public static final String MIN_FREQUENCY = "MinFrequency";
    @ConfigurationParameter(name = MIN_FREQUENCY, mandatory=true)
    private int minFrequency;
    
    public static final String MAX_FREQUENCY = "MaxFrequency";
    @ConfigurationParameter(name = MAX_FREQUENCY, mandatory=true)
    private int maxFrequency;

    @Override
    public List<Keyphrase> filterCandidates(Collection<Keyphrase> keyphrases)
        throws AnalysisEngineProcessException
    {
    
        List<Keyphrase> keyphrasesToBeRemoved = new LinkedList<Keyphrase>();        
        long frequency;
        for (Keyphrase keyphrase : keyphrases) {
            try {
                frequency = getFrequency(keyphrase.getKeyphrase());
            }
            catch (IOException e) {
                throw new AnalysisEngineProcessException(e);
            }
    
            if (frequency < minFrequency || frequency > maxFrequency){
                keyphrasesToBeRemoved.add(keyphrase);
            }
        }
        return keyphrasesToBeRemoved;
    
    }
    
    protected abstract long getFrequency(String keyphrase) throws IOException;

}