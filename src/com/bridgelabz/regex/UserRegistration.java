package com.bridgelabz.regex;

import java.util.Scanner;

import utility.UtilRegex;
import utility.UtilValidation;

public class UserRegistration {

	public static void main(String[] args) {
		String firstName, lastName, email, mobileNumber, password;
//
//		System.out.println("Welcome to User Registration program");
//		
//		System.out.println("Enter First Name : ");
//		Scanner sc = new Scanner(System.in);
//		firstName = sc.next();
//		
//		if(!UtilValidation.checkRegex(firstName, UtilRegex.name)) {
//			System.out.println("Please enter a valid name.");
//		}
//		
//		System.out.println("Enter Last Name : ");
//		Scanner sc1 = new Scanner(System.in);
//		lastName = sc1.next();
//		
//		if(!UtilValidation.checkRegex(lastName, UtilRegex.name)) {
//			System.out.println("Please enter a valid name.");
//		}
//		
//		System.out.println("Enter email : ");
//		Scanner sc2 = new Scanner(System.in);
//		email = sc2.next();
//		
//		if(!UtilValidation.checkRegex(email, UtilRegex.email)) {
//			System.out.println("Please enter a email.");
//		}
//		
//		System.out.println("Enter mobile number : ");
//		Scanner sc3 = new Scanner(System.in);
//		mobileNumber = sc3.nextLine();
//		
//		if(!UtilValidation.checkRegex(mobileNumber, UtilRegex.mobileNumber)) {
//			System.out.println("Please enter a valid mobile number.");
//		}
//		
		System.out.println("Enter password : ");
		Scanner sc4 = new Scanner(System.in);
		password = sc4.next();
		
		if(!UtilValidation.checkRegex(password, UtilRegex.password)) {
			System.out.println("Please enter a valid password.");
		}
	}
}
