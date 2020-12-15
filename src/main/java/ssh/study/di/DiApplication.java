package ssh.study.di;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ssh.study.di.controllers.ConstructorInjectedController;
import ssh.study.di.controllers.I18nController;
import ssh.study.di.controllers.MyController;
import ssh.study.di.controllers.PropertyInjectedController;
import ssh.study.di.controllers.SetterInjectedController;

@SpringBootApplication
public class DiApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("...............Primary Bean");
		String greeting = myController.sayHello();
		System.out.println(greeting);
		System.out.println("................Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.sayGeeting());
		System.out.println("....Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.sayGeeting());
		System.out.println("..........Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.sayGeeting());
	}
}
