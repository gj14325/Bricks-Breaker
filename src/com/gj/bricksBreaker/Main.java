package com.gj.bricksBreaker;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        Gameplay gamePlay = new Gameplay();
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Bricks Breaker Game");
        obj.setResizable(true);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setJMenuBar(obj.getJMenuBar());
        obj.add(gamePlay);
    }
}
