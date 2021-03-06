package com.sam.cloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudServerApplication {

	//测试更新操作
	public static void main(String[] args) {
		SpringApplication.run(CloudServerApplication.class, args);
	}
	
}
