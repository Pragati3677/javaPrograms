import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    
    // Declare necessary components
    private JTextField displayField;
    private double num1, num2, result;
    private String operator;
    
    public Calculator() {
        // Set the frame properties
        setTitle("Standard Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Initialize the text field
        displayField = new JTextField();
        displayField.setEditable(false);
        add(displayField, BorderLayout.NORTH);
        
        // Panel to hold buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));
        
        // Add buttons to the panel
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+",
            "%", "√", "x²", "x³"
        };
        
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }
        
        add(buttonPanel, BorderLayout.CENTER);
    }
    
    // ActionListener class to handle button clicks
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            
            // Handling numbers and operators
            if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
                displayField.setText(displayField.getText() + command);
            } 
            else if (command.charAt(0) == 'C') {
                displayField.setText("");
                num1 = num2 = result = 0;
                operator = "";
            } 
            else if (command.charAt(0) == '=') {
                num2 = Double.parseDouble(displayField.getText());
                calculateResult();
                displayField.setText(String.valueOf(result));
            } 
            else {
                if (!displayField.getText().isEmpty()) {
                    num1 = Double.parseDouble(displayField.getText());
                    displayField.setText("");
                    operator = command;
                }
            }
        }
    }
    
    // Method to perform calculations
    private void calculateResult() {
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            case "√":
                result = Math.sqrt(num1);
                break;
            case "x²":
                result = Math.pow(num1, 2);
                break;
            case "x³":
                result = Math.pow(num1, 3);
                break;
        }
    }
    
    public static void main(String[] args) {
        // Run the calculator
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}
