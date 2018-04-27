package ru.geekbrains.java2.lesson1.l1.homework;

import ru.geekbrains.java2.lesson1.l1.homework.competitors.Competitor;

public class Team implements Competitor{

    String type;
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    boolean onDistance;

    public Team(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance, boolean onDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = onDistance;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance){
            System.out.println(type + " " + name + " успешно справился с кроссом");
        } else {
            System.out.println(type + " " + name + " не смог преодолеть кросс");
            onDistance = false;
        }
    }

    @Override
    public void swim(int distance) {
        if (maxSwimDistance == 0){
            System.out.println(type + " " + name + " не умеет плавать");
            onDistance = false;
            return;
        }
        if (distance <= maxSwimDistance){
            System.out.println(type + " " + name + " успешно проплыл дистанцию");
        } else {
            System.out.println(type + " " + name + " не смог проплыть дистанцию");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight){
            System.out.println(type + " " + name + " успешно перепрыгнул препятствие");
        } else {
            System.out.println(type + " " + name + " не смог перепрыгнуть препятствие");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void showResult(){
        System.out.println(name + ": " + onDistance);
    }
}
