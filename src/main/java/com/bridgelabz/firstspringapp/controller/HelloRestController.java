package com.bridgelabz.firstspringapp.controller;

import com.bridgelabz.firstspringapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
//    http://localhost:8081/hello
    @RequestMapping(value = {"","/","/hello"})
    public String sayHello(){
        return "Hello From BridgeLabz";
    }

//    http://localhost:8081/hello/query?name=sachin
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello "+ name + "!";
    }

//    http://localhost:8081/hello/param/sachin
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello "+ name + "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName){
        return "Hello " + firstName + " " + lastName + "!";

    }
}
