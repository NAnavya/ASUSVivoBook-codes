package com.example.demo;

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
	public Docket EmployeeAPI() {
		Docket docket=new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.groupName("Employee Group")
				.select().apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
				//.paths(PathSelectors.any())
				.build();
		return docket;
		
	}

	private ApiInfo apiInfo() {
		// TODO Auto-generated method stub
		return new ApiInfoBuilder().title("EMployeeManagement Api")
				.description("EMployee MAnagemeny API")
				.termsOfServiceUrl("http://fakeapi.com")
				.contact(new Contact("EMployee API","http://fakeapi.com","fake@gmail.com"))
				.license("Employee license")
				.licenseUrl("http://fakeapi.com")
				.build();
	}

}
