package ssh.study.di.controllers;

import ssh.study.di.service.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;
    public String sayGeeting(){
        return greetingService.sayGreeting();
    }
	
    
}
