

/* First created by JCasGen Thu Sep 26 21:11:59 CEST 2019 */
package org.dkpro.keyphrases.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Sep 26 21:11:59 CEST 2019
 * XML source: /Users/zesch/git/dkpro-keyphrases-new/org.dkpro.keyphrases.example/src/main/resources/desc/type/Keyphrase.xml
 * @generated */
public class Keyphrase extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Keyphrase.class);
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
  protected Keyphrase() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Keyphrase(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Keyphrase(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Keyphrase(JCas jcas, int begin, int end) {
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
  //* Feature: score

  /** getter for score - gets 
   * @generated
   * @return value of the feature 
   */
  public double getScore() {
    if (Keyphrase_Type.featOkTst && ((Keyphrase_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.dkpro.keyphrases.type.Keyphrase");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Keyphrase_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    if (Keyphrase_Type.featOkTst && ((Keyphrase_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.dkpro.keyphrases.type.Keyphrase");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Keyphrase_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: keyphrase

  /** getter for keyphrase - gets 
   * @generated
   * @return value of the feature 
   */
  public String getKeyphrase() {
    if (Keyphrase_Type.featOkTst && ((Keyphrase_Type)jcasType).casFeat_keyphrase == null)
      jcasType.jcas.throwFeatMissing("keyphrase", "org.dkpro.keyphrases.type.Keyphrase");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Keyphrase_Type)jcasType).casFeatCode_keyphrase);}
    
  /** setter for keyphrase - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setKeyphrase(String v) {
    if (Keyphrase_Type.featOkTst && ((Keyphrase_Type)jcasType).casFeat_keyphrase == null)
      jcasType.jcas.throwFeatMissing("keyphrase", "org.dkpro.keyphrases.type.Keyphrase");
    jcasType.ll_cas.ll_setStringValue(addr, ((Keyphrase_Type)jcasType).casFeatCode_keyphrase, v);}    
  }

    