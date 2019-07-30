package com.ws.java.entrenamiento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ws.java.entrenamiento.models.RequestLogin;
import com.ws.java.entrenamiento.models.UserResponse;
import com.ws.java.entrenamiento.services.LoginService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 
 * @author JUANCARLOSHERNANDEZH
 * @since 23/07/2019
 * @category Controller
 * In this controller we are publish the web service
 */
@Api(tags = "Login")
@RestController //Le decimos que es un rest controller
@RequestMapping(path = "/servicesREST/login") //Ruta para encontrar el servicio
public class LoginController {

	@Autowired
	private LoginService loginService = null;
	
	@RequestMapping(
			method = RequestMethod.POST, //indicamos que el servicio es POST
			path = "/validateUser", //Ruta del metodo
			consumes = "application/json", //Indicamos que recibe json
			produces = "application/json") //Indicamos que produce json
	@ApiOperation(value = "login", notes = "Servicio general de login." , response = UserResponse.class)
	public UserResponse login(@ApiParam(value = "oBJETO USER CON USER Y PSW" , required = true) @RequestBody RequestLogin user){
		UserResponse respuesta = new UserResponse();
		try {
			respuesta = loginService.validateUser(user);
			return respuesta;
		} catch (Exception e) {
			respuesta.setMessage(e.getMessage());
			return respuesta;
		}
		
	}
}