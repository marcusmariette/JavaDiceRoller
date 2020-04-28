import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Random;
//import java.util.Scanner;

public class DiceRoller{
  JFrame f;
  public static int usertotal;
  public static int comptotal;
  DiceRoller(){
    f=new JFrame("Dice War");//creating instance of JFrame

    JButton roll = new JButton("Roll Dice");//creating instance of JButton
    JButton higher = new JButton("Higher");//creating instance of JButton
    JButton lower = new JButton("Lower");//creating instance of JButton
    JLabel i = new JLabel();
    JLabel j = new JLabel();
    JLabel k = new JLabel();
    JLabel l = new JLabel();
    JLabel compscore = new JLabel("");
    JLabel userscore = new JLabel("");

    roll.setBounds(130,50,100, 40);
    higher.setBounds(50,300,100, 40);
    lower.setBounds(200,300,100, 40);

    roll.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e)
      {
        int comp1 = roll();
        int comp2 = roll();
        DiceRoller.comptotal = comp1 + comp2;
        i.setIcon(new ImageIcon("images\\" + comp1 + ".png"));
        j.setIcon(new ImageIcon("images\\" + comp2 + ".png"));
        i.setBounds(80,100,100,100);
        j.setBounds(230,100,100,100);
        compscore.setText("Dealer rolled " + comptotal + ". Will you roll higher or lower?");
        compscore.setBounds(50, 200, 500, 100);
        f.add(i);
        f.add(j);
        f.add(compscore);
        f.revalidate();
        f.repaint();
        System.out.print(comptotal);
    }
    });

    higher.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e)
      {
        int user1 = roll();
        int user2 = roll();
        DiceRoller.usertotal = user1 + user2;
        String win;
        k.setIcon(new ImageIcon("images\\" + user1 + ".png"));
        l.setIcon(new ImageIcon("images\\" + user2 + ".png"));
        k.setBounds(80,350,100,100);
        l.setBounds(230,350,100,100);
        if (DiceRoller.usertotal > DiceRoller.comptotal)
        {
          win = "win";
        }
        else
        {
          win = "lose";
        }
        userscore.setText("You rolled " + usertotal + ". You " + win + "!");
        userscore.setBounds(50, 400, 500, 100);
        f.add(k);
        f.add(l);
        f.add(userscore);
        f.revalidate();
        f.repaint();
        System.out.print(usertotal);
    }
    });

    lower.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e)
      {
        int user1 = roll();
        int user2 = roll();
        DiceRoller.usertotal = user1 + user2;
        String win;
        k.setIcon(new ImageIcon("images\\" + user1 + ".png"));
        l.setIcon(new ImageIcon("images\\" + user2 + ".png"));
        k.setBounds(80,350,100,100);
        l.setBounds(230,350,100,100);
        if (DiceRoller.usertotal < DiceRoller.comptotal)
        {
          win = "win";
        }
        else
        {
          win = "lose";
        }
        userscore.setText("You rolled " + usertotal + ". You " + win + "!");
        userscore.setBounds(50, 400, 500, 100);
        f.add(k);
        f.add(l);
        f.add(userscore);
        f.revalidate();
        f.repaint();
        System.out.print(usertotal);
    }
    });

    f.add(roll);//adding button in JFrame
    f.add(higher);//adding button in JFrame
    f.add(lower);//adding button in JFrame

    f.setSize(400,600);//400 width and 500 height
    f.setLayout(null);//using no layout managers
    f.setVisible(true);//making the frame visible
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

    int roll() {
        Random r = new Random();
        return r.nextInt(9) + 1;
    }

    public static void main(String[] args) {
    new DiceRoller();
    }
}
