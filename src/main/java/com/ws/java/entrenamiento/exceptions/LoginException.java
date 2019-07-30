/**
 * 
 */
package com.ws.java.entrenamiento.exceptions;

/**
 *
 * @author Elpisius
 * @since 30 jul. 2019
 */
public class LoginException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2716722434977601788L;

	/**
	 * 
	 */
	public LoginException() {
		super();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public LoginException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public LoginException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 */
	public LoginException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public LoginException(Throwable arg0) {
		super(arg0);
	}

	
	
	
}
