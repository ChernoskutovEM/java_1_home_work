package ru.geekbrains.java1.lesson6.home_work.animal.sub_animal;

import ru.geekbrains.java1.lesson6.home_work.animal.Animal;

public class Cat extends Animal{
    public Cat (String name){
        super(name, 200, 2.0f, 0);
    }
    @Override
    public void run(int distRun){
        if (distRun <= DIST_RUN){
            System.out.println("Cat's name " + this.name + " run: true");
        }
        else System.out.println("Cat's name " + this.name + " run: false");
        super.run(distRun);
    }
    @Override
    public void swim(int distSwim){
        if (distSwim <= DIST_SWIM){
            System.out.println("Cat's name " + this.name + " swim: true");
        }
        else System.out.println("Cat's name " + this.name + " swim: false");
        super.swim(distSwim);
    }
    @Override
    public void jump(float hJump){
        if (hJump <= H_JUMP){
            System.out.println("Cat's name " + this.name + " jump: true");
        }
        else System.out.println("Cat's name " + this.name + " jump: false");
        super.jump(hJump);
    }
}
