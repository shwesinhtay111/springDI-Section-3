package ssh.study.di.controllers;

import org.springframework.stereotype.Controller;

import ssh.study.di.service.GreetingService;

@Controller
public class MyController {
    private final GreetingService greetingService;
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        System.out.println("Hello World");
        return greetingService.sayGreeting();
    }
}
