package primery.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Animal> animals = new ArrayList<>();
        animals.add(new Animal("Turtle", false, true));
        animals.add(new Animal("Kangaroo", true, false));
        animals.add(new Animal("Fish", false, true));
        animals.add(new Animal("Frog", true, true));

        //print(animals, new HopeChecker());
        print(animals, animal -> animal.isCanSwim());
    }

    public static void print(List<Animal> animals, WhatCan whatCan) {
        for (Animal animal : animals) {
            if (whatCan.Test(animal)) {
                System.out.println(animal);
            }
        }
    }
}
