
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
public class EdgeWeight_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EdgeWeight.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
 
  /** @generated */
  final Feature casFeat_MeasureType;
  /** @generated */
  final int     casFeatCode_MeasureType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMeasureType(int addr) {
        if (featOkTst && casFeat_MeasureType == null)
      jcas.throwFeatMissing("MeasureType", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    return ll_cas.ll_getStringValue(addr, casFeatCode_MeasureType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMeasureType(int addr, String v) {
        if (featOkTst && casFeat_MeasureType == null)
      jcas.throwFeatMissing("MeasureType", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    ll_cas.ll_setStringValue(addr, casFeatCode_MeasureType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_RelatednessValue;
  /** @generated */
  final int     casFeatCode_RelatednessValue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getRelatednessValue(int addr) {
        if (featOkTst && casFeat_RelatednessValue == null)
      jcas.throwFeatMissing("RelatednessValue", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_RelatednessValue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRelatednessValue(int addr, double v) {
        if (featOkTst && casFeat_RelatednessValue == null)
      jcas.throwFeatMissing("RelatednessValue", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_RelatednessValue, v);}
    
  
 
  /** @generated */
  final Feature casFeat_MeasureName;
  /** @generated */
  final int     casFeatCode_MeasureName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMeasureName(int addr) {
        if (featOkTst && casFeat_MeasureName == null)
      jcas.throwFeatMissing("MeasureName", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    return ll_cas.ll_getStringValue(addr, casFeatCode_MeasureName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMeasureName(int addr, String v) {
        if (featOkTst && casFeat_MeasureName == null)
      jcas.throwFeatMissing("MeasureName", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    ll_cas.ll_setStringValue(addr, casFeatCode_MeasureName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_WordPair;
  /** @generated */
  final int     casFeatCode_WordPair;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getWordPair(int addr) {
        if (featOkTst && casFeat_WordPair == null)
      jcas.throwFeatMissing("WordPair", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    return ll_cas.ll_getRefValue(addr, casFeatCode_WordPair);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWordPair(int addr, int v) {
        if (featOkTst && casFeat_WordPair == null)
      jcas.throwFeatMissing("WordPair", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    ll_cas.ll_setRefValue(addr, casFeatCode_WordPair, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Term1;
  /** @generated */
  final int     casFeatCode_Term1;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTerm1(int addr) {
        if (featOkTst && casFeat_Term1 == null)
      jcas.throwFeatMissing("Term1", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Term1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTerm1(int addr, String v) {
        if (featOkTst && casFeat_Term1 == null)
      jcas.throwFeatMissing("Term1", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    ll_cas.ll_setStringValue(addr, casFeatCode_Term1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Term2;
  /** @generated */
  final int     casFeatCode_Term2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTerm2(int addr) {
        if (featOkTst && casFeat_Term2 == null)
      jcas.throwFeatMissing("Term2", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Term2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTerm2(int addr, String v) {
        if (featOkTst && casFeat_Term2 == null)
      jcas.throwFeatMissing("Term2", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    ll_cas.ll_setStringValue(addr, casFeatCode_Term2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_AnnotationPair;
  /** @generated */
  final int     casFeatCode_AnnotationPair;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAnnotationPair(int addr) {
        if (featOkTst && casFeat_AnnotationPair == null)
      jcas.throwFeatMissing("AnnotationPair", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    return ll_cas.ll_getRefValue(addr, casFeatCode_AnnotationPair);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnnotationPair(int addr, int v) {
        if (featOkTst && casFeat_AnnotationPair == null)
      jcas.throwFeatMissing("AnnotationPair", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    ll_cas.ll_setRefValue(addr, casFeatCode_AnnotationPair, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public EdgeWeight_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_MeasureType = jcas.getRequiredFeatureDE(casType, "MeasureType", "uima.cas.String", featOkTst);
    casFeatCode_MeasureType  = (null == casFeat_MeasureType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_MeasureType).getCode();

 
    casFeat_RelatednessValue = jcas.getRequiredFeatureDE(casType, "RelatednessValue", "uima.cas.Double", featOkTst);
    casFeatCode_RelatednessValue  = (null == casFeat_RelatednessValue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_RelatednessValue).getCode();

 
    casFeat_MeasureName = jcas.getRequiredFeatureDE(casType, "MeasureName", "uima.cas.String", featOkTst);
    casFeatCode_MeasureName  = (null == casFeat_MeasureName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_MeasureName).getCode();

 
    casFeat_WordPair = jcas.getRequiredFeatureDE(casType, "WordPair", "org.dkpro.keyphrases.type.textgraphs.WordPair", featOkTst);
    casFeatCode_WordPair  = (null == casFeat_WordPair) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_WordPair).getCode();

 
    casFeat_Term1 = jcas.getRequiredFeatureDE(casType, "Term1", "uima.cas.String", featOkTst);
    casFeatCode_Term1  = (null == casFeat_Term1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Term1).getCode();

 
    casFeat_Term2 = jcas.getRequiredFeatureDE(casType, "Term2", "uima.cas.String", featOkTst);
    casFeatCode_Term2  = (null == casFeat_Term2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Term2).getCode();

 
    casFeat_AnnotationPair = jcas.getRequiredFeatureDE(casType, "AnnotationPair", "org.dkpro.keyphrases.type.textgraphs.AnnotationPair", featOkTst);
    casFeatCode_AnnotationPair  = (null == casFeat_AnnotationPair) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_AnnotationPair).getCode();

  }
}



    