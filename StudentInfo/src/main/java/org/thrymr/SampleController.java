package org.thrymr;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleController {
  
    public static void main(String[] args) throws Exception {
        SpringApplication springApplication = new SpringApplication(SampleController.class);
        springApplication.run(args);
    }
}