import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BackgroundColorChanger {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Background Color Changer");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel whose background will change
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // ComboBox with color names
        String[] colors = {"White", "Red", "Green", "Blue", "Yellow", "Gray"};
        JComboBox<String> colorComboBox = new JComboBox<>(colors);
        panel.add(new JLabel("Choose Background Color:"));
        panel.add(colorComboBox);

        // Add the panel to the frame
        frame.add(panel);

        // ItemListener to change background color
        colorComboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedColor = (String) e.getItem();
                    switch (selectedColor) {
                        case "Red":
                            panel.setBackground(Color.RED);
                            break;
                        case "Green":
                            panel.setBackground(Color.GREEN);
                            break;
                        case "Blue":
                            panel.setBackground(Color.BLUE);
                            break;
                        case "Yellow":
                            panel.setBackground(Color.YELLOW);
                            break;
                        case "Gray":
                            panel.setBackground(Color.GRAY);
                            break;
                        default:
                            panel.setBackground(Color.WHITE);
                    }
                }
            }
        });

        // Set default background and show the frame
        panel.setBackground(Color.WHITE);
        frame.setVisible(true);
    }
}
