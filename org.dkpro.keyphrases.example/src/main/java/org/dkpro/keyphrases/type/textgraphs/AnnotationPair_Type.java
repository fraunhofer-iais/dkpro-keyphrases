
/* First created by JCasGen Sun Oct 27 11:53:05 CET 2019 */
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
public class AnnotationPair_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnnotationPair.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.dkpro.keyphrases.type.textgraphs.AnnotationPair");
 
  /** @generated */
  final Feature casFeat_Annotation1;
  /** @generated */
  final int     casFeatCode_Annotation1;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAnnotation1(int addr) {
        if (featOkTst && casFeat_Annotation1 == null)
      jcas.throwFeatMissing("Annotation1", "org.dkpro.keyphrases.type.textgraphs.AnnotationPair");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Annotation1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnnotation1(int addr, int v) {
        if (featOkTst && casFeat_Annotation1 == null)
      jcas.throwFeatMissing("Annotation1", "org.dkpro.keyphrases.type.textgraphs.AnnotationPair");
    ll_cas.ll_setRefValue(addr, casFeatCode_Annotation1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Annotation2;
  /** @generated */
  final int     casFeatCode_Annotation2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAnnotation2(int addr) {
        if (featOkTst && casFeat_Annotation2 == null)
      jcas.throwFeatMissing("Annotation2", "org.dkpro.keyphrases.type.textgraphs.AnnotationPair");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Annotation2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnnotation2(int addr, int v) {
        if (featOkTst && casFeat_Annotation2 == null)
      jcas.throwFeatMissing("Annotation2", "org.dkpro.keyphrases.type.textgraphs.AnnotationPair");
    ll_cas.ll_setRefValue(addr, casFeatCode_Annotation2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_StringRepresentation1;
  /** @generated */
  final int     casFeatCode_StringRepresentation1;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getStringRepresentation1(int addr) {
        if (featOkTst && casFeat_StringRepresentation1 == null)
      jcas.throwFeatMissing("StringRepresentation1", "org.dkpro.keyphrases.type.textgraphs.AnnotationPair");
    return ll_cas.ll_getStringValue(addr, casFeatCode_StringRepresentation1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStringRepresentation1(int addr, String v) {
        if (featOkTst && casFeat_StringRepresentation1 == null)
      jcas.throwFeatMissing("StringRepresentation1", "org.dkpro.keyphrases.type.textgraphs.AnnotationPair");
    ll_cas.ll_setStringValue(addr, casFeatCode_StringRepresentation1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_StringRepresentation2;
  /** @generated */
  final int     casFeatCode_StringRepresentation2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getStringRepresentation2(int addr) {
        if (featOkTst && casFeat_StringRepresentation2 == null)
      jcas.throwFeatMissing("StringRepresentation2", "org.dkpro.keyphrases.type.textgraphs.AnnotationPair");
    return ll_cas.ll_getStringValue(addr, casFeatCode_StringRepresentation2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStringRepresentation2(int addr, String v) {
        if (featOkTst && casFeat_StringRepresentation2 == null)
      jcas.throwFeatMissing("StringRepresentation2", "org.dkpro.keyphrases.type.textgraphs.AnnotationPair");
    ll_cas.ll_setStringValue(addr, casFeatCode_StringRepresentation2, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AnnotationPair_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Annotation1 = jcas.getRequiredFeatureDE(casType, "Annotation1", "uima.tcas.Annotation", featOkTst);
    casFeatCode_Annotation1  = (null == casFeat_Annotation1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Annotation1).getCode();

 
    casFeat_Annotation2 = jcas.getRequiredFeatureDE(casType, "Annotation2", "uima.tcas.Annotation", featOkTst);
    casFeatCode_Annotation2  = (null == casFeat_Annotation2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Annotation2).getCode();

 
    casFeat_StringRepresentation1 = jcas.getRequiredFeatureDE(casType, "StringRepresentation1", "uima.cas.String", featOkTst);
    casFeatCode_StringRepresentation1  = (null == casFeat_StringRepresentation1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_StringRepresentation1).getCode();

 
    casFeat_StringRepresentation2 = jcas.getRequiredFeatureDE(casType, "StringRepresentation2", "uima.cas.String", featOkTst);
    casFeatCode_StringRepresentation2  = (null == casFeat_StringRepresentation2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_StringRepresentation2).getCode();

  }
}



    