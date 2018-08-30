package ru.otus.interceptor;

import javax.enterprise.context.Dependent;
import javax.interceptor.ExcludeClassInterceptors;

@Filter
@Dependent
public class InterceptableBean {

    public long businessLogic() {
        return System.currentTimeMillis();
    }
}
