package com.ws.java.entrenamiento.models;


import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;



/**
 * 
 * @author JUANCARLOSHERNANDEZH
 * @since 18/07/2019
 * @category Model
 * In this file we are creating a model of attributes for the service
 */
public class RequestLogin implements Serializable {
	/**serialVersionUID*/
	private static final long serialVersionUID = 3560972546182458142L;
		
	@ApiModelProperty(value = "Usuario" , required = true,dataType = "String",example = "pepe")
	private String user;
	
	@ApiModelProperty(value = "Password Debe contener una mayuscula inicial y un acar minimo 8" , required = true,dataType = "String",example = "Pepe2019*")
	private String password;


	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}




}