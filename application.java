import exception.InjectionException;
import injection.InjectableClass;
import injection.Injector;


public class application {
    public static void main(String[] args) throws Exception{

        Injector injector = Injector.getInjector();
        InjectableClass injectableClass1;
        InjectableClass injectableClass2;

        try {
            injectableClass1 = injector.inject(InjectableClass.class);
            injectableClass2 = injector.inject(InjectableClass.class);
            injectableClass1.log();
            injectableClass2.log();
        } catch (Exception e) {
            throw new InjectionException("Injection failed", e);
        }




    }
}
