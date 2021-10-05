package com.bridgelabz.regex;

import java.util.Scanner;

import utility.UtilRegex;
import utility.UtilValidation;

public class UserRegistration {

	public static void main(String[] args) {
		String firstName;

		System.out.println("Welcome to User Registration program");
		
		System.out.println("Enter First Name : ");
		Scanner sc = new Scanner(System.in);
		firstName = sc.next();
		
		if(!UtilValidation.checkRegex(firstName, UtilRegex.firstName)) {
			System.out.println("Please enter a valid name.");
		}
	}
}
