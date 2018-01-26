package com.ek.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GuidespringbootApplication {

	public static void main(String[] args) {
	  //SpringBoot 项目的启动入口 ,运行main方法
		SpringApplication.run(GuidespringbootApplication.class, args);
		
		System.out.println("后台显示访问端口是8080 http://localhost:8080/hello");
	}
}
