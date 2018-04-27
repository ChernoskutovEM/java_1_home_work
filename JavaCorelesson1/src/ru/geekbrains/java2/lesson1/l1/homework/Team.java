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

    }

    @Override
    public void swim(int distance) {

    }

    @Override
    public void jump(int height) {

    }

    @Override
    public boolean isOnDistance() {
        return false;
    }

    @Override
    public void showResult() {

    }
}
