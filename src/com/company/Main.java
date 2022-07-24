package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("yorkie", 8, 20, 2, 4,1,20,"long silky");

        dog.eat();
        dog.walk();
        dog.run();

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.acclerate(30);
        outlander.acclerate(20);
        outlander.acclerate(-42);

    }


}
