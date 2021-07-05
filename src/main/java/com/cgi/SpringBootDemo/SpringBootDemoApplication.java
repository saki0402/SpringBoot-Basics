package com.cgi.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		/* context is the spring container here.and this gives 2 types of beans userdefined beans and AutoConfigure beans 
		   Auto configure Beans :the spring container makes an assumption that you require certain number of beans and it will provide you those
		   To make your classes to create objects by container we need to use configuration for that : @Component, @Autowired .......
		   context will initialize the container and during initialization it creates the objects for the components
		   bean means object    
		*/
		Alien a = context.getBean(Alien.class);
		a.show();
//		Alien a1 = context.getBean(Alien.class);
//		a1.show();
	}

}
