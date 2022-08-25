package co.develhope.dependencyinjectionexercise.controllers;

import co.develhope.dependencyinjectionexercise.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {

    @Autowired
    private MyService myService;

    public MyController(){
        System.out.println("MyController() is invoked");
    }

    @GetMapping("/getName")
    public String getName(){
        System.out.println("MyService.getName() is invoked");
        return myService.getName();
    }

    @GetMapping
    public String messageWelcome(){
        System.out.println("messageWelcome() is invoked");
        return "Welcome in my controller";
    }

}
