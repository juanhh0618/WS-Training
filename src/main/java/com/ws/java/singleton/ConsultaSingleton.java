package com.ws.java.singleton;

public class ConsultaSingleton {

	private ConsultaSingleton() {
		
	}
	
	private static ConsultaSingleton instance = null;
	
	public static ConsultaSingleton getInstance() {
	      if(instance == null) {
	         instance = new ConsultaSingleton();
	      }
	      return instance;
	   }
}
