package com.pearl.boot.controller;

import com.sun.faces.action.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

//    @RequestMapping("/")
    public void sayHello(){

            logger.debug("This is a debug message");
            logger.info("This is an info message");
            logger.warn("This is a warn message");
            logger.error("This is an error message");

    }
}
