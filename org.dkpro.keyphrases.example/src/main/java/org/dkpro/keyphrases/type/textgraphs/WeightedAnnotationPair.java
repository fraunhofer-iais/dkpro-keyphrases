

/* First created by JCasGen Sun Oct 27 11:53:05 CET 2019 */
package org.dkpro.keyphrases.type.textgraphs;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Sun Oct 27 12:10:40 CET 2019
 * XML source: /Users/zesch/git/dkpro-keyphrases-new/org.dkpro.keyphrases.example/src/main/resources/desc/type/EdgeWeight.xml
 * @generated */
public class WeightedAnnotationPair extends AnnotationPair {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(WeightedAnnotationPair.class);
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
  protected WeightedAnnotationPair() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public WeightedAnnotationPair(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public WeightedAnnotationPair(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public WeightedAnnotationPair(JCas jcas, int begin, int end) {
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
  //* Feature: weight

  /** getter for weight - gets 
   * @generated
   * @return value of the feature 
   */
  public double getWeight() {
    if (WeightedAnnotationPair_Type.featOkTst && ((WeightedAnnotationPair_Type)jcasType).casFeat_weight == null)
      jcasType.jcas.throwFeatMissing("weight", "org.dkpro.keyphrases.type.textgraphs.WeightedAnnotationPair");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((WeightedAnnotationPair_Type)jcasType).casFeatCode_weight);}
    
  /** setter for weight - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWeight(double v) {
    if (WeightedAnnotationPair_Type.featOkTst && ((WeightedAnnotationPair_Type)jcasType).casFeat_weight == null)
      jcasType.jcas.throwFeatMissing("weight", "org.dkpro.keyphrases.type.textgraphs.WeightedAnnotationPair");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((WeightedAnnotationPair_Type)jcasType).casFeatCode_weight, v);}    
  }

    