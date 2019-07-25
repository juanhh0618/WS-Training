package com.ws.java.entrenamiento;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	private static final String SWAGGER_API_VERSION = "1.0";
	private static final String title = "Training IBM REST API " ;
	private static final String description = "Web Services for IBM Training" ;
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title(title)
				.description(description)
				.version(SWAGGER_API_VERSION)
				.build();
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.ws.java.entrenamiento.controllers"))
				.paths(PathSelectors.any())
				.build()
				.tags(new Tag("Consulta", "Servicio de consulta de informacion que valida uno dato"
						+ " de entrada(user)en un archivo plano y devuelve una informacion del usuario")); 
	}
	
	
	
}