package ru.geekbrains.java_1.lesson_5.home_work;

import ru.geekbrains.java_1.lesson_5.home_work.list_staff.Staff;

public class Main {
    public static void main(String[] args) {
        Staff[] staff = new Staff[5];
        staff[0] = new Staff("Ivanov", "engineer", "ivanov@gmail.com", "+79130001111", 10000, 50);
        staff[1] = new Staff("Petrov", "FSB agent", "Petrov@gmail.com", "+79130001112", 250000, 27);
        staff[2] = new Staff("Smit", "CIA agent", "Smit@gmail.com", "+79130001113", 240000, 32);
        staff[3] = new Staff("Goneshov", "pilot", "Goneshov@gmail.com", "+79130001114", 15500, 42);
        staff[4] = new Staff("Korjalov", "musician", "Korjalov@gmail.com", "+79130001115", 16000, 18);
//        Staff staff1 = new Staff("Ivanov");
//        staff1.printfOut();
//        staff[1].printfOut();
        for (int i = 0; i < staff.length; i++) {
            staff[i].printfOut(40);
        }

    }
}
