package se.rajo.cat_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AliveController {

    @GetMapping("/")
    public String alive(){
        return "Server is alive and running";
    }
}
