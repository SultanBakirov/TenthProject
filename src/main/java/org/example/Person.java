package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter @Setter
@ToString
public class Person {

    private String animal;
    private String name;
    private int age;

    public Person(String animal, String name, int age) {
        this.animal = animal;
        this.name = name;
        this.age = age;
    }
}
