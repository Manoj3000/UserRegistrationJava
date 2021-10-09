package com.bridgelabz.regex;

import java.util.Scanner;

import utility.UtilRegex;
import utility.UtilValidation;

public class UserRegistration {

	public static void main(String[] args) throws InvalidException {
		String inputFirstName, inputLastName, inputEmail, inputMobileNumber, inputPassword;

		String[] email1 = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" };
		String[] email2 = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com",
				"abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com",
				"abc@gmail.com.1a", "abc@gmail.com.aa.au" };
		
		System.out.println("Welcome to User Registration program");

		IValidator firstNameValidator = (String fname) -> {
			if (!UtilValidation.checkRegex(fname, UtilRegex.name)) {
				throw new InvalidException("Please enter a valid first name");
			}			
		};
		
		IValidator lastNameValidator = (String lname) -> {
			if (!UtilValidation.checkRegex(lname, UtilRegex.name)) {
				throw new InvalidException("Please enter a valid last name");
			}			
		};

		IValidator emailValidator = (String email) -> {
			if (!UtilValidation.checkRegex(email, UtilRegex.email)) {
				throw new InvalidException("Please enter a valid email");
			}			
		};
		
		IValidator mobileNumberValidator = (String mobileNumber) -> {
			if (!UtilValidation.checkRegex(mobileNumber, UtilRegex.mobileNumber)) {
				throw new InvalidException("Please enter a valid mobile number");
			}			
		};

		IValidator passwordValidator = (String password) -> {
			if (!UtilValidation.checkRegex(password, UtilRegex.password)) {
				throw new InvalidException("Please enter a valid password");
			}			
		};
		
		System.out.println("Enter First Name : ");
		Scanner sc = new Scanner(System.in);
		inputFirstName = sc.next();
		firstNameValidator.validator(inputFirstName);
		
		System.out.println("Enter Last Name : ");
		Scanner sc1 = new Scanner(System.in);
		inputLastName = sc1.next();
		lastNameValidator.validator(inputLastName);
		
		System.out.println("Enter email : ");
		Scanner sc2 = new Scanner(System.in);
		inputEmail = sc2.next();
		emailValidator.validator(inputEmail);
		
		System.out.println("Enter mobile number : ");
		Scanner sc3 = new Scanner(System.in);
		inputMobileNumber = sc3.nextLine();
		mobileNumberValidator.validator(inputMobileNumber);
		
		System.out.println("Enter password : ");
		Scanner sc4 = new Scanner(System.in);
		inputPassword = sc4.next();
		passwordValidator.validator(inputPassword);

		checkEmails(email1);
		checkEmails(email2);
	}

	static void checkEmails(String[] emails) {
		for(String email : emails) {
			if (UtilValidation.checkRegex(email, UtilRegex.email)) {
				System.out.println("valid -> " +email);
			}else {
				System.out.println("Not valid -> " +email);
			}			
		}
		System.out.println("");
	}
}
