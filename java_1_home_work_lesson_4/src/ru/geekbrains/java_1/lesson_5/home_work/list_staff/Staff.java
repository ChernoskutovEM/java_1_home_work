package ru.geekbrains.java_1.lesson_5.home_work.list_staff;

public class Staff {
    private String name;
    private String appointment;
    private String email;
    private String numberTel;
    private int salary;
    private int age;

    public Staff(String name, String appointment, String email, String numberTel, int salary, int age) {
        this.name = name;
        this.appointment = appointment;
        this.email = email;
        this.numberTel = numberTel;
        this.salary = salary;
        this.age = age;
    }
    public Staff(String name) {
        this.name = name;
        this.appointment = "unknown";
        this.email = "unknown";
        this.numberTel = "unknown";
        this.salary = 0;
        this.age = (int)(Math.random() * 80 + 18) - 18;
    }
    public void printfOut() {
        System.out.printf("Name: %s, Appointment: %s, Email: %s, NumberTel: %s, Salary: %d$, Age: %d \n",
                name, appointment, email, numberTel, salary, age );
    }
    public void printfOut(int age) {
        if (this.age >= age) {
            System.out.printf("Name: %s, Appointment: %s, Email: %s, NumberTel: %s, Salary: %d$, Age: %d \n",
                    name, appointment, email, numberTel, salary, this.age);
        }
    }
}
