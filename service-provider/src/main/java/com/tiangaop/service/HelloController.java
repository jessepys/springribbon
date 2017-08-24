package com.tiangaop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/hello")
    public String hello() {
        LOG.info("Access /hello");
        return "Hello";
    }

    @RequestMapping(value = "/")
    public String home() {
        return "welcome!";
    }
}
