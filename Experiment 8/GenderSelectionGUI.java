import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GenderSelectionGUI extends JFrame implements ActionListener {
    private JRadioButton maleBtn, femaleBtn, otherBtn;
    private JButton submitBtn;
    private JLabel resultLabel;

    public GenderSelectionGUI() {
        setTitle("Gender Selection");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        
        JLabel prompt = new JLabel("Select your gender:");
        maleBtn = new JRadioButton("Male");
        femaleBtn = new JRadioButton("Female");
        otherBtn = new JRadioButton("Other");

        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleBtn);
        genderGroup.add(femaleBtn);
        genderGroup.add(otherBtn);

        submitBtn = new JButton("Submit");
        submitBtn.addActionListener(this);

        resultLabel = new JLabel("");

      
        setLayout(new FlowLayout());
        add(prompt);
        add(maleBtn);
        add(femaleBtn);
        add(otherBtn);
        add(submitBtn);
        add(resultLabel);
    }

    public void actionPerformed(ActionEvent e) {
        String gender = "";

        if (maleBtn.isSelected()) {
            gender = "Male";
        } else if (femaleBtn.isSelected()) {
            gender = "Female";
        } else if (otherBtn.isSelected()) {
            gender = "Other";
        } else {
            JOptionPane.showMessageDialog(this, "Please select a gender.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        resultLabel.setText("Selected Gender: " + gender);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GenderSelectionGUI app = new GenderSelectionGUI();
            app.setVisible(true);
        });
    }
}
