package com.demo.aop.joinpoint;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class JoinPointService {

    @Before("execution(* com.demo.aop.model.Student.echo())")
    public void beforeEcho(JoinPoint joinPoint) {
        System.out.println(joinPoint.getArgs());
        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getKind());
        System.out.println(joinPoint.getStaticPart());
        System.out.println(joinPoint.toShortString());
    }
}
