
/* First created by JCasGen Thu Sep 26 21:11:59 CEST 2019 */
package org.dkpro.keyphrases.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Thu Sep 26 21:11:59 CEST 2019
 * @generated */
public class Keyphrase_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Keyphrase.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.dkpro.keyphrases.type.Keyphrase");
 
  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "org.dkpro.keyphrases.type.Keyphrase");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_score);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScore(int addr, double v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "org.dkpro.keyphrases.type.Keyphrase");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_score, v);}
    
  
 
  /** @generated */
  final Feature casFeat_keyphrase;
  /** @generated */
  final int     casFeatCode_keyphrase;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getKeyphrase(int addr) {
        if (featOkTst && casFeat_keyphrase == null)
      jcas.throwFeatMissing("keyphrase", "org.dkpro.keyphrases.type.Keyphrase");
    return ll_cas.ll_getStringValue(addr, casFeatCode_keyphrase);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setKeyphrase(int addr, String v) {
        if (featOkTst && casFeat_keyphrase == null)
      jcas.throwFeatMissing("keyphrase", "org.dkpro.keyphrases.type.Keyphrase");
    ll_cas.ll_setStringValue(addr, casFeatCode_keyphrase, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Keyphrase_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Double", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

 
    casFeat_keyphrase = jcas.getRequiredFeatureDE(casType, "keyphrase", "uima.cas.String", featOkTst);
    casFeatCode_keyphrase  = (null == casFeat_keyphrase) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_keyphrase).getCode();

  }
}



    