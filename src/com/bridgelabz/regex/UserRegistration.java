package com.bridgelabz.regex;

import java.util.Scanner;

import utility.UtilRegex;
import utility.UtilValidation;

public class UserRegistration {

	public static void main(String[] args) {
		String firstName, lastName, email;

		System.out.println("Welcome to User Registration program");
		
		System.out.println("Enter First Name : ");
		Scanner sc = new Scanner(System.in);
		firstName = sc.next();
		
		if(!UtilValidation.checkRegex(firstName, UtilRegex.name)) {
			System.out.println("Please enter a valid name.");
		}
		
		System.out.println("Enter Last Name : ");
		lastName = sc.next();
		
		if(!UtilValidation.checkRegex(lastName, UtilRegex.name)) {
			System.out.println("Please enter a valid name.");
		}
		
		System.out.println("Enter email : ");
		email = sc.next();
		
		if(!UtilValidation.checkRegex(email, UtilRegex.email)) {
			System.out.println("Please enter a email.");
		}
	}
}
