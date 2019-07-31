package com.ws.java.entrenamiento.models;


import io.swagger.annotations.ApiModelProperty;



/**
 * 
 * @author JUANCARLOSHERNANDEZH
 * @since 18/07/2019
 * @category Model
 * In this file we are creating a model of attributes for the service
 */
public class UserResponse extends GenericResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7060843246559213291L;
	
	/**usuario propio del usuario que esta almacenado en los registros
	 * 
	 */
	@ApiModelProperty(value = "Usuario,el usuario contiene letras y numeros", dataType = "String", example = "Pepe283")
	private String user;
	
	/**contraseña propio del usuario que esta almacenado en los registros
	 * 
	 */
	@ApiModelProperty(value = "Password,no hay restricciones para la contraseña", dataType = "String", example = "Pepe283**")
	private String password;
	
	/**nombre del usuario que se encuentra en los registros
	 * 
	 */
	@ApiModelProperty(value = "Nombre, ya sea nombre completo o al menos un nombre y un apellido", dataType = "String", example = "Pepe Gonzales Rojas")
	private String name;
	
	/**ultima fecha en que el usuario se logueo
	 * 
	 */
	@ApiModelProperty(value = "LastAccess,tiene un formato tipo date pero aun asi es string", dataType = "String", example = "24/07/2019")
	private String lastAccess;
	/**status de cuales son los posibles status?
	 * 
	 */
	@ApiModelProperty(value = "OK = el usuario se loguee bien, ERROR = hubo un error interno" , required = true, dataType = "String", example = "ACTIVE")
	private String statusUser;

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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastAccess() {
		return lastAccess;
	}

	public void setLastAccess(String lastAccess) {
		this.lastAccess = lastAccess;
	}

	/**
	 * @return the statusUser
	 */
	public String getStatusUser() {
		return statusUser;
	}

	/**
	 * @param statusUser the statusUser to set
	 */
	public void setStatusUser(String statusUser) {
		this.statusUser = statusUser;
	}


	
	
}