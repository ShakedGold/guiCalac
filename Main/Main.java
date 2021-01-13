package Main;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.Color;

public class Main extends JFrame {
    /**
     * There was an error. This fixes idk why
     */
    private static final long serialVersionUID = -7379587371723737961L;

    private static JFrame settings(int width, int height, int pHeight) {
        int bPosition = 0;
        JFrame frame = new JFrame("Calculator");
        JPanel screen = new JPanel();
        JPanel pButtons = new JPanel();
        JLabel label = new JLabel("Click The Numbers To Calculate");
        JButton[] buttons = {new JButton("1"), new JButton("2"), new JButton("3"), new JButton("4"), 
                            new JButton("5"), new JButton("6"), new JButton("7"), new JButton("8"), new JButton("9")};

        label.setBounds(0, 600, screen.getWidth(), screen.getHeight());

        screen.setBounds(0, 0, width - 15, pHeight);
        pButtons.setBounds(0, pHeight, width - 15, height - pHeight);
        screen.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(4.2f)));
        pButtons.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(4.2f)));

        for (int i = 0; i < buttons.length; i++) {
            bPosition += i + 70;
            if (i < 3){
                buttons[i].setBounds(bPosition - 65, 477, 80, 80);
                frame.add(buttons[i]);
            }
            else if(i == 3) bPosition -= i * 130;
            else if (i >= 3 && i < 6) {
                buttons[i].setBounds(bPosition + 4, 397, 80, 80);
                frame.add(buttons[i]);
            }
            else if (i >= 5) {
                buttons[i].setBounds(bPosition + 4, 337, 80, 80);
                frame.add(buttons[i]);
            }
        }

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.getContentPane().add(screen);
        frame.getContentPane().add(pButtons); 
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