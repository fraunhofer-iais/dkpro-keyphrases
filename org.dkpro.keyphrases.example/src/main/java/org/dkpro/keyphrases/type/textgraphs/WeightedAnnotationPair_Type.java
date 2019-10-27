
/* First created by JCasGen Sun Oct 27 11:53:05 CET 2019 */
package org.dkpro.keyphrases.type.textgraphs;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Sun Oct 27 12:10:40 CET 2019
 * @generated */
public class WeightedAnnotationPair_Type extends AnnotationPair_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = WeightedAnnotationPair.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.dkpro.keyphrases.type.textgraphs.WeightedAnnotationPair");
 
  /** @generated */
  final Feature casFeat_weight;
  /** @generated */
  final int     casFeatCode_weight;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getWeight(int addr) {
        if (featOkTst && casFeat_weight == null)
      jcas.throwFeatMissing("weight", "org.dkpro.keyphrases.type.textgraphs.WeightedAnnotationPair");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_weight);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWeight(int addr, double v) {
        if (featOkTst && casFeat_weight == null)
      jcas.throwFeatMissing("weight", "org.dkpro.keyphrases.type.textgraphs.WeightedAnnotationPair");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_weight, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public WeightedAnnotationPair_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_weight = jcas.getRequiredFeatureDE(casType, "weight", "uima.cas.Double", featOkTst);
    casFeatCode_weight  = (null == casFeat_weight) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_weight).getCode();

  }
}



    