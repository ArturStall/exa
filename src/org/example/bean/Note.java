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

	public Note(int id, String description, Date timeofbegin, double duration, Person owner, boolean active, boolean resolved) {
		super();
		this.id = id;
		this.description = description;
		this.timeofbegin = timeofbegin;
		this.duration = duration;
		this.owner = owner;
		this.listofMembers = new LinkedList<>();
		this.active = active;
		this.resolved = resolved;
	}

	

}
