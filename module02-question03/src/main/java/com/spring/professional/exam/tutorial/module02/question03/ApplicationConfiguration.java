package com.spring.professional.exam.tutorial.module02.question03;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
//@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true) // now only CGLIB proxy is used.
public class ApplicationConfiguration {
}
