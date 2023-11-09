package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	String firstname = "Michael";
	String lastname = "Mantovani";
	String favColor = "Rosso";
	int birthDay = 13;
	int birthMonth = 9;
	int birthYear = 1998;
	
//	Sommo i valori di giorno, mese e anno del compleanno dell'utente
	int birthdaySum = birthDay + birthMonth + birthYear; 
	
//	Compongo la password
	String password = firstname + "-" + lastname + "-" + favColor.toLowerCase() + "-" + birthdaySum;
	
// Stampo la password
	System.out.println(password); 
			
}
}
