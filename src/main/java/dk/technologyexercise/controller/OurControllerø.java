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
    public String driving() {
        return "vroom vroom";
    }
    @GetMapping
    public String atgaapaalokum(){
        return "prøv med cream";
    }
    @GetMapping
    public String shouting() {
        return "Very angry shouts";
    }
    public String gøredet(){
        return "lokum";
    }
    //Stop med at lave grimme navne på min github Lars.
    
    //JEG HAR TILFØJET DENNE LINJE TIL MIN FORK

}
