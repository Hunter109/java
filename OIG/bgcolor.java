import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class bgcolor extends JFrame implements ActionListener {

    private JButton btn;

    public bgcolor() {
        setTitle("bgcooor change on clicking button ");
        btn = new JButton("click this");
        btn.setBounds(100, 50, 100, 50);
        add(btn);

        btn.addActionListener(this);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getContentPane().setBackground(Color.RED);
    }

    public static void main(String args[]) {
        new bgcolor();
    }

}