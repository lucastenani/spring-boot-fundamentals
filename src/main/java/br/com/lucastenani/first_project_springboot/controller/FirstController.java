package br.com.lucastenani.first_project_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class FirstController {
    @GetMapping("/world")
    public String helloWorld() {
        return "Hello, World!";
    }
}
