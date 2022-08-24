package com.vaibhav.Server_First.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Server_First_Controller {

    @GetMapping("/home")
    public String base(){
        return "<h1>This is First page for Server First<h1>";
    }
    @GetMapping("/user")
    public String user(){
        return "<h1>This is First page for Server First<h1>";
    }
    @GetMapping("/admin")
    public String admin(){
        return "<h1>This is First page for Server First<h1>";
    }

}
