package edu.lemon.DemoInternetStore.controllers;

import edu.lemon.DemoInternetStore.model.User;
import edu.lemon.DemoInternetStore.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @Autowired
    GreetingsService greetingsService;

    @GetMapping(value = {"/","/hello"}, params = {"name", "age"})
    public String greetings(@RequestParam(name = "name") String name,
                            @RequestParam(name = "age") String pass) {
        return greetingsService.greet(new User(name, pass));
    }

    @PostMapping(value = {"/","/hello"}, params = {"name", "age"})
    public String greetingsAdd(@RequestParam(name = "name") String name,
                            @RequestParam(name = "age") String pass) {
        return greetingsService.greet(new User(name, pass));
    }
}
