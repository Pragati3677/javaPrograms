import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextCounterGUI {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Character & Word Counter");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Text area for input
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Label to show counts
        JLabel countLabel = new JLabel("Characters: 0 | Words: 0");
        countLabel.setFont(new Font("Arial", Font.BOLD, 14));
        countLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.add(countLabel, BorderLayout.SOUTH);

        // KeyListener to update counts in real-time
        textArea.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String text = textArea.getText();
                int charCount = text.length();

                // Word count logic (ignore empty strings and extra spaces)
                String[] words = text.trim().split("\\s+");
                int wordCount = (text.trim().isEmpty()) ? 0 : words.length;

                countLabel.setText("Characters: " + charCount + " | Words: " + wordCount);
            }
        });

        // Show the frame
        frame.setVisible(true);
    }
}
