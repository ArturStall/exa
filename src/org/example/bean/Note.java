package org.example.bean;

import java.util.Date;
import java.util.LinkedList;
import java.util.UUID;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "note")
public class Note {
	private String id;
	private String description;
	private Date timeofbegin;
	private double duration;	
	private String idOwner;
	private LinkedList<Person> listofMembers;
	private boolean active;
	private boolean resolved;
	
	public Note() {
		super();
	}

	public Note(String description, Date timeofbegin, String idOwner) {
		super();
		this.id = UUID.randomUUID().toString();;
		this.description = description;
		this.timeofbegin = timeofbegin;
		this.idOwner = idOwner;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTimeofbegin() {
		return timeofbegin;
	}

	public void setTimeofbegin(Date timeofbegin) {
		this.timeofbegin = timeofbegin;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getIdOwner() {
		return idOwner;
	}

	public String getId() {
		return id;
	}	
}
