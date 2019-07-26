package com.ws.java.entrenamiento.services;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.ws.java.entrenamiento.models.LoginModel;

public class LoginService {

	public LoginModel method(LoginModel user) {
		LoginModel respuesta = new LoginModel();
		
			try {		
				JSONParser parser = new JSONParser();			
				Object obj = parser.parse(new FileReader("C:\\Users\\JUANCARLOSHERNANDEZH\\Desktop\\usuarios.json"));				
				JSONObject jsonObject = (JSONObject) obj;
			    JSONArray listUsers =  (JSONArray) jsonObject.get("usuarios");
			    
			    listUsers.get(1);
				
			   for (int i = 0; i < listUsers.size(); i++) {	
				   
				jsonObject = (JSONObject) listUsers.get(i);   
				if (user.getUser().equals(jsonObject.get("user").toString()) && user.getPassword().equals(jsonObject.get("password"))) {
					respuesta.setUser(jsonObject.get("user").toString());
					respuesta.setName(jsonObject.get("name").toString());
					respuesta.setLastAccess(jsonObject.get("lastAccess").toString());
					respuesta.setStatus(jsonObject.get("status").toString());
					respuesta.setPassword("******");
					System.out.println("User: " + user.getUser());
					System.out.println("Password: " + user.getPassword());				
				}
		    }
				
			return respuesta;
			
		} catch (Exception ex) {
			
			return respuesta;
		
	}
}
}