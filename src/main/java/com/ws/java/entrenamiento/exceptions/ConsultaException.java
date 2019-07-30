package com.ws.java.entrenamiento.exceptions;

/**
 *
 * @author Elpisius
 * @since 30 jul. 2019
 */
public class ConsultaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2716722434977601788L;

	/**
	 * 
	 */
	public ConsultaException() {
		super();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public ConsultaException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public ConsultaException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 */
	public ConsultaException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public ConsultaException(Throwable arg0) {
		super(arg0);
	}

	
	
	
}