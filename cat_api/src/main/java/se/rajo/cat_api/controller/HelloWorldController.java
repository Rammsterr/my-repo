package se.rajo.cat_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }   @GetMapping("/hello2")
    public String helloWorld2(){
        return "{response: \"Hello World\"}";
    }
}
