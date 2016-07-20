package com.prolificidea.codeoff;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Matrix Rain");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(Config.SCREEN_SIZE, Config.SCREEN_SIZE);
        frame.setResizable(false);
        frame.add(new Rain());
        frame.setVisible(true);
    }

}