import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
class FruitOrderApp extends JFrame implements ActionListener {
    JLabel nameLabel, fruitLabel, qtyLabel;
    JTextField nameField, qtyField;
    JComboBox<String> fruitBox;
    JButton submitBtn;
    JTextArea outputArea;

    public FruitOrderApp() {
        setTitle("Fruit Ordering System");
        setSize(400, 400);
        setLayout(new FlowLayout());

        nameLabel = new JLabel("Customer Name:");
        nameField = new JTextField(20);

        fruitLabel = new JLabel("Select Fruit:");
        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};
        fruitBox = new JComboBox<>(fruits);

        qtyLabel = new JLabel("Quantity (kg):");
        qtyField = new JTextField(5);

        submitBtn = new JButton("Place Order");
        submitBtn.addActionListener(this);

        outputArea = new JTextArea(5, 30);
        outputArea.setEditable(false);

        add(nameLabel);
        add(nameField);
        add(fruitLabel);
        add(fruitBox);
        add(qtyLabel);
        add(qtyField);
        add(submitBtn);
        add(outputArea);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String fruit = (String) fruitBox.getSelectedItem();
        String qty = qtyField.getText();

        String output = "Order Summary:\n"
                      + "Name: " + name + "\n"
                      + "Fruit: " + fruit + "\n"
                      + "Quantity: " + qty + " kg";

        outputArea.setText(output);
    }

    public static void main(String[] args) {
        new FruitOrderApp();
    }
}
