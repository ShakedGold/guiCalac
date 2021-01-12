package Main;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.BasicStroke;
import java.awt.Color;

public class Main extends JFrame {
    /**
     * There was an error. This fixes idk why
     */
    private static final long serialVersionUID = -7379587371723737961L;

    private static JFrame settings(int width, int height, int pHeight) {
        JFrame frame = new JFrame("Calculator");
        JPanel screen = new JPanel();
        JPanel buttons = new JPanel();
        JLabel label = new JLabel("Click The Numbers To Calculate");

        label.setBounds(0, 600, screen.getWidth(), screen.getHeight());

        screen.setBounds(0,0,width - 15, pHeight);
        screen.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(4.2f)));
        buttons.setBounds(600 - height, width, screen.getWidth(), screen.getHeight());
        buttons.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(4.2f)));

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.getContentPane().add(screen);
        frame.getContentPane().add(buttons);
		frame.setBackground(Color.WHITE);
		frame.setTitle("Calculator");
        return frame;
        
    }
    private static void start(JFrame frame) {
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        start(settings(400, 600, 150));
    }
}