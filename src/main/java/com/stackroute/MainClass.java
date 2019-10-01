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
        //------------------------------------------Using ApplicationContext
        System.out.println("-------------------------------------------Using ApplicationContext");
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=context.getBean("movie",Movie.class);
        movie.ActorInfo();
        //-------------------------------------------Using XmlbeanFactory
        System.out.println("-------------------------------------------Using XmlbeanFactory");
        XmlBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie1=context.getBean("movie",Movie.class);
        movie1.ActorInfo();
        //-------------------------------------------BeanDefinitionRegistry and BeanDefinitionReader
        System.out.println("-------------------------------------------BeanDefinitionRegistry and BeanDefinitionReader");
      BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
      BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
      beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
      Movie movie2 = ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean(Movie.class);
        movie2.ActorInfo();
    }
}
