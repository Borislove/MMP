package JFL.jfl_3.jfl_3_test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFL3_Test_Class extends Thread implements AutoCloseable {

    public static JDesktopPane desktop = new JDesktopPane();
    protected static JFrame frame = new JFrame();

    JButton button = new JButton("return");
    JPanel panel = new JPanel();

    // JFL3_Test_Class jfl3_test_class = new JFL3_Test_Class();

    Container c = frame.getContentPane();

    public JFL3_Test_Class() {
//        jfl3_test_class.start();

        //desktop = new JDesktopPane();
        c.add(desktop);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(800, 600);
        frame.setTitle("Listing");
        frame.setLocationRelativeTo(null);

        panel.setSize(100, 35);
        panel.setLocation(50, 0);
        desktop.add(panel);
        panel.add(button);


        //frame.repaint();

        button.addActionListener(new buttonListener());

       /* button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainClass();
                System.out.println("click return");

                //JFL3_Test_Class.interrupted();
                // JFL3_Test_Class.frame.dispose();
                //  MainClass.frame.dispose();
                *//*JFL3_Test_Class.frame.setVisible(false);
                JFL3_Test_Class.frame.repaint();*//*

                //JFL3_Test_Class.frame.dispatchEvent(new WindowEvent(JFL3_Test_Class.frame,WindowEvent.WINDOW_CLOSING)); // TODO: 24.05.2021 все закрывает...

                JFL3_Test_Class.frame.setVisible(false);

            }
        });*/

        //this.desktop.add(new Navi().navigation);
        desktop.add(new Navi().navigation);
        frame.setVisible(true);

    }

    @Override
    public void close() throws Exception {
        JFL3_Test_Class.frame.dispose();
        desktop.removeAll();
        System.out.println("REMOVE ALL");
    }

    class buttonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new MainClass();
            System.out.println("click return");

            try {
                close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
