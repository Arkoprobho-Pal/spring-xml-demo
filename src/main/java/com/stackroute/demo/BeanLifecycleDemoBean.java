package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initializing bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean Destroyed");
    }
    @Bean
    public void customInit(){
        System.out.println("Calling CustomInit");
    }
    @Bean
    public void customDestroy(){
        System.out.println("Calling CustomDestroy");
    }


}
