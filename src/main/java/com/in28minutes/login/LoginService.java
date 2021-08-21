package com.in28minutes.login;

public class LoginService {
	
	public boolean isUserValid(String user, String password) {
		return user.equalsIgnoreCase("ngome") && password.equals("good");
	}
		
	
}
