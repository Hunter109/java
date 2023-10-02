import javax.swing.*;
import java.awt.event.*;

public class addingstring extends JFrame implements ActionListener {
    private JTextField input1;
    private JTextField input2, sum;
    private JButton btn;
    private JLabel username;

    public addingstring() {

        username = new JLabel("username");
        username.setBounds(50, 50, 100, 50);
        add(username);

        input1 = new JTextField();
        input1.setBounds(100, 50, 100, 50);
        add(input1);

        input2 = new JTextField();
        input2.setBounds(100, 120, 100, 50);
        add(input2);

        btn = new JButton("click me");
        btn.setBounds(150, 200, 100, 30);
        add(btn);

        sum = new JTextField();
        sum.setBounds(100, 250, 100, 50);
        add(sum);

        btn.addActionListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String a = input1.getText();
        String b = input2.getText();
        String result = (a + b);
        sum.setText(result.toUpperCase());

    }

    public static void main(String[] args) {
        new addingstring();
    }
}
