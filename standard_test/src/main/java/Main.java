import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            showGUI();
        });
    }

    private static void showGUI() {
        JFrame f0 = new JFrame("frame-0");
        JFrame f1 = new JFrame("frame-1");

        JButton b0 = new JButton("show dialog");

        f0.add(b0);
        f1.add(new JLabel("in frame-1"));

        f0.pack();
        f1.pack();

        b0.addActionListener((e) -> {
            JDialog d = new JDialog(f0, true);
            JButton b = new JButton("close me");
            d.add(b);
            b.addActionListener((ee) -> {
                d.dispose();
            });
            d.pack();
            d.setVisible(true);
        });

        f0.setVisible(true);
        f1.setVisible(true);
    }
}