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

	public static void main(String[] args) {
		
		validateFirstName();
	}
}
		