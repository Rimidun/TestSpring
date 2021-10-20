package main.second.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    //all Pointcut
    @Pointcut("execution (* main.second.Library.getBook())")
    public void allGetMethod(){}

    @Pointcut("execution (* main.second.Library.returnBook())")
    public void allReturnMethod(){}

    @Pointcut("execution (* main.second.Library.addBook())")
    public void allAddMethod(){}


    //Combination pointcut
    @Pointcut("allGetMethod() || allReturnMethod() || allAddMethod()")
    public void allGetAndReturnAndAddMethod(){}

    //all Before
    @Before("allGetMethod()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing log #1");
    }

    @Before("allReturnMethod()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing log #2");
    }

    @Before("allAddMethod()")
    public void beforeAddLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing log #3");
    }

    @Before("allGetAndReturnAndAddMethod()")
    public void beforeGetAndReturnAndAddLoggingAdvice() {
        System.out.println("beforeAddLoggingAdvice: writing log #4");
    }

}
