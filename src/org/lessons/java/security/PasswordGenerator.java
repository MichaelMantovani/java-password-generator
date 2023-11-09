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
	int birthdaySum = birthDay + birthMonth + birthYear; 
	
	System.out.println(firstname + "-" + lastname + "-" + favColor.toLowerCase() + "-" + birthdaySum );
			
	
	
	
}
}
