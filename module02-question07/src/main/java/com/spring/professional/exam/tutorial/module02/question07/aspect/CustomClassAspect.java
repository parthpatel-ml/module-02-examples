package com.spring.professional.exam.tutorial.module02.question07.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CustomClassAspect {
    @Before("within(com.spring.professional.exam.tutorial..CustomClass)")
    public void withinCustom1() {
        System.out.println("Before - :: method_one of ");
    }

    @After("@within(com.spring.professional.exam.tutorial.module02.question07.annotation.CustomClassAnno)")
    public void customAnnotationWithin(){
        System.out.println("After - :: customAnnotationWithin ");
    }

    @Before("@annotation(com.spring.professional.exam.tutorial.module02.question07.annotation.CustomMethodAnnotation)")
    public void custom_method_annotation(){
        System.out.println("Before - :: custom_method_annotation");
    }
}
