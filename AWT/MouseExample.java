import javax.swing.*;
import java.awt.event.*;

public class MouseExample extends JFrame {

    public MouseExample() {
        setTitle("Mouse Event Handling Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Click or hover over the frame");

        add(label);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at " + e.getPoint());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse Entered at " + e.getPoint());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("Mouse Exited");
            }
        });

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseExample();
    }
}
