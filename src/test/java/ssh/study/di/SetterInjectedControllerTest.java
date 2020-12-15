package ssh.study.di;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ssh.study.di.controllers.SetterInjectedController;
import ssh.study.di.service.GreetingServiceImp;

public class SetterInjectedControllerTest {
    SetterInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImp());
    }
    @Test
    void getGreeting(){
        System.out.println(controller.sayGeeting());
    }
}
