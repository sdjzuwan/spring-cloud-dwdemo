package com.spring.cloud.ribbon.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * Created by Administrator on 2017/7/13.
 */

@Service
public class ProxyService {

    private  final Logger logger = LoggerFactory.getLogger(ProxyService.class);

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String proxyService(String service_name, String para) throws Exception{
    	
    	Map<String, Object> para_map = new HashMap<String, Object>();
    	para_map.put("para", para);

    	String result = "";
    	if("save_jfsq".equals(service_name)) {
    		 result = restTemplate.postForEntity("http://jfsq-service/save_jfsq?para={para}", para_map, String.class, para_map).getBody();
    	}else if("get_jfsq_info".equals(service_name)) {
    		 result = restTemplate.postForEntity("http://jfsq-service/get_jfsq_info?para={para}", para_map, String.class, para_map).getBody();
    	}else if("save_jfsp".equals(service_name)) {
    		 result = restTemplate.postForEntity("http://jfsp-service/save_jfsp?para={para}", para_map, String.class, para_map).getBody();
    	}else if("save_jfrw".equals(service_name)) {
    		 result = restTemplate.postForEntity("http://jfrw-service/save_jfrw?para={para}", para_map, String.class, para_map).getBody();
    	}else {
    		throw new Exception("service_name为["+service_name+"]，不合法。");
    	}
    	
        return result;
    }

    public String helloFallback(String service_name, String para){
        return "error";
    }
}
