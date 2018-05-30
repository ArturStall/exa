package org.example.cxf.impl;

import java.io.StringReader;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Result;

import org.example.bean.Note;
import org.example.bean.Person;
import org.example.constants.Actions;
import org.example.controller.ListNotes;
import org.example.controller.ListPeople;
import org.example.cxf.interfaces.REST;

public class RESTImpl implements REST {

	@Override
	public String echo() {
		return "Echo! Just echo!";
	}

	@Override
	public String addUser(String body) {
		String result = null;
		try {
			JAXBContext context = JAXBContext.newInstance(Person.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Person person = (Person) unmarshaller.unmarshal(new StringReader(body));
			String firstName = person.getFirstName();
			String lastName = person.getLastName();
			String login = person.getLogin();
			String password = person.getPassword();
			result = ListPeople.addPerson(new Person(firstName, lastName, login, password));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String get(String action, String idOwner) {
		Result notes = null;
		if (action.toUpperCase().equals(Actions.GETNOTES.toString())) {
			try {
				JAXBContext jaxbContext = JAXBContext.newInstance(ListNotes.class);
				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				jaxbMarshaller.marshal(ListNotes.getUserNotes(idOwner), notes);				
			} catch (JAXBException e) {				
				e.printStackTrace();
			}
		}
		return notes.toString();
	}

	@Override
	public boolean add(String body, String action, String idUser) {
		boolean result = false;
		if (action.toUpperCase().equals(Actions.ADDNOTE.toString())) {
			try {
				JAXBContext context = JAXBContext.newInstance(Note.class);
				Unmarshaller unmarshaller = context.createUnmarshaller();
				Note note = (Note) unmarshaller.unmarshal(new StringReader(body));
				String description = note.getDescription();
				Date timeOfBegin = note.getTimeofbegin();
				result = ListNotes.addNote(new Note(description, timeOfBegin, idUser));
			} catch (JAXBException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
