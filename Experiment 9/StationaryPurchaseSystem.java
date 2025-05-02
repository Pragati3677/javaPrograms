import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StationaryPurchaseSystem extends JFrame {
    JCheckBox cbNotebook, cbPen, cbPencil;
    JButton orderButton;

    public StationaryPurchaseSystem() {
        // Frame settings
        setTitle("Stationary Purchase System");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Checkboxes with prices
        cbNotebook = new JCheckBox("Notebook @ 50");
        cbPen = new JCheckBox("Pen @ 30");
        cbPencil = new JCheckBox("Pencil @ 10");

        // Order button
        orderButton = new JButton("Order");

        // Add components to frame
        add(cbNotebook);
        add(cbPen);
        add(cbPencil);
        add(orderButton);

        // Button click listener
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = 0;
                StringBuilder orderDetails = new StringBuilder();

                // Handle Notebook
                if (cbNotebook.isSelected()) {
                    String qtyStr = JOptionPane.showInputDialog(null, "Enter Quantity for Notebook");
                    int qty = Integer.parseInt(qtyStr);
                    double amount = qty * 50;
                    orderDetails.append("Notebook Quantity: ").append(qty)
                                .append("  Total:").append(amount).append("\n");
                    total += amount;
                }

                // Handle Pen
                if (cbPen.isSelected()) {
                    String qtyStr = JOptionPane.showInputDialog(null, "Enter Quantity for Pen");
                    int qty = Integer.parseInt(qtyStr);
                    double amount = qty * 30;
                    orderDetails.append("Pen Quantity: ").append(qty)
                                .append("  Total:").append(amount).append("\n");
                    total += amount;
                }

                // Handle Pencil
                if (cbPencil.isSelected()) {
                    String qtyStr = JOptionPane.showInputDialog(null, "Enter Quantity for Pencil");
                    int qty = Integer.parseInt(qtyStr);
                    double amount = qty * 10;
                    orderDetails.append("Pencil Quantity: ").append(qty)
                                .append("  Total:").append(amount).append("\n");
                    total += amount;
                }

                if (total > 0) {
                    orderDetails.append("----------------------\n");
                    orderDetails.append("Total: ").append(total);
                    JOptionPane.showMessageDialog(null, orderDetails.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Successfully Ordered.", "Alert", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Please select at least one item.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StationaryPurchaseSystem().setVisible(true);
        });
    }
}
