package injection.beans;

import annotations.Bean;

@Bean
public class BeanA {

//    private int callCount = 0;

    public void log(String msg) {
        System.out.println("Logged from BeanA: " + msg);
//        System.out.println("Times called: " + ++callCount);
    }
}
