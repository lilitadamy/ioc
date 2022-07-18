package injection;

import annotations.Bean;
import annotations.Inject;
import exception.InjectionException;

import java.lang.reflect.Field;

public class Injector {
    private Injector() {}
    public static Injector getInjector() {
        return new Injector();
    }
    public  <T> T inject(Class<T> classToInjectTo) throws Exception {
        T instance = classToInjectTo.getConstructor().newInstance();

        for (Field field: classToInjectTo.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                if(!field.getType().isAnnotationPresent(Bean.class)) {
                    throw new InjectionException("bean with name: " + field.getType().getName() + " does not exist");
                }
                field.setAccessible(true);
                field.set(instance, inject(field.getType()));
            }
        }
        return instance;
    }

}
