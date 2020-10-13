package ru.ikbo1319.experement.ex_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game extends JFrame {
    private Random random = new Random();
    private int randomNum = random.nextInt(20);

    Game(){
        super("Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setSize(500, 400);
        setVisible(true);


        JTextField field = new JTextField("", 20);
        JButton button = new JButton("Click");
        button.setBounds(40,40, 150, 50);

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.add(field);
        panel.add(button);
        setContentPane(panel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cnt = 0;
                int num = Integer.parseInt(field.getText());
                if(num == randomNum){
                    JOptionPane.showMessageDialog(Game.this,"Congratulations, you win!!!");
                    System.exit(0);
                }
                else if(num < randomNum){
                    JOptionPane.showMessageDialog(Game.this, "The secret number was bigger than your number.");
                }
                else {
                    JOptionPane.showMessageDialog(Game.this, "The secret number was less than your number.");
                }
                cnt++;
                if(cnt >= 3){
                    JOptionPane.showMessageDialog(Game.this,"You are out ouf tries");
                    System.exit(0);
                }
            }
        });

        System.out.println(randomNum);
    }



    public static void main(String[] args){
        new Game();
    }
}
