package org.dkpro.keyphrases.example.core.filter;

import org.dkpro.keyphrases.type.Keyphrase;


public class CharacterLengthFilter
    extends AbstractLengthFilter
{

    @Override
    protected int getLength(Keyphrase keyphrase)
    {
        return keyphrase.getKeyphrase().length();
    }
}