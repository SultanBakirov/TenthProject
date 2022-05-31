package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter @Setter
@ToString
public class Dog implements Animal{

    private String color;
    private String breed;
    private double height;
    private double weight;

    public Dog(String color, String breed, double height, double weight) {
        this.color = color;
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void animalPlus() {
        System.out.println("");
    }

    @Override
    public void animalMinus() {

    }
}
