import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterApp extends JFrame implements ActionListener {
    private JTextField counterField;
    private JButton countUpBtn, countDownBtn, resetBtn;
    private int counter = 0;

    public CounterApp() {
        setTitle("Counter");
        setSize(350, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center the window

        // Components
        JLabel label = new JLabel("Counter");
        counterField = new JTextField("0", 5);
        counterField.setEditable(false);

        countUpBtn = new JButton("Count Up");
        countDownBtn = new JButton("Count Down");
        resetBtn = new JButton("Reset");

        // Action listeners
        countUpBtn.addActionListener(this);
        countDownBtn.addActionListener(this);
        resetBtn.addActionListener(this);

        // Layout
        setLayout(new FlowLayout());
        add(label);
        add(counterField);
        add(countUpBtn);
        add(countDownBtn);
        add(resetBtn);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == countUpBtn) {
            counter++;
        } else if (e.getSource() == countDownBtn) {
            counter--;
        } else if (e.getSource() == resetBtn) {
            counter = 0;
        }

        counterField.setText(String.valueOf(counter));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CounterApp app = new CounterApp();
            app.setVisible(true);
        });
    }
}
