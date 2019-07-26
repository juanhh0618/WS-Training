package com.ws.java.entrenamiento.models;


import java.io.Serializable;


/**
 * 
 * @author JUANCARLOSHERNANDEZH
 * @since 18/07/2019
 * @category Model
 * In this file we are creating a model of attributes for the service
 */
public class LoginModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3560972546182458142L;
	private String user;
	private String password;
	private String name;
	private String lastAccess;
	private String status;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
}