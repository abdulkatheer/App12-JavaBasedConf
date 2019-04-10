package config;

import beans.Hello;
import beans.Welcome;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    static {
        System.out.println("ApplicationConfig class loading...");
    }

    public ApplicationConfig() {
        System.out.println("ApplicationConfig class instantiating...");
    }

    @Bean
    public Welcome welcomeBean(){
        Welcome w = new Welcome();
        w.setUserName("Abdul Katheer");
        return w;
    }

    @Bean
    public Hello helloBean(){
        Hello h = new Hello();
        h.setUserName("Abdul Katheer");
        return h;
    }
}
