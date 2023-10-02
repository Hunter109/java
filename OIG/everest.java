import javax.swing.*;

/**
 * everest
 */
public class everest extends JFrame {

    public everest() {
        setTitle("banepa -3");

        JLabel name = new JLabel("everest enginerring college");
        name.setBounds(50, 50, 300, 50);
        add(name);

        setLayout(null);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new everest();
    }
}