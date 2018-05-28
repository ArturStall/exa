package org.example.bean;

import java.util.Date;
import java.util.LinkedList;

public class Note {
	private int id;
	private String description;
	private Date timeofbegin;
	private double duration;
	private Person owner;
	private LinkedList<Person> listofMembers;
	private boolean active;
	private boolean resolved;
	
	public Note() {
		super();
	}

	

}
