/*******************************************************************************
 * Copyright 2013
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.txt
 ******************************************************************************/
package org.dkpro.keyphrases.example.core.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.dkpro.keyphrases.type.Keyphrase;


public class KeyphraseExtractorUtils {

    /**
     * @param keyphrases The set of extracted keyphrases.
     * @param n How many keyphrases should be returned.
     * 
     * @return Returns a sorted list of the n top-ranked keyphrases.
     */
    public static List<Keyphrase> getTopRankedKeyphrases(Collection<Keyphrase> keyphrases, int n) {
    	List<Keyphrase> keyphraseList = new ArrayList<Keyphrase>(keyphrases);
        Collections.sort(keyphraseList, new KeyphraseScoreComparator());

        if (keyphrases.size() <= n) {
            return keyphraseList;
        }
        else {
            return keyphraseList.subList(0, n);
        }
    }

    /**
     * @param keyphrases The set of extracted keyphrases.
     * @param n How many keyphrases should be returned.
     * 
     * @return Returns a sorted list of the n top-ranked unique keyphrases.
     */
    public static List<Keyphrase> getTopRankedUniqueKeyphrases(Collection<Keyphrase> keyphrases, int n) {
    	
    	List<Keyphrase> sortedKeyphrases = getTopRankedKeyphrases(keyphrases, keyphrases.size());
    	
    	List<Keyphrase> uniqueKeyphrases = new ArrayList<Keyphrase>();
        Set<String> keyphraseStrings = new HashSet<String>();
        for (Keyphrase keyphrase : sortedKeyphrases) {
            if (!keyphraseStrings.contains(keyphrase.getKeyphrase())) {
                keyphraseStrings.add(keyphrase.getKeyphrase());
                uniqueKeyphrases.add(keyphrase);
            }
        }
        
        if (uniqueKeyphrases.size() <= n) {
            return uniqueKeyphrases;
        }
        else {
            return uniqueKeyphrases.subList(0, n);
        }
    }

    /**
     * @param keyphrases A list of keyphrases.
     * @return The list of keyphrases in the order they appear in the document.
     */
    public static List<Keyphrase> getKeyphrasesInDocumentOrder(List<Keyphrase> keyphrases) {
        Collections.sort(keyphrases, new KeyphraseOffsetComparator());
        return keyphrases;
    }

    public static List<String> keyphraseList2StringList(List<Keyphrase> keyphrases) {
        List<String> strings = new ArrayList<String>();
        for (Keyphrase k : keyphrases) {
            strings.add(k.getKeyphrase());
        }
        
        return strings;
    }
    
}
