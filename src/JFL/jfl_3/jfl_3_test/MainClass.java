package JFL.jfl_3.jfl_3_test;

import TEST.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass {

    protected static JFrame frame = new JFrame();

    JPanel panel = new JPanel();

    public MainClass() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setTitle("MainWindow");
        frame.setLocationRelativeTo(null);


        JButton button = new JButton("Тыкай");
        //frame.add(button);

        frame.add(panel);
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == button) {
                    System.out.println("click click");

                    //  JFL3_Test_Class.frame.setVisible(true);
                    new JFL3_Test_Class();
                    MainClass.frame.dispose();
                    //    frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));


                    //   new JFL3_Test_Class().start();
                }
            }
        });

        frame.setVisible(true);

    }

    public static void main(String[] args) {

        new MainClass();
    }
}
