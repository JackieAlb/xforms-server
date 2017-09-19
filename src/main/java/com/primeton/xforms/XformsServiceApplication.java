package com.primeton.xforms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.primeton.xforms.mapper")
public class XformsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(XformsServiceApplication.class, args);
	}
}
