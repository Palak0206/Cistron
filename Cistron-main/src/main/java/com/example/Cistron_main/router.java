package com.example.cistron_main;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/login")
public class router {
    @RequestMapping("login")
    public static String hello()
    {
        return "login page";
    }   
    @PostMapping("/process-form")
    public static String getData(@RequestParam int num1 ,@RequestParam int num2){
    int ans= num1+num2;
    return "answer: "+ans;
}


    }
    

