package org.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.example.bean.Note;

public class ListNotes {
	private List<Note> allNotes = new ArrayList<>();
	
	public boolean addNote(Note note) {
		allNotes.add(note);
		return allNotes.contains(note);		
	}

	public boolean deleteNote(Note note) {
		return allNotes.remove(note);
	}
	
	public List<Note> getNotes() {		
		return allNotes;		
	}
	
}
