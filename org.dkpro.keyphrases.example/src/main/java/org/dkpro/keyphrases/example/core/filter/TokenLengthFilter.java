package org.dkpro.keyphrases.example.core.filter;

import org.apache.uima.fit.util.JCasUtil;
import org.dkpro.keyphrases.type.Keyphrase;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;

public class TokenLengthFilter
    extends AbstractLengthFilter
{

    @Override
    protected int getLength(Keyphrase keyphrase)
    {
        return JCasUtil.selectCovered(Token.class, keyphrase).size();
    }

}