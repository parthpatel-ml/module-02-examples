package com.spring.professional.exam.tutorial.module02.question06.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HelloBeanAspect {
//    @Pointcut("within(com.spring.professional.exam.tutorial.module02.question06.beans.*)")
    @Pointcut("bean(helloBean)")
    public void withinBeansPackage() {
        System.out.println("Sout inside pointcut expression method ");
    }

    @Before("withinBeansPackage()")
    public void before(JoinPoint joinPoint) {
        System.out.println("before - " + joinPoint.getSignature());
    }

    @After("withinBeansPackage()")
    public void after(JoinPoint joinPoint) {
        System.out.println("after - " + joinPoint.getSignature());
    }
}
