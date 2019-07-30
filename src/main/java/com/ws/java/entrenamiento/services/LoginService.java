package com.ws.java.entrenamiento.services;


import java.io.FileReader;
import java.io.Serializable;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;

import com.ws.java.entrenamiento.exceptions.LoginException;
import com.ws.java.entrenamiento.models.RequestLogin;
import com.ws.java.entrenamiento.models.StatusUser;
import com.ws.java.entrenamiento.models.UserResponse;
import com.ws.java.singleton.LoginSingleton;


/**
 * In this file we are bringing the info from a json file 
 * @author JUANCARLOSHERNANDEZH
 * @since 26/07/2019
 * @category Service
 */
@Service
public class LoginService implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -3410421951691119793L;


	/**
	 * 
	 * @param user
	 * @return
	 * @throws LoginException
	 */
	public UserResponse validateUser(RequestLogin user) throws LoginException {
		UserResponse respuesta = new UserResponse();
		try {
			if(LoginSingleton.getInstance().getUserMap().containsKey(user.getUser())) {
				UserResponse userMap =  LoginSingleton.getInstance().getUserMap().get(user.getUser());
				if(user.getPassword().equals(userMap.getPassword())) {
					respuesta = userMap;
					respuesta.setStatusUser(StatusUser.ACTIVE.name());
					respuesta.setStatus("OK");
				}else {
					respuesta.setMessage("Usuario y/ password inválidos");
				}
			}else {
				respuesta.setMessage("Usuario y/ password inválidos");
			}
			System.out.println("User: " + user.getUser());
			System.out.println("Password: " + user.getPassword());	
			return respuesta;
		} catch (Exception ex) {
			respuesta.setMessage(ex.getMessage());
			return respuesta;
		}
	}
}