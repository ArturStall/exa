package org.example.controller;

import java.util.LinkedList;
import java.util.List;

import org.example.bean.Person;

public class ListPeople {
	private static List<Person> allPeople = new LinkedList<>();	

	public static boolean addPerson(Person person) {
		allPeople.add(person);
		return allPeople.contains(person);
	}

	public static boolean deletePerson(Person person) {
		return allPeople.remove(person);
	}

	public static List<Person> getPeople() {
		return allPeople;
	}

}
