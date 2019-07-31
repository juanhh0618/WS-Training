package com.ws.java.entrenamiento.services;

import java.io.Serializable;

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
			//UserResponse userMap =  LoginSingleton.getInstance().getUserMap().get(user.getUser());
			if(LoginSingleton.getInstance().getUserMap().containsKey(user.getUser())) {
				 UserResponse userMap =  LoginSingleton.getInstance().getUserMap().get(user.getUser());
				if(user.getPassword().equals(userMap.getPassword())) {
					
					respuesta = userMap;
					respuesta.setStatusUser(StatusUser.ACTIVE.name());
					respuesta.setStatus("OK");
					respuesta.setMessage("El usuario ha ingresado correctamente");
				}else {
					respuesta.setStatus("Invalid");
					
				}
			}else {
				respuesta.setStatus("Error");
				
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