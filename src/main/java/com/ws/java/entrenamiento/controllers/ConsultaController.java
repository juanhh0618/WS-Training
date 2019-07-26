package com.ws.java.entrenamiento.controllers;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ws.java.entrenamiento.models.ConsultaModel;

import io.swagger.annotations.Api;

import com.ws.java.entrenamiento.services.ConsultaService;


/**
 * 
 * @author JUANCARLOSHERNANDEZH
 * @since 23/07/2019
 * @category Controller
 * In this controller we are publish the web service
 */
@Api(tags = "Consulta")
@RestController //Le decimos que es un rest controller
@RequestMapping(path = "/consultaInfo/service") //Ruta para encontrar el servicio
public class ConsultaController {

	@RequestMapping(
			method = RequestMethod.GET, //indicamos que el servicio es get
			path = "/validateUser", //Ruta del metodo
			//consumes = "application/json", //Indicamos que recibe json
			//produces = "application/json") //Indicamos que produce json
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
			//consumes = {MediaType.APPLICATION_XML_VALUE},
			//produces = {MediaType.APPLICATION_XML_VALUE})
	
		public @ResponseBody ConsultaModel PublishService(@RequestBody ConsultaModel userid) throws Exception {
		
		ConsultaService response = new ConsultaService();	
		ConsultaModel respuesta = response.validateUser(userid);
			
		return respuesta;
	}
}
