package ssh.study.di.controllers;

import ssh.study.di.service.GreetingService;

public class SetterInjectedController {
    public GreetingService greetingService;
    
    public String sayGeeting(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
}
