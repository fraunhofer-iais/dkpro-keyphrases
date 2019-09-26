package org.dkpro.keyphrases.example;

import java.io.BufferedInputStream;
import java.io.IOException;

import org.apache.uima.collection.CollectionException;
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

public class TestXmlReader
	extends JCasResourceCollectionReader_ImplBase
{

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
		}
		catch (DocumentException e) {
			throw new CollectionException(e);
		}
		catch (IOException e) {
			throw new CollectionException(e);
		}

		String text = "";

		try {  
			final XPath bodyXP = new Dom4jXPath("//");

			text = getText((Element) bodyXP.selectSingleNode(root), "descendant::body");

			final XPath criteriumXP = new Dom4jXPath("//criterium");
			for (Object criteriumElement : criteriumXP.selectNodes(root)) {
				Element criteriumNode = (Element) criteriumElement;

				String name = getAttributeValue(criteriumNode, "name");

				
			}
			jcas.setDocumentText(text);
				
		}
		catch (JaxenException e) {
			throw new CollectionException(e);
		}

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
	    
	    for (Object element : xp.selectNodes(root)) {
	        if (element instanceof Element) {
	            Element node = (Element) element;
	            return node.getText();
	        }
	    }
	    
	    return null;
	}
}
