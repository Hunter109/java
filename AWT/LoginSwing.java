import javax.swing.*;
import java.awt.*;

public class LoginSwing extends JFrame {
    public LoginSwing() {
        setTitle("User Registration Form");
        setSize(400, 500); // Increased height to accommodate all components
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel registrationLabel = new JLabel("REGISTRATION FORM");
        registrationLabel.setBounds(50, 20, 150, 30);
        add(registrationLabel);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(50, 60, 50, 30);
        add(nameLabel);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 60, 150, 30);
        add(nameField);

        JButton saveDetailsButton = new JButton("Save Detail");
        saveDetailsButton.setBounds(220, 20, 100, 30);
        add(saveDetailsButton);

        JLabel ageLabel = new JLabel("Age");
        ageLabel.setBounds(50, 100, 50, 30);
        add(ageLabel);
        JTextField ageField = new JTextField("18");
        ageField.setBounds(150, 100, 50, 30);
        add(ageField);

        ButtonGroup genderGroup = new ButtonGroup();
        JRadioButton maleRadioButton = new JRadioButton("Male", true);
        maleRadioButton.setBounds(50, 140, 70, 30);
        genderGroup.add(maleRadioButton);
        add(maleRadioButton);

        JRadioButton femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(120, 140, 80, 30);
        genderGroup.add(femaleRadioButton);
        add(femaleRadioButton);

        JRadioButton otherRadioButton = new JRadioButton("Other");
        otherRadioButton.setBounds(200, 140, 80, 30);
        genderGroup.add(otherRadioButton);
        add(otherRadioButton);

        JCheckBox drawingCheckBox = new JCheckBox("Drawing");
        drawingCheckBox.setBounds(50, 180, 100, 30);
        add(drawingCheckBox);

        JCheckBox ishaCheckBox = new JCheckBox("Isha");
        ishaCheckBox.setBounds(150, 180, 100, 30);
        add(ishaCheckBox);

        Choice courseChoice = new Choice();
        courseChoice.add("Java");
        courseChoice.add("C++");
        courseChoice.add("C#");
        courseChoice.setBounds(50, 220, 150, 30);
        add(courseChoice);

        JTextArea textArea = new JTextArea("My name is Utsav Wagle");
        textArea.setBounds(50, 260, 300, 80);
        add(textArea);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginSwing();
        });
    }
}
