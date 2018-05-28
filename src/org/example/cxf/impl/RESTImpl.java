package org.example.cxf.impl;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.example.bean.Person;
import org.example.controller.ListPeople;
import org.example.cxf.interfaces.REST;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class RESTImpl implements REST {

	@Override
	public String echo() {
		return "Echo! Just echo!";
	}

	@Override
	public String addUser(String body) {
	    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    Document doc;
	    String firstName = "Bla";
	    String lasstName = null;
	    Person person;
		try {		
			doc = factory.newDocumentBuilder().parse(body);
			firstName = doc.getElementById("1").getNodeValue();
			lasstName = doc.getElementById("2").getNodeValue();
			
		} catch (SAXException | IOException | ParserConfigurationException e) {
			e.printStackTrace();
		}
		person = new Person(firstName, lasstName);
		ListPeople.addPerson(person);
	    return person.toString();
	}	
	
	@Override
	public String get(String action, int idUser) {		
		return action + " " + idUser;
	}

	@Override
	public void add(String body, String action, int idUser) {
				
	}
	
}
