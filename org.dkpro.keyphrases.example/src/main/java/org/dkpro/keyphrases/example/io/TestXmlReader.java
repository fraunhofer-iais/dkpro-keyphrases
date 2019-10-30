package org.dkpro.keyphrases.example.io;

import java.io.BufferedInputStream;
import java.io.IOException;

import org.apache.uima.collection.CollectionException;
import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.jcas.JCas;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.jaxen.JaxenException;
import org.jaxen.XPath;
import org.jaxen.dom4j.Dom4jXPath;

import de.tudarmstadt.ukp.dkpro.core.api.io.JCasResourceCollectionReader_ImplBase;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Lemma;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;

public class TestXmlReader
	extends JCasResourceCollectionReader_ImplBase
{

    public static final String PARAM_XPATH = "//*";
    @ConfigurationParameter(name = PARAM_XPATH, mandatory = false)
    private String xpath;

	protected Resource res;

	@Override
	public void getNext(JCas jcas)
			throws IOException, CollectionException
	{    
		res = nextFile();
		initCas(jcas, res);
		

		Element root;
		try {
			
			SAXReader reader = new SAXReader();
			Document document = reader.read(new BufferedInputStream(res.getInputStream()));
			root = document.getRootElement();
			jcas.setDocumentText(getText(root, xpath));
			
		
		}
		catch (DocumentException e) {
			throw new CollectionException(e);
		}
		catch (IOException e) {
			throw new CollectionException(e);
		} catch (JaxenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		String text = "";

//		try {  
//			final XPath bodyXP = new Dom4jXPath("//");
//
//			text = getText((Element) bodyXP.selectSingleNode(root), "descendant::body");
//
//			final XPath criteriumXP = new Dom4jXPath("//criterium");
//			for (Object criteriumElement : criteriumXP.selectNodes(root)) {
//				Element criteriumNode = (Element) criteriumElement;
//
//				String name = getAttributeValue(criteriumNode, "name");
//
//				
//			}
			
			/*jcas.setDocumentText("dummy text");
			
			Lemma lemma = new Lemma(jcas, 0, 1);
			lemma.setValue("keyphrase 1");
			lemma.addToIndexes();
				*/
//		}
//		catch (JaxenException e) {
//			throw new CollectionException(e);
//		}

	}
	
	private String getAttributeValue(Element e, String name) {
	    for (Object o : e.attributes()) {
	        Attribute attribute = (Attribute) o;  
	        if (name.equals(attribute.getName())) {
	            return attribute.getValue();
	        }
	    }
	    return null;
	}
	
	private String getText(Element root, String xPath)
	        throws JaxenException
	{
	    final XPath xp = new Dom4jXPath(xPath);
	    StringBuilder text = new StringBuilder();
	    for (Object element : xp.selectNodes(root)) {
	        if (element instanceof Element) {
	            Element node = (Element) element;
	            text.append(node.getText());
	        }
	    }
	    return text.toString();
	}
}
