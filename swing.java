import javax.swing.*;
import java.awt.event.*;

public class swing implements ActionListener {
    JTextField tf;

    swing() {
        JFrame f = new JFrame("JAVA SWING EXAMPLE");
        JTextArea area = new JTextArea();
        area.setBounds(160, 170, 95, 20);
        f.add(area);
        JButton b = new JButton("Click Here");
        b.setBounds(180, 220, 95, 30);
        b.addActionListener(this);
        f.add(b);
        tf = new JTextField();
        tf.setBounds(160, 170, 190, 30);
        f.add(tf);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Account Created Successfully!");
    }

    public static void main(String[] args) {
        new swing();
    }
}
