package com.ws.java.entrenamiento.models;


import io.swagger.annotations.ApiModelProperty;



/**
 * 
 * @author JUANCARLOSHERNANDEZH
 * @since 18/07/2019
 * @category Model
 * In this file we are creating a model of attributes for the service
 */
public class ConsultaResponse extends GenericResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7060843246559213291L;
	private String userid;
	private String id;
	private String name;
	private String ip;
	private String fecha;
	/**status de cuales son los posibles status?
	 * 
	 */
	@ApiModelProperty(value = "OK = el usuario se encontro en los registros ERROR hubo un error interno" , required = true, dataType = "String", example = "pepe")
	private String statusUser;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
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