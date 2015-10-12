package com.cisc181.core;

import java.io.*;

public class PersonException extends Exception{
	
	private Person person;

	public PersonException(String string) {
		// TODO Auto-generated constructor stub
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
}
