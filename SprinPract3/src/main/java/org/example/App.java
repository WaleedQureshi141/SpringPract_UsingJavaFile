package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student stu = (Student) context.getBean(Student.class);
        System.out.println(stu.toString());

    }
}
