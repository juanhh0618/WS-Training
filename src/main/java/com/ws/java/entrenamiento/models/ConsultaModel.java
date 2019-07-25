package com.ws.java.entrenamiento.models;

import java.io.Serializable;

public class ConsultaModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3560972546182458142L;
	
	private String nombre,capagna,fecha,ip,message,userid,id;
	
	
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCapagna() {
		return capagna;
	}
	public void setCapagna(String capagna) {
		this.capagna = capagna;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
