package com.ws.java.entrenamiento;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.ws.java.entrenamiento.services.LoginService;
import com.ws.java.entrenamiento.models.LoginModel;

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
	public void validateUserTest() throws Exception {
		
		
		LoginModel user = new LoginModel();
		
		user.setUser("juan0618");
		user.setPassword("123");
		
		LoginService lo = new LoginService();
		
		LoginModel loginresponse = lo.validateUser(user); //new LoginController();
			System.out.println("Primer Escenario de Prueba");
			System.out.println(loginresponse.getLastAccess());
			System.out.println(loginresponse.getName());
			assertEquals("19/07/2019",loginresponse.getLastAccess());
		
	}
	
	@Test
	public void validateUserTestWrong() throws Exception {
		
		LoginModel user = new LoginModel();
		
		user.setUser("dsfgsdg32");
		user.setPassword("fg3235");
		
		LoginService lo = new LoginService();
		
		LoginModel loginresponse = lo.validateUser(user); //new LoginController();
			System.out.println("Segundo Escenario de Prueba");
			System.out.println(loginresponse.getStatus());
			assertEquals("Invalid User",loginresponse.getStatus());
			
	}
	
}

