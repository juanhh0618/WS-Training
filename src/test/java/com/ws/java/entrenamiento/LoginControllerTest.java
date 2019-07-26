package com.ws.java.entrenamiento;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ws.java.entrenamiento.controllers.LoginController;
import com.ws.java.entrenamiento.models.LoginModel;

public class LoginControllerTest {
	
	@Test
	public void validateUserTest() throws Exception {
		
		
		LoginModel user = new LoginModel();
		
		user.setUser("juan0618");
		user.setPassword("123");
		
		LoginController lo = new LoginController();
		
		LoginModel loginresponse = lo.validateUser(user); //new LoginController();
			
			System.out.println(loginresponse.getLastAccess());
			System.out.println(loginresponse.getName());
			assertEquals("19/07/2019",loginresponse.getLastAccess());
		
	}
	
}
