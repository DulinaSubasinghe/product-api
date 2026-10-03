package uk.ac.westminster.products.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")

    public String hello(){
        return "Hello from Spring Boot";
    }

    @GetMapping("/status")

    public String status(){
        return "Springboot is running on Apache Tomcat server";
    }

    @GetMapping("/bye")

    public String bye(){
        return "GoodBye from IIT";
    }
}