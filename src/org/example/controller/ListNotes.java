package org.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.example.bean.Note;

public class ListNotes {
	private static List<Note> allNotes = new ArrayList<>();
	
	public static boolean addNote(Note note) {
		allNotes.add(note);
		return allNotes.contains(note);		
	}

	public static boolean deleteNote(Note note) {
		return allNotes.remove(note);
	}
	
	public static List<Note> getNotes() {		
		return allNotes;		
	}
	
}
