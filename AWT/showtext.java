import java.awt.event.*;

import javax.swing.*;

public class showtext extends JFrame implements ActionListener {
    private JTextField name;
    private JButton btn;

    public showtext() {
        setTitle("showing text when button click");

        name = new JTextField();
        name.setBounds(100, 50, 150, 80);
        add(name);

        btn = new JButton("click here");
        btn.setBounds(150, 200, 100, 50);
        add(btn);

        btn.addActionListener(this);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        name.setText("HUNTER");

    }

    public static void main(String[] args) {
        new showtext();
    }

}
