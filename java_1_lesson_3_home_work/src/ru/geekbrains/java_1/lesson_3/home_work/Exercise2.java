package ru.geekbrains.java_1.lesson_3.home_work;

import java.util.Scanner;

public class Exercise2 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
        "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
        "pear", "pepper", "pineapple", "pumpkin", "potato"};

        if (words.length > 0) System.out.println(getRandomIndex(words)); else System.out.println("Передана пустая матрица");
        System.out.print("Отгадайте загаданное слово. \nВвод :");
        String str = sc.next();




        sc.close();
    }

    private static int getRandomIndex(String[] words) {return (int) (Math.random() * words.length);}
}
