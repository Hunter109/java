import javax.swing.*;
import java.awt.event.*;

public class mouse extends JFrame implements MouseListener {

    private JLabel label;

    public mouse() {
        setTitle("Mouse Event Handling Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Click or hover over the frame");
        label.setBounds(10, 30, 1000, 30);

        add(label);
        addMouseListener(this);

        setLayout(null);
        setSize(300, 200);
        setVisible(true);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered at " + e.getPoint());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at " + e.getPoint());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }

    // These two methods are required to implement MouseListener but are not used in
    // this example.
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    public static void main(String[] args) {
        new mouse();
    }
}
