import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI1 extends Frame {
    private JTextField tf1;
    private  JPanel GUI1;
    private JTextArea ta1;
    private JButton bt1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI1");
        frame.setContentPane(new GUI1().GUI1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public GUI1() {
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tf1str = tf1.getText().trim();
                ta1.append(tf1str + "\r\n");
                tf1.setText("");
                tf1.requestFocus();
            }
        });
    }
}

