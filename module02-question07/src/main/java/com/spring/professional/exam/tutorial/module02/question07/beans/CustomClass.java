package com.spring.professional.exam.tutorial.module02.question07.beans;

import com.spring.professional.exam.tutorial.module02.question07.annotation.CustomClassAnno;
import com.spring.professional.exam.tutorial.module02.question07.annotation.CustomMethodAnnotation;
import org.springframework.stereotype.Component;

@Component("custom_class")
@CustomMethodAnnotation
public class CustomClass {

    public void method_one() {
        System.out.println("Bean :: method_one " + this.getClass());
    }

    @CustomClassAnno
    public void annotation_within(){
        System.out.println("Bean :: annotation_within " + this.getClass());

    }
}
