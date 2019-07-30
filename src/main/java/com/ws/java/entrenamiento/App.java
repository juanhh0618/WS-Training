package com.ws.java.entrenamiento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ws.java.entrenamiento.services.LoginRepository;

/**
 * 
 * @author JUANCARLOSHERNANDEZH
 * @since 22/07/2019
 * @category Main
 * In this class we are defining that our project is using springboot
 */
@SpringBootApplication //clase principal
@EnableAutoConfiguration //da a entender que vamos a autoconfigurar nuestra aplicacion springboot
public class App {
	public static void main( String[] args ) {
		new LoginRepository().loadUsers();
		SpringApplication.run(App.class, args); //Aqui estamos indicando cual clase va a ejecutar
		

	}
}
