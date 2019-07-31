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
	
	/**
	 * userid del usuario del cual se desea buscar la información
	 */
	@ApiModelProperty(required = true, dataType = "String" , example = "pepito283")
	private String userid;
	
	/**
	 * id propio del usuario que se encuentra en los registros de busqueda
	 */
	@ApiModelProperty(required = false, dataType = "String" , example = "3129203939")
	private String id;
	
	/**
	 * nombre que se tiene del usuario en los registros
	 */
	@ApiModelProperty(required = false, dataType = "String" , example = "Pepe Gonzales")
	private String name;
	
	/**
	 * ip de la maquina(computador,celular) desde donde se capturo el registro del usuario
	 */
	@ApiModelProperty(required = false, dataType = "String" , example = "160.048.18.24")
	private String ip;
	
	/**
	 * ip de la maquina(computador,celular) desde donde se capturo el registro del usuario
	 */
	@ApiModelProperty(required = false, dataType = "String" , example = "31/07/2019")
	private String fecha;
	
	/**status de cuales son los posibles status del servicio
	 * 
	 */
	@ApiModelProperty(value = "OK = el usuario se encontro en los registros ERROR hubo un error interno" , required = true, dataType = "String")
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