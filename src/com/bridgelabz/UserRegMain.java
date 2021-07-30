package com.bridgelabz;

public class UserRegMain {
	public static void main(String[] args) {
		UserRegistrationImpl reg = new UserRegistrationImpl();
		reg.firstNameValidate();
		reg.lastNameValidate();
		reg.emailValidate();
		reg.mobileValidate();
		reg.passwordValidate();
	}

}
