package com.demo.aop.basic;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BasicPointcutSample {

    @Pointcut("execution(* com.demo.aop.model.Student.*(..))")
    public void trackSayHello() {
    }

//    @Before("trackSayHello()")
    public void logBeforeTheMethod() {
        System.out.println("Before the execution of hello!");
    }

//    @After("trackSayHello()")
    public void logAfterTheMethod() {
        System.out.println("After the execution of hello!");
    }

    @Around("trackSayHello()")
    public Object logAroundMethodExecution(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Before execution");
        Object ret = proceedingJoinPoint.proceed();
        System.out.println("After execution");
        return ret;
    }
}
