package ru.geekbrains.java1.lesson4.home_work;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
    private static final int SIZEFIELD_X = 3;
    private static final int SIZEFIELD_Y = 3;
    private static final int STEP_TO_WIN = 3;
    private static final char PLAYER_DOT = 'O';
    private static final char AI_DOT = 'X';
    private static final char DEFAULT_DOT = '*';
    private static final char ARR_FIELD[][] = new char[SIZEFIELD_X][SIZEFIELD_Y];
    private static Scanner sc = new Scanner(System.in);
    private static Random rnd = new Random();

    public static void main(String[] args) {
        createField(SIZEFIELD_X, SIZEFIELD_Y);
        printField(ARR_FIELD);
        do {
            playerStep();
            if (cheakToWin(ARR_FIELD, PLAYER_DOT)) {
                printField(ARR_FIELD);
                System.out.println("Вы выйграли");
                break;
            }
            aiStep();
            printField(ARR_FIELD);
            if (cheakToWin(ARR_FIELD, AI_DOT)) {
                System.out.println("Компьютер выйграл");
                break;
            }
        }while (!cheakToDrawGame());
        sc.close();
    }

    private static void createField(int sizeX, int sizeY) {
        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                ARR_FIELD[i][j] = DEFAULT_DOT;
            }
        }
    }
    private static void printField(char[][] arr) {
        System.out.print("+ ");
        for (int i = 1; i < arr.length + 1; i++) System.out.print(i + " ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            System.out.print(i + 1 + " ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }
    private static void playerStep() {
        int x;
        int y;
        do{
            System.out.println("Введите координаты X и Y: ");
            x = sc.nextInt();
            y = sc.nextInt();
        }while (checkOutXY(x - 1, y - 1) || checkFillIn(x - 1, y - 1));
        ARR_FIELD[y - 1][x - 1] = PLAYER_DOT;
    }

    private static void aiStep() {
        int x;
        int y;
        do{
            x = rnd.nextInt(SIZEFIELD_Y);
            y = rnd.nextInt(SIZEFIELD_X);
        }while (checkOutXY(x, y) || checkFillIn(x, y));
        ARR_FIELD[y][x] = AI_DOT;
    }
    private static  boolean checkOutXY(int x, int y) {
        if (x >= 0 && x < SIZEFIELD_X && y >= 0 && y < SIZEFIELD_Y) return false;
        return true; //возврат true если введены Х У за границей поля
    }
    private static boolean checkFillIn(int x, int y) {
        if (ARR_FIELD[y][x] == DEFAULT_DOT) return false;
        return true; //возврат true если поле не доступно для заполнения игроками
    }
    private static boolean cheakToDrawGame () {
        for (int i = 0; i < ARR_FIELD.length; i++) {
            for (int j = 0; j < ARR_FIELD[i].length ; j++) {
                if (ARR_FIELD[i][j] == DEFAULT_DOT) return false;
            }
        }
        return true;
    }

    protected static boolean cheakToWin (char[][] arr, char dotType) {
        int flag;
        //проверка по строкам
        for (int i = 0; i < arr.length ; i++) {
            flag = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == dotType) flag += 1;
                if (flag == STEP_TO_WIN) return true;
            }
        }
        // проверка по столбцам
        for (int i = 0; i < arr.length ; i++) {
            flag = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[j][i] == dotType) flag += 1;
                if (flag == STEP_TO_WIN) return true;
            }
        }
        //проверка диагоналей
        flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] == dotType) flag += 1;
            if (flag == STEP_TO_WIN) return true;
        }
        flag = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j + 1 == arr.length && arr[j][i] == dotType) flag += 1;
                if (flag == STEP_TO_WIN) return true;
            }
        }
        return false;
    }
}
