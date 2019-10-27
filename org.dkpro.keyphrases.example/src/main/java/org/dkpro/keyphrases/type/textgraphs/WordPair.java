

/* First created by JCasGen Sun Oct 27 12:10:40 CET 2019 */
package org.dkpro.keyphrases.type.textgraphs;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.tudarmstadt.ukp.dkpro.core.api.lexmorph.type.pos.POS;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sun Oct 27 12:10:40 CET 2019
 * XML source: /Users/zesch/git/dkpro-keyphrases-new/org.dkpro.keyphrases.example/src/main/resources/desc/type/EdgeWeight.xml
 * @generated */
public class WordPair extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(WordPair.class);
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
  protected WordPair() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public WordPair(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public WordPair(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public WordPair(JCas jcas, int begin, int end) {
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
  //* Feature: Word1

  /** getter for Word1 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getWord1() {
    if (WordPair_Type.featOkTst && ((WordPair_Type)jcasType).casFeat_Word1 == null)
      jcasType.jcas.throwFeatMissing("Word1", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    return jcasType.ll_cas.ll_getStringValue(addr, ((WordPair_Type)jcasType).casFeatCode_Word1);}
    
  /** setter for Word1 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWord1(String v) {
    if (WordPair_Type.featOkTst && ((WordPair_Type)jcasType).casFeat_Word1 == null)
      jcasType.jcas.throwFeatMissing("Word1", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    jcasType.ll_cas.ll_setStringValue(addr, ((WordPair_Type)jcasType).casFeatCode_Word1, v);}    
   
    
  //*--------------*
  //* Feature: Word2

  /** getter for Word2 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getWord2() {
    if (WordPair_Type.featOkTst && ((WordPair_Type)jcasType).casFeat_Word2 == null)
      jcasType.jcas.throwFeatMissing("Word2", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    return jcasType.ll_cas.ll_getStringValue(addr, ((WordPair_Type)jcasType).casFeatCode_Word2);}
    
  /** setter for Word2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWord2(String v) {
    if (WordPair_Type.featOkTst && ((WordPair_Type)jcasType).casFeat_Word2 == null)
      jcasType.jcas.throwFeatMissing("Word2", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    jcasType.ll_cas.ll_setStringValue(addr, ((WordPair_Type)jcasType).casFeatCode_Word2, v);}    
   
    
  //*--------------*
  //* Feature: Pos1

  /** getter for Pos1 - gets 
   * @generated
   * @return value of the feature 
   */
  public POS getPos1() {
    if (WordPair_Type.featOkTst && ((WordPair_Type)jcasType).casFeat_Pos1 == null)
      jcasType.jcas.throwFeatMissing("Pos1", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    return (POS)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((WordPair_Type)jcasType).casFeatCode_Pos1)));}
    
  /** setter for Pos1 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPos1(POS v) {
    if (WordPair_Type.featOkTst && ((WordPair_Type)jcasType).casFeat_Pos1 == null)
      jcasType.jcas.throwFeatMissing("Pos1", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    jcasType.ll_cas.ll_setRefValue(addr, ((WordPair_Type)jcasType).casFeatCode_Pos1, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Pos2

  /** getter for Pos2 - gets 
   * @generated
   * @return value of the feature 
   */
  public POS getPos2() {
    if (WordPair_Type.featOkTst && ((WordPair_Type)jcasType).casFeat_Pos2 == null)
      jcasType.jcas.throwFeatMissing("Pos2", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    return (POS)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((WordPair_Type)jcasType).casFeatCode_Pos2)));}
    
  /** setter for Pos2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPos2(POS v) {
    if (WordPair_Type.featOkTst && ((WordPair_Type)jcasType).casFeat_Pos2 == null)
      jcasType.jcas.throwFeatMissing("Pos2", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    jcasType.ll_cas.ll_setRefValue(addr, ((WordPair_Type)jcasType).casFeatCode_Pos2, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Token1

  /** getter for Token1 - gets 
   * @generated
   * @return value of the feature 
   */
  public Token getToken1() {
    if (WordPair_Type.featOkTst && ((WordPair_Type)jcasType).casFeat_Token1 == null)
      jcasType.jcas.throwFeatMissing("Token1", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((WordPair_Type)jcasType).casFeatCode_Token1)));}
    
  /** setter for Token1 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setToken1(Token v) {
    if (WordPair_Type.featOkTst && ((WordPair_Type)jcasType).casFeat_Token1 == null)
      jcasType.jcas.throwFeatMissing("Token1", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    jcasType.ll_cas.ll_setRefValue(addr, ((WordPair_Type)jcasType).casFeatCode_Token1, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Token2

  /** getter for Token2 - gets 
   * @generated
   * @return value of the feature 
   */
  public Token getToken2() {
    if (WordPair_Type.featOkTst && ((WordPair_Type)jcasType).casFeat_Token2 == null)
      jcasType.jcas.throwFeatMissing("Token2", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((WordPair_Type)jcasType).casFeatCode_Token2)));}
    
  /** setter for Token2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setToken2(Token v) {
    if (WordPair_Type.featOkTst && ((WordPair_Type)jcasType).casFeat_Token2 == null)
      jcasType.jcas.throwFeatMissing("Token2", "org.dkpro.keyphrases.type.textgraphs.WordPair");
    jcasType.ll_cas.ll_setRefValue(addr, ((WordPair_Type)jcasType).casFeatCode_Token2, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    