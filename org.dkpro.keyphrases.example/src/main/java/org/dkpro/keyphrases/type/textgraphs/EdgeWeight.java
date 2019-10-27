

/* First created by JCasGen Sun Oct 27 12:10:40 CET 2019 */
package org.dkpro.keyphrases.type.textgraphs;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sun Oct 27 12:10:40 CET 2019
 * XML source: /Users/zesch/git/dkpro-keyphrases-new/org.dkpro.keyphrases.example/src/main/resources/desc/type/EdgeWeight.xml
 * @generated */
public class EdgeWeight extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EdgeWeight.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected EdgeWeight() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public EdgeWeight(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public EdgeWeight(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public EdgeWeight(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: MeasureType

  /** getter for MeasureType - gets The type of the semantic relatedness measure that was used to create the annotation.
   * @generated
   * @return value of the feature 
   */
  public String getMeasureType() {
    if (EdgeWeight_Type.featOkTst && ((EdgeWeight_Type)jcasType).casFeat_MeasureType == null)
      jcasType.jcas.throwFeatMissing("MeasureType", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EdgeWeight_Type)jcasType).casFeatCode_MeasureType);}
    
  /** setter for MeasureType - sets The type of the semantic relatedness measure that was used to create the annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMeasureType(String v) {
    if (EdgeWeight_Type.featOkTst && ((EdgeWeight_Type)jcasType).casFeat_MeasureType == null)
      jcasType.jcas.throwFeatMissing("MeasureType", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    jcasType.ll_cas.ll_setStringValue(addr, ((EdgeWeight_Type)jcasType).casFeatCode_MeasureType, v);}    
   
    
  //*--------------*
  //* Feature: RelatednessValue

  /** getter for RelatednessValue - gets The semantic relatedness value.
   * @generated
   * @return value of the feature 
   */
  public double getRelatednessValue() {
    if (EdgeWeight_Type.featOkTst && ((EdgeWeight_Type)jcasType).casFeat_RelatednessValue == null)
      jcasType.jcas.throwFeatMissing("RelatednessValue", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((EdgeWeight_Type)jcasType).casFeatCode_RelatednessValue);}
    
  /** setter for RelatednessValue - sets The semantic relatedness value. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelatednessValue(double v) {
    if (EdgeWeight_Type.featOkTst && ((EdgeWeight_Type)jcasType).casFeat_RelatednessValue == null)
      jcasType.jcas.throwFeatMissing("RelatednessValue", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((EdgeWeight_Type)jcasType).casFeatCode_RelatednessValue, v);}    
   
    
  //*--------------*
  //* Feature: MeasureName

  /** getter for MeasureName - gets The name of the semantic relatedness measure that was used to create the annotation.
   * @generated
   * @return value of the feature 
   */
  public String getMeasureName() {
    if (EdgeWeight_Type.featOkTst && ((EdgeWeight_Type)jcasType).casFeat_MeasureName == null)
      jcasType.jcas.throwFeatMissing("MeasureName", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EdgeWeight_Type)jcasType).casFeatCode_MeasureName);}
    
  /** setter for MeasureName - sets The name of the semantic relatedness measure that was used to create the annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMeasureName(String v) {
    if (EdgeWeight_Type.featOkTst && ((EdgeWeight_Type)jcasType).casFeat_MeasureName == null)
      jcasType.jcas.throwFeatMissing("MeasureName", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    jcasType.ll_cas.ll_setStringValue(addr, ((EdgeWeight_Type)jcasType).casFeatCode_MeasureName, v);}    
   
    
  //*--------------*
  //* Feature: WordPair

  /** getter for WordPair - gets 
   * @generated
   * @return value of the feature 
   */
  public WordPair getWordPair() {
    if (EdgeWeight_Type.featOkTst && ((EdgeWeight_Type)jcasType).casFeat_WordPair == null)
      jcasType.jcas.throwFeatMissing("WordPair", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    return (WordPair)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EdgeWeight_Type)jcasType).casFeatCode_WordPair)));}
    
  /** setter for WordPair - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWordPair(WordPair v) {
    if (EdgeWeight_Type.featOkTst && ((EdgeWeight_Type)jcasType).casFeat_WordPair == null)
      jcasType.jcas.throwFeatMissing("WordPair", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    jcasType.ll_cas.ll_setRefValue(addr, ((EdgeWeight_Type)jcasType).casFeatCode_WordPair, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Term1

  /** getter for Term1 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTerm1() {
    if (EdgeWeight_Type.featOkTst && ((EdgeWeight_Type)jcasType).casFeat_Term1 == null)
      jcasType.jcas.throwFeatMissing("Term1", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EdgeWeight_Type)jcasType).casFeatCode_Term1);}
    
  /** setter for Term1 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTerm1(String v) {
    if (EdgeWeight_Type.featOkTst && ((EdgeWeight_Type)jcasType).casFeat_Term1 == null)
      jcasType.jcas.throwFeatMissing("Term1", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    jcasType.ll_cas.ll_setStringValue(addr, ((EdgeWeight_Type)jcasType).casFeatCode_Term1, v);}    
   
    
  //*--------------*
  //* Feature: Term2

  /** getter for Term2 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTerm2() {
    if (EdgeWeight_Type.featOkTst && ((EdgeWeight_Type)jcasType).casFeat_Term2 == null)
      jcasType.jcas.throwFeatMissing("Term2", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EdgeWeight_Type)jcasType).casFeatCode_Term2);}
    
  /** setter for Term2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTerm2(String v) {
    if (EdgeWeight_Type.featOkTst && ((EdgeWeight_Type)jcasType).casFeat_Term2 == null)
      jcasType.jcas.throwFeatMissing("Term2", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    jcasType.ll_cas.ll_setStringValue(addr, ((EdgeWeight_Type)jcasType).casFeatCode_Term2, v);}    
   
    
  //*--------------*
  //* Feature: AnnotationPair

  /** getter for AnnotationPair - gets 
   * @generated
   * @return value of the feature 
   */
  public AnnotationPair getAnnotationPair() {
    if (EdgeWeight_Type.featOkTst && ((EdgeWeight_Type)jcasType).casFeat_AnnotationPair == null)
      jcasType.jcas.throwFeatMissing("AnnotationPair", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    return (AnnotationPair)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EdgeWeight_Type)jcasType).casFeatCode_AnnotationPair)));}
    
  /** setter for AnnotationPair - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnnotationPair(AnnotationPair v) {
    if (EdgeWeight_Type.featOkTst && ((EdgeWeight_Type)jcasType).casFeat_AnnotationPair == null)
      jcasType.jcas.throwFeatMissing("AnnotationPair", "org.dkpro.keyphrases.type.textgraphs.EdgeWeight");
    jcasType.ll_cas.ll_setRefValue(addr, ((EdgeWeight_Type)jcasType).casFeatCode_AnnotationPair, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    