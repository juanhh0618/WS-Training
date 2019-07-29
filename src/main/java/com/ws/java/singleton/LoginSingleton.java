package com.ws.java.singleton;

public class LoginSingleton {

	private LoginSingleton() {
		
	}
	
	private static LoginSingleton instance = null;
	
	public static LoginSingleton getInstance() {
	      if(instance == null) {
	         instance = new LoginSingleton();
	      }
	      return instance;
	   }
}