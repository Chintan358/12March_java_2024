package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	
	public static boolean emailValidation(String email){
		
		 String regex = "^[a-zA-Z0-9_-]+@[a-z]+\\.[a-z]{2,4}$";
		 Pattern pattern = Pattern.compile(regex);
		
		 Matcher matcher = pattern.matcher(email);
		 
		 boolean matches = matcher.matches();
		 return matches;
	}
	
	
}
