package com.spring.professional.exam.tutorial.module02.question05;

import com.spring.professional.exam.tutorial.module02.question05.repository.EmployeeRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.registerShutdownHook();

        EmployeeRepository repository = context.getBean(EmployeeRepository.class);

        repository.findEmployeeById(5);
        System.out.println("================================================");
        try {
            repository.findEmployeeById(-1);
        } catch (Exception ignored) {
            System.out.println(ignored.getMessage());
            // ignored on purpose
        }
    }
}
