package com.ws.java.entrenamiento.services;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.ws.java.entrenamiento.models.ConsultaModel;

public class ConsultaService {

	public ConsultaModel validateUser(ConsultaModel userid) {
		ConsultaModel respuesta = new ConsultaModel();
		respuesta.setMessage("User Not Found");
			try {		
				JSONParser parser = new JSONParser();			
				Object obj = parser.parse(new FileReader("C:\\Users\\JUANCARLOSHERNANDEZH\\Desktop\\informacion.json"));				
				JSONObject jsonObject = (JSONObject) obj;
			    JSONArray listUsers =  (JSONArray) jsonObject.get("usuarios");
			    
			    listUsers.get(1);
				
			   for (int i = 0; i < listUsers.size(); i++) {	
				   
				jsonObject = (JSONObject) listUsers.get(i);   
				if (userid.getUserid().equals(jsonObject.get("userid").toString())) {
					respuesta.setUserid(jsonObject.get("userid").toString());
					respuesta.setNombre(jsonObject.get("name").toString());
					respuesta.setId(jsonObject.get("id").toString());
					respuesta.setIp(jsonObject.get("ip").toString());
					respuesta.setCapagna(jsonObject.get("campagna").toString());
					respuesta.setFecha(jsonObject.get("fecha").toString());
					respuesta.setMessage("User Valid");
					System.out.println("User: " + userid.getUserid());
				}
		    }
				
			return respuesta;
			
		} catch (Exception ex) {
			
			return respuesta;
		
	}
}
}

