package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter @Setter
@ToString
public class Horse implements Animal{

    private String color;
    private String breed;
    private double height;
    private double weight;

    public Horse(String color, String breed, double height, double weight) {
        this.color = color;
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void animalPlus() {

    }

    @Override
    public void animalMinus() {

    }
}
