package ru.geekbrains.java1.lesson4.home_work;

import java.util.Arrays;

public class test {
    private static char[][] arr = new char[3][3];
    public static void main(String[] args) {
//        int[][] arr = new int [4][4];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[j][i] = j;
//             }
//         }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println();
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//             }
//        }
////        System.out.println();
////        System.out.println(Arrays.deepToString(arr));


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j + 1 == arr.length) arr[j][i] = 'O';
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println(MainClass.cheakToWin(arr, 'O'));

    }
}
