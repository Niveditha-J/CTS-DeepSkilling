package com.library.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.library.service.*.*(..))")
    public void logBefore() {
        System.out.println("LoggingAspect: Method is about to be called.");
    }

    @After("execution(* com.library.service.*.*(..))")
    public void logAfter() {
        System.out.println("LoggingAspect: Method has been executed.");
    }
}
