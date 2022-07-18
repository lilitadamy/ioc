package injection.beans;

import annotations.Bean;

@Bean
public class BeanB {
    public void log(String msg) {
        System.out.println("Logged from BeanB: " + msg);
    }
}
