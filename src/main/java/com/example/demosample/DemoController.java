package com.example.demosample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
    Logger logger = (Logger) LoggerFactory.getLogger(DemoController.class);
    @GetMapping("/printmsg")
    public String pringMsg(){
        for (int i=0;i<10000;i++){
           logger.info("=========Hello World==========");
           logger.info("=========Hello World===========");
           logger.info("=========Hello World===========");
           logger.info("=========Hello World===========");
           logger.info("=========Hello World==========");
           logger.info("=========Hello World===========");
           logger.info("=========Hello World===========");
           logger.info("=========Hello World===========");
           logger.info("=========Hello World===========");
           logger.info("=========Hello World===========");
        }
return "hello World\n hello World\n hello World\n hello World\n"; 
    }
}
