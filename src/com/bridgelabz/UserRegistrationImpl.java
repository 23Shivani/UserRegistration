package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationImpl  implements UserRegistration  {
	@Override
	public void firstNameValidate(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first name");
		String name = sc.next();

		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,20}$");
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches()) {
			System.out.println("Given name id is valid");
		} else {
			System.out.println("Given name id is not valid");
		}
		
	sc.close();
	}

}