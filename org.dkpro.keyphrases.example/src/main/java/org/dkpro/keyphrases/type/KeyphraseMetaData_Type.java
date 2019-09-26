
/* First created by JCasGen Thu Sep 26 21:11:55 CEST 2019 */
package org.dkpro.keyphrases.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.DocumentAnnotation_Type;

/** 
 * Updated by JCasGen Thu Sep 26 21:11:55 CEST 2019
 * @generated */
public class KeyphraseMetaData_Type extends DocumentAnnotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = KeyphraseMetaData.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.dkpro.keyphrases.type.KeyphraseMetaData");
 
  /** @generated */
  final Feature casFeat_goldstandardKeyphrases;
  /** @generated */
  final int     casFeatCode_goldstandardKeyphrases;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getGoldstandardKeyphrases(int addr) {
        if (featOkTst && casFeat_goldstandardKeyphrases == null)
      jcas.throwFeatMissing("goldstandardKeyphrases", "org.dkpro.keyphrases.type.KeyphraseMetaData");
    return ll_cas.ll_getRefValue(addr, casFeatCode_goldstandardKeyphrases);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGoldstandardKeyphrases(int addr, int v) {
        if (featOkTst && casFeat_goldstandardKeyphrases == null)
      jcas.throwFeatMissing("goldstandardKeyphrases", "org.dkpro.keyphrases.type.KeyphraseMetaData");
    ll_cas.ll_setRefValue(addr, casFeatCode_goldstandardKeyphrases, v);}
    
  
 
  /** @generated */
  final Feature casFeat_nrofKeyphrases;
  /** @generated */
  final int     casFeatCode_nrofKeyphrases;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getNrofKeyphrases(int addr) {
        if (featOkTst && casFeat_nrofKeyphrases == null)
      jcas.throwFeatMissing("nrofKeyphrases", "org.dkpro.keyphrases.type.KeyphraseMetaData");
    return ll_cas.ll_getIntValue(addr, casFeatCode_nrofKeyphrases);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNrofKeyphrases(int addr, int v) {
        if (featOkTst && casFeat_nrofKeyphrases == null)
      jcas.throwFeatMissing("nrofKeyphrases", "org.dkpro.keyphrases.type.KeyphraseMetaData");
    ll_cas.ll_setIntValue(addr, casFeatCode_nrofKeyphrases, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public KeyphraseMetaData_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_goldstandardKeyphrases = jcas.getRequiredFeatureDE(casType, "goldstandardKeyphrases", "uima.cas.NonEmptyStringList", featOkTst);
    casFeatCode_goldstandardKeyphrases  = (null == casFeat_goldstandardKeyphrases) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_goldstandardKeyphrases).getCode();

 
    casFeat_nrofKeyphrases = jcas.getRequiredFeatureDE(casType, "nrofKeyphrases", "uima.cas.Integer", featOkTst);
    casFeatCode_nrofKeyphrases  = (null == casFeat_nrofKeyphrases) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nrofKeyphrases).getCode();

  }
}



    