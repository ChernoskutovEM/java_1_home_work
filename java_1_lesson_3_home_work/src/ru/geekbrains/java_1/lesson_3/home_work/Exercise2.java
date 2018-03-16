package ru.geekbrains.java_1.lesson_3.home_work;

import java.util.Scanner;

public class Exercise2 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
        "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
        "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String choiseWord = words[getRandomIndex(words)];
        System.out.print("Отгадайте загаданное слово.\nВвод:");
        choiseWord = extendingWordTolength(choiseWord, 20);
        String strUser;
        do {
            strUser = sc.next();
            strUser = extendingWordTolength(strUser, 20);
            String result = "";
            for (int i = 0; i < choiseWord.length(); i++) {
                if (choiseWord.charAt(i) == strUser.charAt(i)) result = result + choiseWord.charAt(i);
                else result = result + '#';
            }
            System.out.println("Результат : " + result);
        }while(checkWhileAnswer(choiseWord, strUser));
        sc.close();
    }

    private static int getRandomIndex(String[] words) {return (int) (Math.random() * words.length);}
    private static String extendingWordTolength (String word, int lenExtend) {
        for (int i = word.length(); i < lenExtend ; i++) word = word + '#'; return word;
    }
    private static boolean checkWhileAnswer (String choiseWord, String strUser){
        if (choiseWord.equals(strUser)) System.out.println("Поздравляю! Вы угадали слово! Игра окончена.");
        else {System.out.print("Вы не угадали, попробуйте еще раз.\nВвод: "); return true;}
        return false;
    }
}
