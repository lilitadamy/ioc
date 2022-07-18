package configuration;

import injection.beans.*;

import java.util.HashSet;
import java.util.Set;


public class LwIoc implements Ioc {

    private Set<Class<?>> beans = new HashSet<>();

    @Override
    public void configure() {
        registerBean(BeanA.class);
        registerBean(BeanB.class);
    }

    private <T> void registerBean(Class<T> baseClass) {
        beans.add(baseClass);
    }

}
