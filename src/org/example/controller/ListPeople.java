package org.example.controller;

import java.util.LinkedList;
import java.util.List;

import org.example.bean.Person;

public class ListPeople {
	private static List<Person> allPeople = new LinkedList<>();	

	public static String addPerson(Person person) {
		String result = null;
		if (checkLogin(person.getLogin())) {
			result = "Sorry, this login is already in use!";
		} else {
			allPeople.add(person);
			result = "Succesful!";
		}
		return result;
	}

	public static boolean deletePerson(Person person) {
		return allPeople.remove(person);
	}
	
	private static boolean checkLogin(String login) {
		boolean result = false;
		for (Person person: allPeople) {
			if (person.getLogin().equals(login)) {
				result = true;
			} else 
				result = false;
		}
		return result;
	}
}
