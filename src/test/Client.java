package test;

import beans.Hello;
import beans.Welcome;
import config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        String[] beanNames = context.getBeanDefinitionNames();

        System.out.println();
        for(String beanName: beanNames){
            System.out.println(beanName);
        }

        System.out.println();
        Welcome w1 = (Welcome) context.getBean("welcomeBean");
        Welcome w2 = (Welcome) context.getBean(Welcome.class);
        w1.welcomeUser();
        w2.welcomeUser();
        System.out.println(w1);
        System.out.println(w2);
        System.out.println();

        Hello h1 = (Hello) context.getBean("helloBean");
        Hello h2 = (Hello) context.getBean(Hello.class);
        h1.helloUser();
        h2.helloUser();
        System.out.println(h1);
        System.out.println(h2);
    }
}
