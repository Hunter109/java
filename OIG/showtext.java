import javax.swing.*;
import java.awt.event.*;

public class showtext extends JFrame implements ActionListener {
    private JTextField name;
    private JButton btn;

    public showtext() {
        setTitle("jadu");
        name = new JTextField();
        name.setBounds(100, 50, 100, 50);
        add(name);

        btn = new JButton("click me");
        btn.setBounds(100, 120, 100, 50);
        add(btn);

        btn.addActionListener(this);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        name.setText("Hunter World");
    }

    public static void main(String[] args) {
        new showtext();
    }

}
