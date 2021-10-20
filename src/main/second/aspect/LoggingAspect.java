package main.second.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution (* get*())")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: Я беру книгу!");
    }

    @Before("execution (* get*())")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: Я провожу проверку");

    }

}
