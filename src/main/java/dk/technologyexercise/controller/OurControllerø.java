package dk.technologyexercise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OurControllerø {
    @GetMapping
    public String index(){
        return "index";
    }
    @GetMapping
    public String shout(){
        return "MasterBlaster!";
    }
    @GetMapping
    public String driving(){
        return "vroom vroom";
    }
}
