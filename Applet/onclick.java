import javax.swing.*;
import java.awt.event.*;

public class onclick extends JFrame implements ActionListener {
    private JButton closeButton;

    public onclick() {

        closeButton = new JButton("Close");
        closeButton.setBounds(100, 80, 100, 40);
        add(closeButton);

        closeButton.addActionListener(this);

        setLayout(null);
        setSize(400, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    public static void main(String[] args) {
        new onclick();
    }
}
