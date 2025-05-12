import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumberGUI extends JFrame implements ActionListener {
    private JTextField inputField, resultField;
    private JButton reverseButton;

    public ReverseNumberGUI() {
        setTitle("Number Reverser");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        
        JLabel inputLabel = new JLabel("Enter a number:");
        inputField = new JTextField(15);

        reverseButton = new JButton("Reverse");
        reverseButton.addActionListener(this);

        JLabel resultLabel = new JLabel("Reversed number:");
        resultField = new JTextField(15);
        resultField.setEditable(false);

      
        setLayout(new GridLayout(4, 1));
        add(inputLabel);
        add(inputField);
        add(reverseButton);
        add(resultLabel);
        add(resultField);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int number = Integer.parseInt(inputField.getText());
            int reversed = 0;

            while (number != 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }

            resultField.setText(String.valueOf(reversed));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid integer.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ReverseNumberGUI app = new ReverseNumberGUI();
            app.setVisible(true);
        });
    }
}
