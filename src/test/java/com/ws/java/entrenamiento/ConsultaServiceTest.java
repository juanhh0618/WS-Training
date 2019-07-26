package com.ws.java.entrenamiento;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.ws.java.entrenamiento.services.ConsultaService;
import com.ws.java.entrenamiento.models.ConsultaModel;

public class ConsultaServiceTest {
	
	@Test
	public void validateUserTest() throws Exception {
		
		
		ConsultaModel user = new ConsultaModel();
		
		user.setUserid("juan0618");
		
		
		ConsultaService co = new ConsultaService();
		
		ConsultaModel consultaresponse = co.validateUser(user); //new LoginController();
			System.out.println("Primer Escenario de Prueba");
			System.out.println(consultaresponse.getId());
			System.out.println(consultaresponse.getNombre());
			assertEquals("16108199",consultaresponse.getId());
		
	}
	
	@Test
	public void validateUserTestWrong() throws Exception {
		
		ConsultaModel user = new ConsultaModel();
		
		user.setUserid("dsfgsdg32");
		
		
		ConsultaService co = new ConsultaService();
		
		ConsultaModel consultaresponse = co.validateUser(user); //new LoginController();
			System.out.println("Segundo Escenario de Prueba");
			System.out.println(consultaresponse.getMessage());
			assertEquals("User Not Found",consultaresponse.getMessage());
			
	}
	
}