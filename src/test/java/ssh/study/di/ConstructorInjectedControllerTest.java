package ssh.study.di;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ssh.study.di.controllers.ConstructorInjectedController;
import ssh.study.di.service.GreetingServiceImp;

public class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;
    @BeforeEach
    void setUp(){
        controller = new ConstructorInjectedController(new GreetingServiceImp());
    }

    @Test
    void getGreeting(){
        System.out.println(controller.sayGeeting());
    }
    
}
