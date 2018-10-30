package com.sam.cloudserver.controller;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.EurekaInstanceConfig;

@RestController
public class ClientController {
	
	//编写日记
	private Logger logger = LoggerFactory.getLogger(Class.class);

	@Autowired
	private EurekaInstanceConfig eurekaInstanceConfig;
	
	
	@Value("${server.port}") String port;
	@RequestMapping(value = "/hello",method=RequestMethod.GET)
	public String home (){
		this.logger.info("/hello, instanceId:{}, host:{}",eurekaInstanceConfig.getInstanceId(),eurekaInstanceConfig.getHostName(false));
		return "hello world from port "+port ;
	}
	
}
