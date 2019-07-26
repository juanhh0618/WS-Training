package com.ws.java.entrenamiento.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ws.java.entrenamiento.models.LoginModel;

import io.swagger.annotations.Api;

import com.ws.java.entrenamiento.services.LoginService;
@Api(tags = "Login")
@RestController //Le decimos que es un rest controller
@RequestMapping(path = "/servicesREST/login") //Ruta para encontrar el servicio
public class LoginController {

	@RequestMapping(
			method = RequestMethod.POST, //indicamos que el servicio es POST
			path = "/validateUser", //Ruta del metodo
			consumes = "application/json", //Indicamos que recibe json
			produces = "application/json") //Indicamos que produce json
			//consumes = {MediaType.APPLICATION_XML_VALUE},
			//produces = {MediaType.APPLICATION_XML_VALUE})
		public @ResponseBody LoginModel PublishService(@RequestBody LoginModel user) throws Exception {
		
			LoginService response = new LoginService();
			LoginModel respuesta = response.method(user);
			
			return respuesta;
	}
}