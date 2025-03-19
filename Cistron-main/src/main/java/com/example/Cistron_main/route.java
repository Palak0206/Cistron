package com.example.Cistron_main;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/login")
public class route {
    @RequestMapping("/login")
    @GetMapping("/hello")
    public String hello(){
        return "login.html";
    }
    
}
