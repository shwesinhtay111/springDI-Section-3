package ssh.study.di.controllers;

import ssh.study.di.service.GreetingService;

public class ConstructorInjectedController {
    public GreetingService greetingService;
    
    public String sayGeeting(){
        return greetingService.sayGreeting();
    }

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
}
