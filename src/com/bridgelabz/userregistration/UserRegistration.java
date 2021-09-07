package com.bridgelabz.userregistration;
import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration {
	static Scanner scanner=new Scanner(System.in);
	
	public static void validateFirstName() {
		System.out.println("Enter first name");
		String firstName=scanner.nextLine();
		
		boolean result = Pattern.matches("^[A-Z][A-Za-z]{2,}$", firstName);
		if(result) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}
	
	public static void validateLasttName() {
		System.out.println("Enter Last name");
		String lastName=scanner.nextLine();
		
		boolean result = Pattern.matches("^[A-Z][A-Za-z]{2,}$", lastName);
		if(result) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}
	
	public static void validateEmail() {
		System.out.println("Enter email id");
		String emailId=scanner.nextLine();
		
		boolean result = Pattern.matches("^[a-zA-Z][a-zA-Z0-9]*[a-zA-Z0-9]([+-_.][a-zA-Z]*)?@[a-zA-Z0-9]*[.][a-z]{2,4}([.][a-zA-z]{2})?$", emailId);
		if(result) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}
	public static void validatePhoneNumber() {
		System.out.println("Enter phone number");
		String phoneNumber=scanner.nextLine();
		
		boolean result = Pattern.matches("^[0-9]{2}[ ][1-9][0-9]{9}$", phoneNumber);
		if(result) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}
	public static void validatePassword() {
		System.out.println("Enter password");
		String password=scanner.nextLine();
		
		boolean result = Pattern.matches("(?=.*[A-Z]).{8,}$", password);
		if(result) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}
	public static void main(String[] args) {
		
	//	validateFirstName();
	//	validateLasttName();
	//	validateEmail();
	//	validatePhoneNumber();
		validatePassword();
	}
}
		