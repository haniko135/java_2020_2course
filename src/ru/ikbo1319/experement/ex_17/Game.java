package ru.ikbo1319.experement.ex_17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game extends JFrame {
    private int usersChoice = 0;
    private int compChoice = 0;
    private Random random = new Random();
    private int usersResult = 0;
    private int compResult = 0;
    private int turn = 0;

    Game(){
        super("Rock-Paper-Scissors-Lizard-Spock");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);


        JPanel game = new JPanel();
        game.setLayout(new BorderLayout());
        getContentPane().add(game);

        JPanel buttonsPanel = new JPanel(new FlowLayout());
        buttonsPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        buttonsPanel.setBackground(Color.GRAY);
        game.add(buttonsPanel, BorderLayout.NORTH);

        Font font = new Font("Impact", Font.PLAIN,32);
        JPanel commentsPanel = new JPanel(new FlowLayout());
        commentsPanel.setBackground(Color.pink);
        commentsPanel.setBorder(BorderFactory.createLineBorder(Color.black,5));
        game.add(commentsPanel,BorderLayout.CENTER);

        JPanel finalPanel = new JPanel(new FlowLayout());
        finalPanel.setBackground(Color.LIGHT_GRAY);
        finalPanel.setBorder(BorderFactory.createLineBorder(Color.black,3));
        game.add(finalPanel, BorderLayout.SOUTH);

        JButton scissors = new JButton("<html><h2>Scissors");
        JButton rock = new JButton("<html><h2>Rock");
        JButton paper = new JButton("<html><h2>Paper");
        JButton spock = new JButton("<html><h2>Spock");
        JButton lizard = new JButton("<html><h2>Lizard");
        JButton sbros = new JButton("<html><h2>Reset");
        scissors.setPreferredSize(new Dimension(125, 50));
        rock.setPreferredSize(new Dimension(125, 50));
        spock.setPreferredSize(new Dimension(125, 50));
        paper.setPreferredSize(new Dimension(125, 50));
        lizard.setPreferredSize(new Dimension(125, 50));
        sbros.setPreferredSize(new Dimension(125, 50));
        buttonsPanel.add(scissors);
        buttonsPanel.add(rock);
        buttonsPanel.add(paper);
        buttonsPanel.add(spock);
        buttonsPanel.add(lizard);
        buttonsPanel.add(sbros);

        sbros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usersResult = 0;
                compResult = 0;
                turn = 0;
            }
        });


        scissors.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (turn < 3) {
                    usersChoice = 1;
                    gameProcess(usersChoice, game, commentsPanel, font);
                    turn++;
                    commentsPanel.revalidate();
                }
                else {
                    output(commentsPanel,font);
                    commentsPanel.revalidate();
                }
            }
        });

        rock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn < 3) {
                    usersChoice = 2;
                    gameProcess(usersChoice, game, commentsPanel, font);
                    turn++;
                    commentsPanel.revalidate();
                }
                else{
                    output(commentsPanel,font);
                    commentsPanel.revalidate();
                }
            }
        });

        paper.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn < 3) {
                    usersChoice = 3;
                    gameProcess(usersChoice, game, commentsPanel, font);
                    turn++;
                    commentsPanel.revalidate();
                }
                else{
                    output(commentsPanel, font);
                    commentsPanel.revalidate();
                }
            }
        });

        spock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn < 3) {
                    usersChoice = 4;
                    gameProcess(usersChoice, game, commentsPanel, font);
                    turn++;
                    commentsPanel.revalidate();
                }
                else{
                    output(commentsPanel, font);
                    commentsPanel.revalidate();
                }
            }
        });

        lizard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn < 3) {
                    usersChoice = 5;
                    gameProcess(usersChoice, game, commentsPanel, font);
                    turn++;
                    commentsPanel.revalidate();
                }
                else{
                    output(commentsPanel, font);
                    commentsPanel.revalidate();
                }
            }
        });



        setSize(800, 600);
        setVisible(true);
    }

    public void gameProcess(int usersChoice, JPanel game, JPanel commentsPanel, Font font){

        compChoice = random.nextInt(6);
        if (usersChoice == compChoice || compChoice == 0) {
            while (usersChoice == compChoice || compChoice == 0) {
                compChoice = random.nextInt(6);
            }
        }

        if (turn < 3) {
            if (usersChoice == 1) {
                if (compChoice == 2) {
                    JLabel comment = new JLabel("Rock crushes scissors. You lose");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    compResult++;
                } else if (compChoice == 3) {
                    JLabel comment = new JLabel("Scissors cut paper. You win");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    usersResult++;
                } else if (compChoice == 4) {
                    JLabel comment = new JLabel("Spock smashes scissors. You lose");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    compResult++;
                } else if (compChoice == 5) {
                    JLabel comment = new JLabel("Scissors decapitates lizard. You win");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    usersResult++;
                }
            } else if (usersChoice == 2) {
                if (compChoice == 1) {
                    JLabel comment = new JLabel("Rock crushes scissors. You win");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    usersResult++;
                } else if (compChoice == 3) {
                    JLabel comment = new JLabel("Paper covers rock. You lose");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    compResult++;
                } else if (compChoice == 4) {
                    JLabel comment = new JLabel("Spock vaporizes rock. You lose");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    compResult++;
                } else if (compChoice == 5) {
                    JLabel comment = new JLabel("Rock crushes lizard. You win");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    usersResult++;
                }
            } else if (usersChoice == 3) {
                if (compChoice == 1) {
                    JLabel comment = new JLabel("Scissors cuts paper. You lose");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    compResult++;
                } else if (compChoice == 2) {
                    JLabel comment = new JLabel("Paper covers rock. You win");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    usersResult++;
                } else if (compChoice == 4) {
                    JLabel comment = new JLabel("Paper disproves Spock. You win");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    usersResult++;
                } else if (compChoice == 5) {
                    JLabel comment = new JLabel("Lizard eats paper. You lose");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    compResult++;
                }
            } else if (usersChoice == 4) {
                if (compChoice == 1) {
                    JLabel comment = new JLabel("Spock smashes scissors. You win");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    usersResult++;
                } else if (compChoice == 2) {
                    JLabel comment = new JLabel("Spock vaporizes rock. You win");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    usersResult++;
                } else if (compChoice == 3) {
                    JLabel comment = new JLabel("Paper disproves Spock. You lose");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    compResult++;
                } else if (compChoice == 5) {
                    JLabel comment = new JLabel("Lizard poisons Spock. You lose");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    compResult++;
                }
            } else if (usersChoice == 5) {
                if (compChoice == 1) {
                    JLabel comment = new JLabel("Scissors decapitates lizard. You lose");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    compResult++;
                } else if (compChoice == 2) {
                    JLabel comment = new JLabel("Rock crushes lizard. You lose");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    compResult++;
                } else if (compChoice == 3) {
                    JLabel comment = new JLabel("Lizard eats paper. You win");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    usersResult++;
                } else if (compChoice == 4) {
                    JLabel comment = new JLabel("Lizard poisons Spock. You win");
                    comment.setFont(font);
                    commentsPanel.add(comment);
                    usersResult++;
                }
            }
        }
    }

    public void output(JPanel commentsPanel, Font font){
        if(usersResult > compResult){
            JLabel commentPlus = new JLabel("Congratulations! You win! You can do everything you want!");
            commentPlus.setFont(font);
            commentsPanel.add(commentPlus);
        }
        else{
            JLabel commentMinus = new JLabel("Sorry, but you lose! You can't do everything you want!");
            commentMinus.setFont(font);
            commentsPanel.add(commentMinus);
        }
    }

    public static void main(String[] args){
        new Game();
    }
}
