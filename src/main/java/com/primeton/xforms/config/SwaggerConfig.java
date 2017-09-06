package com.primeton.xforms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(testApiInfo())
				.groupName("template")
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.primeton.xforms.api"))
				.paths(PathSelectors.any())
				.build();	}

	

	private ApiInfo testApiInfo() {
		return new ApiInfoBuilder().title("XForms Platform API")
				.description("Xforms Platform's API,all the applications could access the Object data via JSON")
				.version("1.0")
				.termsOfServiceUrl("no terms of services")
				.contact(new Contact("Jackie Xie", "http://JackieXie.github.com", "xiegz@163.com"))
				.license("The Apache License, Version 2.0")
				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
				.build();
	}
}
