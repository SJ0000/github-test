package me.sj.todobackend.controller;

import me.sj.todobackend.dto.TestResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String helloWorld(){
        return "To-do Application !";
    }

    @GetMapping("/json")
    public TestResponse testJson(){

        TestResponse testResponse = new TestResponse();
        testResponse.setTitle("title01");
        testResponse.setContent("content01");

        return testResponse;
    }
}
