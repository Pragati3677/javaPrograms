import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleTimerApp {
    private static int counter = 0;
    private static Timer timer;

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Simple Timer");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Label to display the time
        JLabel timeLabel = new JLabel("Time: 0 seconds");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(timeLabel);

        // Start button
        JButton startButton = new JButton("Start");
        frame.add(startButton);

        // Stop button
        JButton stopButton = new JButton("Stop");
        frame.add(stopButton);

        // Timer logic (ticks every 1 second)
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter++;
                timeLabel.setText("Time: " + counter + " seconds");
            }
        });

        // Start button action
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });

        // Stop button action
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });

        // Show the frame
        frame.setVisible(true);
    }
}
