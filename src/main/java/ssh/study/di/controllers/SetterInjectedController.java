package ssh.study.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ssh.study.di.service.GreetingService;
@Controller
public class SetterInjectedController {
    public GreetingService greetingService;
    
    public String sayGeeting(){
        return greetingService.sayGreeting();
    }
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}

