import javax.swing.*;
import java.awt.BorderLayout;

public class swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Frame");

        // operation to do when the window is closed.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(new JLabel("I Love Swing"), BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}