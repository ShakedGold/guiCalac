package Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

import java.awt.BorderLayout;


import java.awt.Color;

public class Main extends JFrame {
    /**
     *there was an error. this fixes idk why
     */
    private static final long serialVersionUID = -7379587371723737961L;

    private static JFrame settings(int width, int height) {
        JFrame frame = new JFrame("Calculator");
        JPanel screen = new JPanel();

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.getContentPane().add(screen, BorderLayout.CENTER);    
		frame.setBackground(Color.WHITE);
		frame.setTitle("Calculator");
        return frame;
        
    }
    private static void start(JFrame frame) {
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        start(settings(400, 600));
    }
}