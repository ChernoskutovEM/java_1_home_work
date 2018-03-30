package ru.geekbrains.java1.lesson6.home_work.animal;

import java.util.Random;

abstract public class Animal {
    protected String name;
    protected int DIST_RUN;
    protected float H_JUMP;
    protected int DIST_SWIM;

    private Random rnd = new Random();

    public Animal(String name, int distRun, float hJump, int distSwim){
        this.name = name;
        this.DIST_RUN = 400 + rnd.nextInt(distRun - 100);;
        this.H_JUMP = hJump;
        this.DIST_SWIM = distSwim;
    }
    public void run(int distRun){
        System.out.printf("DIST_RUN(%d) _ distRun(%d) \n", DIST_RUN, distRun);
    }
    public void swim(int distSwim){
        System.out.printf("DIST_SWIM(%d) _ distSwim(%d) \n", DIST_SWIM, distSwim);
    }
    public void jump(float hJump){
        System.out.printf("H_JUMP(%f) _ distSwim(%f) \n", H_JUMP, hJump);
    }
}
