package com.hard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hard.mapper")
public class HardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HardApplication.class, args);
	}

}
