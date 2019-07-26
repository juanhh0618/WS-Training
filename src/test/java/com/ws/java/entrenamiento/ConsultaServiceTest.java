package com.ws.java.entrenamiento;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.ws.java.entrenamiento.services.ConsultaService;
import com.ws.java.entrenamiento.models.ConsultaModel;

/**
 * 
 * @author JUANCARLOSHERNANDEZH
 * @since 26/07/2019
 * @category Test
 * In this file we are testing the ConsultaModel class and his method
 * And we are giving two testing cases
 */
public class ConsultaServiceTest {
	
	@Test
	public void validateUserTest() throws Exception {
		
		
		ConsultaModel user = new ConsultaModel();
		
		user.setUserid("juan0618");
		
		
		ConsultaService co = new ConsultaService();
		
		ConsultaModel consultaresponse = co.validateUser(user);
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
		
		ConsultaModel consultaresponse = co.validateUser(user);
			System.out.println("Segundo Escenario de Prueba");
			System.out.println(consultaresponse.getMessage());
			assertEquals("User Not Found",consultaresponse.getMessage());
			
	}
	
}