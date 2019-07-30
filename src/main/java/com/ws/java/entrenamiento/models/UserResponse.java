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
	private String user;
	private String password;
	private String name;
	private String lastAccess;
	/**status dcuales son los posibles status?
	 * 
	 */
	@ApiModelProperty(value = "OK = el usario se logue bien ERROR hub un error interno" , required = true, dataType = "String", example = "pepe")
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