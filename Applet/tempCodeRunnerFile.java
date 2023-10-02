import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleLoginApp extends JFrame implements ActionListener {

    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JTextField passwordField;
    private JButton verifyButton;

    public SimpleLoginApp() {
        // Set up the JFrame
        setTitle("Login Application");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Initialize components
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        usernameField = new JTextField();
        passwordField = new JTextField();
        verifyButton = new JButton("Verify");

        // Set component positions
        usernameLabel.setBounds(50, 30, 80, 25);
        passwordLabel.setBounds(50, 70, 80, 25);
        usernameField.setBounds(130, 30, 150, 25);
        passwordField.setBounds(130, 70, 150, 25);
        verifyButton.setBounds(130, 110, 80, 25);

        // Add components to the JFrame
        add(usernameLabel);
        add(passwordLabel);
        add(usernameField);
        add(passwordField);
        add(verifyButton);

        // Set button click event
        verifyButton.addActionListener(this);

        // Set the JFrame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button click event
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("admin") && password.equals("utsav")) {
            JOptionPane.showMessageDialog(this, "Successfully logged in!");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid credentials. Try again.");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the SimpleLoginApp
        new SimpleLoginApp();
    }
}
