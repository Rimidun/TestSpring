package main.second.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    //all Pointcut
    @Pointcut("execution (* main.second.Library.getBook())")
    public void allGetMethod() {
    }

    @Pointcut("execution (* main.second.Library.returnBook())")
    public void allReturnMethod() {
    }

    @Pointcut("execution (* main.second.Library.addBook())")
    public void allAddMethod() {
    }


    //Combination pointcut
    @Pointcut("allGetMethod() || allReturnMethod() || allAddMethod()")
    public void allGetAndReturnAndAddMethod() {
    }

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
        System.out.println("beforeAddLoggingAdvice: writing log #3");
    }

    @Before("allGetAndReturnAndAddMethod()")
    public void beforeGetAndReturnAndAddLoggingAdvice() {
        System.out.println("beforeGetAndReturnAndAddLoggingAdvice: writing log #4");
    }

    @After("execution (* main.second.Library.getBook())")
    public void afterGetLoggingAdvice() {
        System.out.println("afterGetLoggingAdvice: writing log #5");
    }

    @Around("execution (* main.second.Library.getBook())")
    public Object aroundGetLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("aroundGetLoggingAdvice: writing log #6");
        Object targetMethodResult = proceedingJoinPoint.proceed();

        System.out.println("aroundGetLoggingAdvice: writing log #7");


        return targetMethodResult;
    }

}
