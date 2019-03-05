package com.prototype;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.prototype.mapper")
public class WebSrvForPrototypeApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebSrvForPrototypeApplication.class,args);
	}
}
