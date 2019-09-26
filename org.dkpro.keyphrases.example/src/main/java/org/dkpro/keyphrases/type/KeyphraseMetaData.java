

/* First created by JCasGen Thu Sep 26 21:11:55 CEST 2019 */
package org.dkpro.keyphrases.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.NonEmptyStringList;
import org.apache.uima.jcas.tcas.DocumentAnnotation;


/** 
 * Updated by JCasGen Thu Sep 26 21:11:55 CEST 2019
 * XML source: /Users/zesch/git/dkpro-keyphrases-new/org.dkpro.keyphrases.example/src/main/resources/desc/type/KeyphraseMetaData.xml
 * @generated */
public class KeyphraseMetaData extends DocumentAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(KeyphraseMetaData.class);
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
  protected KeyphraseMetaData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public KeyphraseMetaData(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public KeyphraseMetaData(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public KeyphraseMetaData(JCas jcas, int begin, int end) {
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
  //* Feature: goldstandardKeyphrases

  /** getter for goldstandardKeyphrases - gets 
   * @generated
   * @return value of the feature 
   */
  public NonEmptyStringList getGoldstandardKeyphrases() {
    if (KeyphraseMetaData_Type.featOkTst && ((KeyphraseMetaData_Type)jcasType).casFeat_goldstandardKeyphrases == null)
      jcasType.jcas.throwFeatMissing("goldstandardKeyphrases", "org.dkpro.keyphrases.type.KeyphraseMetaData");
    return (NonEmptyStringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((KeyphraseMetaData_Type)jcasType).casFeatCode_goldstandardKeyphrases)));}
    
  /** setter for goldstandardKeyphrases - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGoldstandardKeyphrases(NonEmptyStringList v) {
    if (KeyphraseMetaData_Type.featOkTst && ((KeyphraseMetaData_Type)jcasType).casFeat_goldstandardKeyphrases == null)
      jcasType.jcas.throwFeatMissing("goldstandardKeyphrases", "org.dkpro.keyphrases.type.KeyphraseMetaData");
    jcasType.ll_cas.ll_setRefValue(addr, ((KeyphraseMetaData_Type)jcasType).casFeatCode_goldstandardKeyphrases, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: nrofKeyphrases

  /** getter for nrofKeyphrases - gets 
   * @generated
   * @return value of the feature 
   */
  public int getNrofKeyphrases() {
    if (KeyphraseMetaData_Type.featOkTst && ((KeyphraseMetaData_Type)jcasType).casFeat_nrofKeyphrases == null)
      jcasType.jcas.throwFeatMissing("nrofKeyphrases", "org.dkpro.keyphrases.type.KeyphraseMetaData");
    return jcasType.ll_cas.ll_getIntValue(addr, ((KeyphraseMetaData_Type)jcasType).casFeatCode_nrofKeyphrases);}
    
  /** setter for nrofKeyphrases - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNrofKeyphrases(int v) {
    if (KeyphraseMetaData_Type.featOkTst && ((KeyphraseMetaData_Type)jcasType).casFeat_nrofKeyphrases == null)
      jcasType.jcas.throwFeatMissing("nrofKeyphrases", "org.dkpro.keyphrases.type.KeyphraseMetaData");
    jcasType.ll_cas.ll_setIntValue(addr, ((KeyphraseMetaData_Type)jcasType).casFeatCode_nrofKeyphrases, v);}    
  }

    