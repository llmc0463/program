package com.example.springbootimcboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.example.springbootimcboot.mapper")
public class SpringBootImcbootApplication {
	/**
	 * 项目以后在这里启动
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("项目启动中 *********");
		SpringApplication.run(SpringBootImcbootApplication.class, args);
		System.out.println("Springboot 启动成功");
	}

}
