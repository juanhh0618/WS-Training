package com.ws.java.entrenamiento.services;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import com.ws.java.entrenamiento.exceptions.ConsultaException;
import com.ws.java.entrenamiento.models.RequestConsulta;
import com.ws.java.entrenamiento.models.StatusUser;
import com.ws.java.entrenamiento.models.ConsultaResponse;
import com.ws.java.singleton.ConsultaSingleton;


/**
 * In this file we are bringing the info from a json file 
 * @author JUANCARLOSHERNANDEZH
 * @since 26/07/2019
 * @category Service
 */
@Service
public class ConsultaService implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -3410421951691119793L;


	/**
	 * 
	 * @param user
	 * @return
	 * @throws ConsultaException
	 */
	public ConsultaResponse validateUser(RequestConsulta user) throws ConsultaException {
		ConsultaResponse respuesta = new ConsultaResponse();
		try {
			
			
			if(ConsultaSingleton.getInstance().getUserMap().containsKey(user.getUser())) {
				ConsultaResponse userMap =  ConsultaSingleton.getInstance().getUserMap().get(user.getUser());
					respuesta = userMap;
					respuesta.setStatusUser(StatusUser.FOUND.name());
					respuesta.setStatus("OK");
					respuesta.setMessage("Usuario Encontrado");
				}else {
					respuesta.setMessage("Usuario no encontrado");
					
				}
			System.out.println("User: " + user.getUser());
	
			
			return respuesta;
		} catch (Exception ex) {
			respuesta.setMessage(ex.getMessage());
			return respuesta;
		}
	}
}