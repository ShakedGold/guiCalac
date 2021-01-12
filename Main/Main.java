package Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Main extends JFrame {
    private static void settings(int width, int height) {
        JFrame frame = new JFrame("Calculator");
        JPanel screen = new JPanel();
        
        frame.setSize(width, height);
        frame.add(screen);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
		frame.setBackground(Color.WHITE);
		frame.setTitle("Calculator");
		frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        settings(400, 600);
    }
}