package com.ws.java.entrenamiento;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.ws.java.entrenamiento.services.LoginRepository;
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
			new LoginRepository().loadUsers();
			RequestLogin user = new RequestLogin();
			user.setUser("judfdfan0618");
			user.setPassword("123");
			LoginService lo = new LoginService();
			UserResponse loginresponse = lo.validateUser(user);
			assertEquals(loginresponse.getStatus(),"Error");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	
	@Test
	public void validateUserExistTest() throws Exception {
		try {
			new LoginRepository().loadUsers();
			RequestLogin user = new RequestLogin();
			user.setUser("juan0618");
			user.setPassword("123");
			LoginService lo = new LoginService();
			UserResponse loginresponse = lo.validateUser(user);
			assertEquals(loginresponse.getStatus(),"OK");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void validateUserExistPasswordNot() throws Exception{
		try {
			new LoginRepository().loadUsers();
			RequestLogin user = new RequestLogin();
			user.setUser("juan0618");
			user.setPassword("3443");
			LoginService lo = new LoginService();
			UserResponse loginresponse = lo.validateUser(user);
			assertEquals(loginresponse.getStatus(),"Invalid");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	
	
	
}

