package com.ws.java.entrenamiento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //clase principal
@EnableAutoConfiguration //da a entender que vamos a autoconfigurar nuestra aplicacion springboot
public class App {
    public static void main( String[] args ) {
     SpringApplication.run(App.class, args); //Aqui estamos indicando cual clase va a ejecutar
    }
}
