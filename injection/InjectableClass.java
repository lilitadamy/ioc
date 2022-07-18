package injection;

import annotations.Inject;
import injection.beans.BeanA;
import injection.beans.BeanB;

public class InjectableClass {

    @Inject
    private BeanA beanA;

    @Inject
    private BeanB beanB;

    public void log() {
        beanA.log("Injectable class");
        beanB.log("Injectable class");
    }

}
