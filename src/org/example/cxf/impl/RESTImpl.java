package org.example.cxf.impl;

import org.example.cxf.interfaces.REST;

public class RESTImpl implements REST {

	@Override
	public String echo() {
		return "Echo! Just echo!";
	}

	@Override
	public String get(String action, int idUser) {
		return "Get!!! + ' ' + action + ' ' + idUser";
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
