package org.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestExample {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfiguration.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getName());
    }
}
