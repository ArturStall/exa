package org.example.controller;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.example.bean.Note;

@XmlRootElement(name = "notes")
public class ListNotes {
	@XmlElement(name = "note")
	private static List<Note> allNotes = new ArrayList<>();
	
	public static boolean addNote(Note note) {
		allNotes.add(note);
		return allNotes.contains(note);		
	}

	public static boolean deleteNote(Note note) {
		return allNotes.remove(note);
	}
	
	public static List<Note> getUserNotes(String idOwner) {
		ArrayList<Note> notesOfCurrentOwner = new ArrayList<>();
		for (Note note: allNotes) {
			if (note.getIdOwner().equals(idOwner)) {
				notesOfCurrentOwner.add(note);
			}
		}
		return notesOfCurrentOwner;
	}
	
}
