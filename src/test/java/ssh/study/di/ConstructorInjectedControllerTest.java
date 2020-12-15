package ssh.study.di;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ssh.study.di.controllers.ConstructorInjectedController;
import ssh.study.di.service.ConstructorGreetingService;

public class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;
    @BeforeEach
    void setUp(){
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }
    @Test
    void getGreeting(){
        System.out.println(controller.sayGeeting());
    }    
}
