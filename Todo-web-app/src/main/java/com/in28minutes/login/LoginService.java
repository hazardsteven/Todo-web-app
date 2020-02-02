package com.in28minutes.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("Name") && password.equals("Password")) {
			return true;
		}
		return false;
	}
}
