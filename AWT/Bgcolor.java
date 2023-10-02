import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bgcolor extends JFrame implements ActionListener {
   private JButton button;

   public Bgcolor() {
      setTitle("Button Background Color Change Example");

      button = new JButton("Click Me!");
      button.setBounds(100, 50, 100, 50);
      add(button);
      button.addActionListener(this);

      setSize(300, 200);
      setLayout(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      getContentPane().setBackground(Color.GREEN);
   }

   public static void main(String[] args) {

      new Bgcolor();

   }
}
