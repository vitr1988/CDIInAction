package ru.otus.interceptor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Priority;
import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Filter
@Interceptor
@Priority(10)
public class InterceptorImpl {
    @AroundInvoke
    public Object audit(InvocationContext ictx) throws Exception {
        //before business logic goes here
        Object result = ictx.proceed();
        //after business logic
        return result;
    }

    @AroundConstruct
    public Object begin(InvocationContext ictx) throws Exception {
        //before business logic goes here
        Object result = ictx.proceed();
        //after business logic
        return result;
    }

    @PreDestroy
    public Object end(InvocationContext ictx) throws Exception {
        //before business logic goes here
        Object result = ictx.proceed();
        //after business logic
        return result;
    }

}
