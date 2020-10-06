package ru.ikbo1319.experement.ex_8.pr_2;

import javax.swing.*;

public class PictureWindow extends JFrame {

    PictureWindow(String[] args){
        super("Picture");
        setSize(700,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setVisible(true);
        Picture picture = new Picture(args[0]);
        add(picture);
    }

    public static void main (String[] args){ new PictureWindow(args); }
}
