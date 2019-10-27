
/* First created by JCasGen Sun Oct 27 12:10:40 CET 2019 */
package org.dkpro.keyphrases.type.textgraphs;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Sun Oct 27 12:10:40 CET 2019
 * @generated */
public class WordPair_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = WordPair.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.dkpro.keyphrases.type.textgraphs.WordPair");
 
  /** @generated */
  final Feature casFeat_Word1;
  /** @generated */
  final int     casFeatCode_Word1;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getWord1(int addr) {
        if (featOkTst && casFeat_Word1 == null)
      jcas.throwFeatMissing("Word1", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Word1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWord1(int addr, String v) {
        if (featOkTst && casFeat_Word1 == null)
      jcas.throwFeatMissing("Word1", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    ll_cas.ll_setStringValue(addr, casFeatCode_Word1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Word2;
  /** @generated */
  final int     casFeatCode_Word2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getWord2(int addr) {
        if (featOkTst && casFeat_Word2 == null)
      jcas.throwFeatMissing("Word2", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Word2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWord2(int addr, String v) {
        if (featOkTst && casFeat_Word2 == null)
      jcas.throwFeatMissing("Word2", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    ll_cas.ll_setStringValue(addr, casFeatCode_Word2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Pos1;
  /** @generated */
  final int     casFeatCode_Pos1;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPos1(int addr) {
        if (featOkTst && casFeat_Pos1 == null)
      jcas.throwFeatMissing("Pos1", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Pos1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPos1(int addr, int v) {
        if (featOkTst && casFeat_Pos1 == null)
      jcas.throwFeatMissing("Pos1", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    ll_cas.ll_setRefValue(addr, casFeatCode_Pos1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Pos2;
  /** @generated */
  final int     casFeatCode_Pos2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPos2(int addr) {
        if (featOkTst && casFeat_Pos2 == null)
      jcas.throwFeatMissing("Pos2", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Pos2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPos2(int addr, int v) {
        if (featOkTst && casFeat_Pos2 == null)
      jcas.throwFeatMissing("Pos2", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    ll_cas.ll_setRefValue(addr, casFeatCode_Pos2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Token1;
  /** @generated */
  final int     casFeatCode_Token1;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getToken1(int addr) {
        if (featOkTst && casFeat_Token1 == null)
      jcas.throwFeatMissing("Token1", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Token1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setToken1(int addr, int v) {
        if (featOkTst && casFeat_Token1 == null)
      jcas.throwFeatMissing("Token1", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    ll_cas.ll_setRefValue(addr, casFeatCode_Token1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Token2;
  /** @generated */
  final int     casFeatCode_Token2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getToken2(int addr) {
        if (featOkTst && casFeat_Token2 == null)
      jcas.throwFeatMissing("Token2", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Token2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setToken2(int addr, int v) {
        if (featOkTst && casFeat_Token2 == null)
      jcas.throwFeatMissing("Token2", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    ll_cas.ll_setRefValue(addr, casFeatCode_Token2, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public WordPair_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Word1 = jcas.getRequiredFeatureDE(casType, "Word1", "uima.cas.String", featOkTst);
    casFeatCode_Word1  = (null == casFeat_Word1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Word1).getCode();

 
    casFeat_Word2 = jcas.getRequiredFeatureDE(casType, "Word2", "uima.cas.String", featOkTst);
    casFeatCode_Word2  = (null == casFeat_Word2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Word2).getCode();

 
    casFeat_Pos1 = jcas.getRequiredFeatureDE(casType, "Pos1", "de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS", featOkTst);
    casFeatCode_Pos1  = (null == casFeat_Pos1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Pos1).getCode();

 
    casFeat_Pos2 = jcas.getRequiredFeatureDE(casType, "Pos2", "de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS", featOkTst);
    casFeatCode_Pos2  = (null == casFeat_Pos2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Pos2).getCode();

 
    casFeat_Token1 = jcas.getRequiredFeatureDE(casType, "Token1", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token", featOkTst);
    casFeatCode_Token1  = (null == casFeat_Token1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Token1).getCode();

 
    casFeat_Token2 = jcas.getRequiredFeatureDE(casType, "Token2", "de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token", featOkTst);
    casFeatCode_Token2  = (null == casFeat_Token2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Token2).getCode();

  }
}



    