package com.ori.template;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ServletComponentScan
@ComponentScan(basePackages = {"com.ori.template.controller", "com.ori.template.service"})
@MapperScan(basePackages= {"com.ori.template.mapper"})
public class TemplateApplication {

	public static void main(String[] args) {

		SpringApplication.run(TemplateApplication.class, args);
	}

}
