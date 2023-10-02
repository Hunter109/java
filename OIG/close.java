import javax.swing.*;
import java.awt.event.*;

public class close extends JFrame implements ActionListener {

    private JButton btn;

    public close() {
        setTitle("terminating on clicking button ");
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
        System.exit(0);
    }

    public static void main(String args[]) {
        new close();
    }

}