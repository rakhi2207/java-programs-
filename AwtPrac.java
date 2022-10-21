import java.awt.*;
import java.awt.event.*;

class AwtPrac extends Frame implements ActionListener {

    TextField tf1;

    AwtPrac() {
        tf1 = new TextField();
        tf1.setBounds(50, 50, 200, 30);
        Button b1 = new Button("Display msg");
        b1.setBounds(60, 140, 200, 40);
        setTitle("Event Handling");

        b1.addActionListener(this);
        add(b1);
        add(tf1);
        setSize(300, 250);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        tf1.setText("Example of event handling(awt)");
    }


    // main method
    public static void main(String args[]) {

        // creating instance of Frame class
        new AwtPrac();
        AwtPrac.setDefault.EXIT_ON_CLOSE();
    }

}
