package com.ws.java.entrenamiento;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import com.ws.java.entrenamiento.services.LoginService;
import com.ws.java.entrenamiento.models.RequestLogin;
import com.ws.java.entrenamiento.models.UserResponse;

/**
 * 
 * @author JUANCARLOSHERNANDEZH
 * @since 26/07/2019
 * @category Test
 * In this file we are testing the ConsultaModel class and his method
 * And we are giving two testing cases
 */
public class LoginServiceTest {
	
	
	
	@Test
	public void validateUserNoExistTest() throws Exception {
		try {
			RequestLogin user = new RequestLogin();
			user.setUser("judfdfan0618");
			user.setPassword("123");
			LoginService lo = new LoginService();
			UserResponse loginresponse = lo.validateUser(user);
			assertEquals(loginresponse.getStatus(),"ERROR");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	
	@Test
	public void validateUserExistTest() throws Exception {
		RequestLogin user = new RequestLogin();
		user.setUser("judfdfan18");
		user.setPassword("123");
		LoginService lo = new LoginService();
		UserResponse loginresponse = lo.validateUser(user);
		assertEquals(loginresponse.getStatus(),"OK");
	}
	
	
	@Test
	public void validateUserTest() throws Exception {
		RequestLogin user = new RequestLogin();
		user.setUser("juan0618");
		user.setPassword("123");
		LoginService lo = new LoginService();
		UserResponse loginresponse = lo.validateUser(user); //new LoginController();
		System.out.println("Primer Escenario de Prueba");
		System.out.println(loginresponse.getLastAccess());
		System.out.println(loginresponse.getName());
		assertEquals("19/07/2019",loginresponse.getLastAccess());
	}
	
	@Test
	public void validateUserTestWrong() throws Exception {
		
		RequestLogin user = new RequestLogin();
		
		user.setUser("dsfgsdg32");
		user.setPassword("fg3235");
		
		LoginService lo = new LoginService();
		
		UserResponse loginresponse = lo.validateUser(user); //new LoginController();
			System.out.println("Segundo Escenario de Prueba");
			System.out.println(loginresponse.getStatus());
			assertEquals("Invalid User",loginresponse.getStatus());
			
	}
	
}

