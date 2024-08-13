package es.com.suelengalhardo.ToDoList.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/firstRoute")


public class FirstController {

    
    @GetMapping("/firstMethod")

    public String firstMessage() {
        return "Hello World, this is the first endpoint of the To-Do List application";

    }

}
