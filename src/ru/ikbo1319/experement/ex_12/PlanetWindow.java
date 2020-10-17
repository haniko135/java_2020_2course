package ru.ikbo1319.experement.ex_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlanetWindow extends JFrame {

    PlanetWindow(){
        super("Planets");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setVisible(true);
        setSize(500,500);

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JComboBox planets = new JComboBox(Planet.values());
        JLabel text = new JLabel("Press button to get know about the gravity of planet.");
        JButton button = new JButton("Press");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Planet planet = (Planet)planets.getSelectedItem();
                double gravity = planet.surfaceGravity();
                text.setText("Gravity of " + planet.getName() + " = " + gravity);
            }
        });

        panel.add(planets);
        panel.add(button);
        panel.add(text);
        setContentPane(panel);
    }

    public static void main(String[] args){
        new PlanetWindow();
    }
}
