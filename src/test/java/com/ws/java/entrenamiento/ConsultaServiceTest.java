package com.ws.java.entrenamiento;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.ws.java.entrenamiento.services.ConsultaRepository;
import com.ws.java.entrenamiento.services.ConsultaService;
import com.ws.java.entrenamiento.models.RequestConsulta;
import com.ws.java.entrenamiento.models.ConsultaResponse;

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
	public void validateUserNoExistTest() throws Exception {
		try {
			new ConsultaRepository().loadInfo();
			RequestConsulta user = new RequestConsulta();
			user.setUser("judfdfan0618");
			ConsultaService co = new ConsultaService();
			ConsultaResponse consultaresponse = co.validateUser(user);
			assertEquals(consultaresponse.getStatus(),"ERROR");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	
	@Test
	public void validateUserExistTest() throws Exception {
		try {
			new ConsultaRepository().loadInfo();
			RequestConsulta user = new RequestConsulta();
			user.setUser("juan0618");
			ConsultaService co = new ConsultaService();
			ConsultaResponse consultaresponse = co.validateUser(user);
			assertEquals(consultaresponse.getStatus(),"OK");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	

}
