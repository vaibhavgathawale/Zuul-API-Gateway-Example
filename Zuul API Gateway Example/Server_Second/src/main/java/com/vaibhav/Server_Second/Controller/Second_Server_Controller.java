package com.vaibhav.Server_Second.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Second_Server_Controller {

    @GetMapping("/home")
    public String base(){
        return "<h1>This is Second page for Server Second<h1>";
    }
    @GetMapping("/user")
    public String user(){
        return "<h1>This is Second page for Server Second<h1>";
    }
    @GetMapping("/admin")
    public String admin(){
        return "<h1>This is Second page for Server Second<h1>";
    }
}

