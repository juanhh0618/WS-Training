package com.ws.java.entrenamiento.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.io.FileReader;
import com.ws.java.entrenamiento.models.ConsultaModel;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



@RestController //Le decimos que es un rest controller
@RequestMapping(path = "/consultaInfo/service") //Ruta para encontrar el servicio
public class ConsultaController {

	@RequestMapping(
			method = RequestMethod.GET, //indicamos que el servicio es POST
			path = "/validateUser", //Ruta del metodo
			consumes = "application/json", //Indicamos que recibe json
			produces = "application/json") //Indicamos que produce json
			//consumes = "application/xml",
			//produces = "application/xml")
	public @ResponseBody ConsultaModel validateUser(@RequestBody ConsultaModel user) throws Exception {
		ConsultaModel response = new ConsultaModel();
		
		response.setMessage("Invalid User");
		System.out.println("User: " + user.getUserid());
		
		
		
		try {		
				JSONParser parser = new JSONParser();			
				Object obj = parser.parse(new FileReader("C:\\Users\\JUANCARLOSHERNANDEZH\\Desktop\\informacion.json"));				
				JSONObject jsonObject = (JSONObject) obj;
			    JSONArray listUsers =  (JSONArray) jsonObject.get("usuarios");
			    
			    listUsers.get(1);
				
			   for (int i = 0; i < listUsers.size(); i++) {	
				   
				jsonObject = (JSONObject) listUsers.get(i);   
				if (user.getUserid().equals(jsonObject.get("userid").toString())) {
				response.setUserid(jsonObject.get("userid").toString());
				response.setNombre(jsonObject.get("name").toString());
				response.setId(jsonObject.get("id").toString());
				response.setIp(jsonObject.get("ip").toString());
				response.setCapagna(jsonObject.get("campagna").toString());
				response.setFecha(jsonObject.get("fecha").toString());
				response.setMessage("User Valid");
				
				}
		    }
				
			return response;
			
		} catch (Exception ex) {
			
			return response;
		}
	}

}
