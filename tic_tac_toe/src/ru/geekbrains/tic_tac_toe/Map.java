package ru.geekbrains.tic_tac_toe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Map extends JPanel {

    Map() {
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                mouseRelease(e);
            }
        });
    }

    private void mouseRelease(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("x = " + x + " y = " + y);
        if (x >= 0 && x <= 167 && y >= 0 && y <= 147) System.out.println("Квадрат 1");
        if (x > 167 && x <= 334 && y >= 0 && y <= 147) System.out.println("Квадрат 2");
        if (x > 334 && x <= 500 && y >= 0 && y <= 147) System.out.println("Квадрат 3");

        if (x >= 0 && x <= 167 && y > 147 && y <= 314) System.out.println("Квадрат 4");
        if (x > 167 && x <= 334 && y > 147 && y <= 314) System.out.println("Квадрат 5");
        if (x > 334 && x <= 500 && y > 147 && y <= 314) System.out.println("Квадрат 6");

        if (x >= 0 && x <= 167 && y > 314 && y <= 500) System.out.println("Квадрат 7");
        if (x > 167 && x <= 334 && y > 314 && y <= 500) System.out.println("Квадрат 8");
        if (x > 334 && x <= 500 && y > 314 && y <= 500) System.out.println("Квадрат 9");

    }

    static void startNewGame() {
        System.out.println("Новая игра");
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawLine(167, 0, 167, 500);
        g.drawLine(334, 0, 334, 500);
        g.drawLine(0, 147, 500, 147);
        g.drawLine(0, 314, 500, 314);
   }
}
