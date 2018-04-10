package ru.geekbrains.tic_tac_toe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame implements ActionListener {

    public static void main(String[] args) {
//        /перенаправление потока
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameWindow();
            }
        });
    }

    private final JButton btnExit = new JButton("Exit");
    private final JButton btnNewGame = new JButton("New game");

    private GameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500, 500);
        setTitle("Крестики-нолики");

        btnNewGame.addActionListener(this);
        btnExit.addActionListener(this);

        JPanel bottomPanel = new JPanel(new GridLayout(1, 2));
        bottomPanel.add(btnNewGame);
        bottomPanel.add(btnExit);
        add(bottomPanel, BorderLayout.SOUTH);

        Map map = new Map();
        add(map, BorderLayout.CENTER);

        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if(src == btnNewGame) {
            System.out.println("Нажали NewGame");
            Map.startNewGame();
        } else if (src == btnExit) {
            System.out.println("Нажали Exit");
        }
    }
}
