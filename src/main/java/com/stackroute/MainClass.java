package com.stackroute;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.BeanDefinitionDecorator;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainClass {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movieA=context.getBean("movieA",Movie.class);
        movieA.ActorInfo();
        Movie movieB=context.getBean("movieB",Movie.class);
        movieB.ActorInfo();


    }
}
