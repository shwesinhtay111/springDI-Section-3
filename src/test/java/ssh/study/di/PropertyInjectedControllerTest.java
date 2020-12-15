package ssh.study.di;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ssh.study.di.controllers.PropertyInjectedController;
import ssh.study.di.service.ConstructorGreetingService;

public class PropertyInjectedControllerTest {
    PropertyInjectedController controller;
    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }
    @Test
    void getGreeting() {
        System.out.println(controller.sayGeeting());
    }
    
}
