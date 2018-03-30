package ru.geekbrains.java1.lesson6.home_work;

import ru.geekbrains.java1.lesson6.home_work.animal.Animal;
import ru.geekbrains.java1.lesson6.home_work.animal.sub_animal.Cat;
import ru.geekbrains.java1.lesson6.home_work.animal.sub_animal.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog("Greg");
        Animal animal2 = new Cat("Barsik");
        animal1.run(550);
        animal1.jump(0.2f);
        animal1.swim(10);
        animal2.run(550);
        animal2.jump(0.2f);
        animal2.swim(10);
    }
}
