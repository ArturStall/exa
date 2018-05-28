package org.example.cxf.impl;

import javax.ws.rs.PathParam;

import org.example.cxf.interfaces.REST;

public class RESTImpl implements REST {

	@Override
	public String echo() {
		return "Echo! Just echo!";
	}

	@Override
	public String get(String action, int idUser) {
		String message = new String(action);
		return message;
	}

	@Override
	public void add() {
				
	}

	@Override
	public void replace() {
				
	}

	@Override
	public void delete() {
				
	}

}
