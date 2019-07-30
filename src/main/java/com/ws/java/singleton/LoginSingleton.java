package com.ws.java.singleton;

import java.util.HashMap;

import com.ws.java.entrenamiento.models.UserResponse;

public class LoginSingleton {

	
	
	private LoginSingleton() {
		userMap = new HashMap<String, UserResponse>();
	}

	private static LoginSingleton instance = null;

	/**
	 * Mapa para almacenar la lista de usuarios del sistema en cache key = user = value {@link UserResponse}
	 */
	private HashMap<String, UserResponse> userMap = null;
	
	
	
	public static LoginSingleton getInstance() {
		if(instance == null) {
			instance = new LoginSingleton();
		}
		return instance;
	}



	/**
	 * @return the userMap
	 */
	public HashMap<String, UserResponse> getUserMap() {
		return userMap;
	}



	/**
	 * @param userMap the userMap to set
	 */
	public void setUserMap(HashMap<String, UserResponse> userMap) {
		this.userMap = userMap;
	}


}