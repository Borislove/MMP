package JFL.jfl_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//основное меню
public class MainWindow extends JFrame {
    static {
        System.err.println(MainWindow.class + " запущен");
    }

    JButton guide = new JButton("guide");
    JPanel panel = new JPanel();

    JButton magic = new JButton("magic");

    JFrame frame = new JFrame();

    public MainWindow() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setTitle("JFL_3");
        frame.setLocationRelativeTo(null);

        //  setLayout(null);
        panel.add(guide);
        guide.setFocusable(false);
        guide.addActionListener(new ButtonListener());
        frame.add(panel);

        panel.add(magic);
        magic.setFocusable(false);
        magic.addActionListener(new ButtonListener());

        frame.setVisible(true);
    }

    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == guide) {
                System.out.println("guide pressed");
                frame.dispose();
                System.err.println(MainWindow.class + " dispose");

                new JFL_3();
            }

            if (e.getSource() == magic) {
                System.out.println("magic pressed");
                JOptionPane.showMessageDialog(null, "trollololololo");
                frame.dispose();
                System.out.println("опа магия");
            }
        }
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}
