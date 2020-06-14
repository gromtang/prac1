import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI2 {
    private JButton button1;
    private JPanel panel1;
    private JButton button2;


    public GUI2() {
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                panel1.setBackground(Color.CYAN);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI2");
        frame.setContentPane(new GUI2().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600,400,400,400);
        frame.pack();
        frame.setVisible(true);

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("文件");
        JMenuItem mi11 = new JMenuItem("打开");
        m1.add(mi11);
        mb.add(m1);
        frame.setJMenuBar(mb);
    }



}
