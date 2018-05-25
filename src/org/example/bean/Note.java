package org.example.bean;

import java.util.Date;

public class Note {
	private int id;
	private String description;
	private Date timeofbegin;
	private double duration;
	
	public Note() {
		super();
	}

	public Note(int id, String description, Date timeofbegin, double duration) {
		super();
		this.id = id;
		this.description = description;
		this.timeofbegin = timeofbegin;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

}
