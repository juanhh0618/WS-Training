package com.ws.java.singleton;

import java.util.HashMap;

import com.ws.java.entrenamiento.models.ConsultaResponse;

public class ConsultaSingleton {

	
	
	private ConsultaSingleton() {
		userMap = new HashMap<String, ConsultaResponse>();
	}

	private static ConsultaSingleton instance = null;

	/**
	 * Mapa para almacenar la información del sistema en cache key = user = value {@link UserResponse}
	 */
	private HashMap<String, ConsultaResponse> userMap = null;
	
	
	
	public static ConsultaSingleton getInstance() {
		if(instance == null) {
			instance = new ConsultaSingleton();
		}
		return instance;
	}



	/**
	 * @return the userMap
	 */
	public HashMap<String, ConsultaResponse> getUserMap() {
		return userMap;
	}



	/**
	 * @param userMap the userMap to set
	 */
	public void setUserMap(HashMap<String, ConsultaResponse> userMap) {
		this.userMap = userMap;
	}


}