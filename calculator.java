import java.awt.*;
import javax.swing.*;

public class calculator extends JFrame {

    calculator() {
        JTextField xd = new JTextField();
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton bplus = new JButton("+");

        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton bminus = new JButton("-");

        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton bmultiply = new JButton("*");

        JButton bdot = new JButton(".");
        JButton b0 = new JButton("0");
        JButton bdivide = new JButton("/");
        JButton bequal = new JButton("=");

        // setting grid layout of 3 rows and 3 columns
        add(b1);
        add(b2);
        add(b3);
        add(bplus);
        add(b4);
        add(b5);
        add(b6);
        add(bminus);
        add(b7);
        add(b8);
        add(b9);
        add(bmultiply);
        add(bdot);
        add(b0);
        add(bdivide);
        add(bequal);
        // setLayout(new GridLayout(4,4));
        setLayout(new GridLayout(4, 4));
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new calculator();
    }
}
