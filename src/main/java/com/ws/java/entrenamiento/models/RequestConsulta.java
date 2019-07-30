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
public class RequestConsulta implements Serializable {
	/**serialVersionUID*/
	private static final long serialVersionUID = 3560972546182458142L;
		
	@ApiModelProperty(value = "Usuario" , required = true,dataType = "String",example = "pepe")
	private String user;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}


}