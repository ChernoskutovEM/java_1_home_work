package ru.geekbrains.java_1.lesson_3.home_work;

public class test {
    public static void main(String[] args) {
//        String result = "Hello";
//        result += result + '1';
//        System.out.println(result);
//
//        result = "Hello";
//        result = result + '1';
//        System.out.println(result);
        String choiseWord = "apple###############";
        String strUser = "apple###############";

        System.out.println(choiseWord == strUser); //сравнение адресов в кучи?
        System.out.println(choiseWord.equals(strUser));
    }
}
