/**
 * 
 */
package com.ws.java.entrenamiento.services;

import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.ws.java.entrenamiento.models.UserResponse;
import com.ws.java.singleton.LoginSingleton;

/**
 *
 * @author JUANCARLOSHERNANDEZH
 * @since 30/07/2019
 */
@Service
public class LoginRepository implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3213442757453213955L;

	
	
	public void loadUsers() {
		JSONParser parser = new JSONParser();			
		Object obj;
		try {
			obj = parser.parse(new FileReader("C:\\Gitflow\\ws-java-training\\usuarios.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray listUsers =  (JSONArray) jsonObject.get("usuarios");

			for (int i = 0; i < listUsers.size(); i++) {	
				UserResponse user = new Gson().fromJson(listUsers.get(i).toString(), UserResponse.class);   
				LoginSingleton.getInstance().getUserMap().put(user.getUser(), user);  		
			}

		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	
	
	
}
