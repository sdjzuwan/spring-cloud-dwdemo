package com.spring.cloud.ribbon.controller;

import com.spring.cloud.ribbon.service.ProxyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/7/11.
 */

@Controller
public class ProxyController {

    private  final Logger logger = LoggerFactory.getLogger(ProxyController.class);

    @Autowired
    ProxyService proxyService;

    @RequestMapping(value = "/proxy-service")
    @ResponseBody
    public String proxyConsumer(@RequestParam String service_name, @RequestParam String para) throws Exception{
        return proxyService.proxyService(service_name, para);
    }
}
