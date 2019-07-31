/**
 * 
 */
package com.ws.java.entrenamiento.models;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**
 *
 * @author 
 * @since 30 jul. 2019
 */
public class GenericResponse implements Serializable{

	/**serialVersionUID**/
	private static final long serialVersionUID = 7172123385636667933L;
	
	/**
	 * Status OK ERROR
	 */
	@ApiModelProperty(dataType = "String", example = "OK")
	private String status;
	
	/**
	 * Mensaje si hay error
	 */
	@ApiModelProperty(dataType = "String", example = "Datos Correctos")
	private String message;

	
	
	/**
	 * 
	 */
	public GenericResponse() {
		super();
		status = "ERROR";
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
