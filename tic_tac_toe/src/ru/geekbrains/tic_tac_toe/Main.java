package ru.geekbrains.tic_tac_toe;

public class Main {

    public static void main(String[] args) {
        Button button = new Button();


        button.setOnclickListener(new OnClickListener() {
            @Override
            public void onClick(Object o) {
                System.out.println("Перехватили click");
            }
        });

        button.click();
    }
}
