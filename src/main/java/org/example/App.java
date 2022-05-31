package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person1 = context.getBean("person1", Person.class);
        System.out.println("My friend name is " + person1.getName() + ". Him "
                + person1.getAge() + " years old. " + "His favorite animal is " + person1.getAnimal() + ".");
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println("His dogs color " + dog.getColor() + ", breed " + dog.getBreed() + ", height "
                + dog.getHeight() + ", weight " + dog.getWeight());
        Person person2 = context.getBean("person2", Person.class);
        System.out.println("My name is " + person2.getName() + ". I am "
                + person2.getAge() + " years old. " + "My favorite animal is " + person2.getAnimal() + ".");
        Horse horse = context.getBean("horse", Horse.class);
        System.out.println("His color is " + horse.getColor() + ", breed " + horse.getBreed() + ", height "
                + horse.getHeight() + ", weight " + horse.getWeight());
    }
}
