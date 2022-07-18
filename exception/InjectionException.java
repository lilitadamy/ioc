package exception;

public class InjectionException extends RuntimeException{
    public InjectionException(String s) {
        super(s);
    }
    public InjectionException(String s, Throwable e) {
        super(s, e);
    }

}
