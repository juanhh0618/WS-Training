package com.ws.java.entrenamiento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ws.java.entrenamiento.models.RequestConsulta;
import com.ws.java.entrenamiento.models.ConsultaResponse;
import com.ws.java.entrenamiento.services.ConsultaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 
 * @author JUANCARLOSHERNANDEZH
 * @since 23/07/2019
 * @category Controller
 * In this controller we are publish the web service of consulta
 */
@Api(tags = "Consulta")
@RestController //Le decimos que es un rest controller
@RequestMapping(path = "/consultaInfo/Service") //Ruta para encontrar el servicio
public class ConsultaController {

	@Autowired
	private ConsultaService consultaService = null;
	
	@RequestMapping(
			method = RequestMethod.POST, //indicamos que el servicio es POST
			path = "/validateUser", //Ruta del metodo
			consumes = "application/json", //Indicamos que recibe json
			produces = "application/json") //Indicamos que produce json
	@ApiOperation(value = "consulta", notes = "Servicio general de consulta." , response = ConsultaResponse.class)
	public ConsultaResponse consulta(@ApiParam(value = "Objeto user con user" , required = true) @RequestBody RequestConsulta user){
		ConsultaResponse respuesta = new ConsultaResponse();
		try {
			respuesta = consultaService.validateUser(user);
			return respuesta;
		} catch (Exception e) {
			respuesta.setMessage(e.getMessage());
			return respuesta;
		}
		
	}
}