package main.second.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("execution (* get*())")
    public void allGetMethod(){}

    @Before("allGetMethod()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: Я беру книгу!");
    }

    @Before("allGetMethod()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: Я провожу проверку");

    }

}
