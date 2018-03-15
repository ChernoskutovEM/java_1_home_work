package ru.geekbrains.java_1.lesson_3.home_work;

import java.util.Random;
import java.util.Scanner;

// Игра угадай число от 0 до 9;
public class Exercise1 {
    private static Random rdn = new Random();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Загаданно случаное целое число от 0 до 9. Угадайте с 3 попыток");
        do doGuessNumber(); while (cheakScannerPut("Повторить игру еще раз? 1 - да, 0 - нет. Ввод: ",0 , 1) == 1);
        sc.close();
    }

    private static void doGuessNumber() {
        int guessNumber = rdn.nextInt(10);
        int i = 0;
        while (true) {
            int getNumber = cheakScannerPut("Потытка номер: " + (i + 1) + "\u001B[36m" + "\nВведите число: " + "\u001B[0m" ,0 ,9);
            if (guessNumber > getNumber) System.out.println("Загаданное число больше");
            else if (guessNumber < getNumber) System.out.println("Загаданное число меньше");
            else {
                System.out.println("\u001B[33m" + "Вы угадали, загаданное число = " + guessNumber + "\u001B[0m");
                break;
            }
            i++;
            if (i == 3) {
                System.out.println("\u001B[31m" + "Вы не смогли угадать за 3 попытки" + "\u001B[0m");
                break;
            }
        }
    }
    private static int cheakScannerPut (String str, int min, int max) {
        int x;
        do {
            System.out.print(str);
            x = sc.nextInt();
            if (x < min || x > max) System.out.println("Пожалуйста вводите целые числа в диапазоне от " + min + " до " + max + "\nВы ввели: " + x + "!");
        }while (x < min || x > max);
        return x;
    }
}