package mini_clicker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniClicker {

    static {
        System.out.println("Hello clicker");
    }

    JFrame frame;

    MiniClicker() {
        frame = new JFrame();
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new Apple());
        frame.add(new Apple.ButtonApple());
        frame.add(new Apple.ButtonAppleAdd());
        frame.add(new Apple.AppleStorage());

        frame.setVisible(true);
    }

    static class Apple extends JPanel {
        static JLabel label = new JLabel();
        static int count = 0;

        static int storageAppleValue = 100;
        //static JLabel storageApple = new JLabel();

        static String apple = "Apple: ";

        Apple() {
            setBounds(0, 0, 150, 25);
            setBackground(Color.orange);
            label = new JLabel(apple + count);
            add(label);


        }

        static class ButtonApple extends JButton implements ActionListener {
            ButtonApple() {
                setFocusable(false);
                setText("Collect");
                setBounds(10, 30, 100, 30);
                addActionListener(this);
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == this) {
                    label.setText(apple + String.valueOf(count));
                    System.out.println(apple + "count: " + count);
                    count++;
                }
            }
        }

        static class ButtonAppleAdd extends JButton implements ActionListener {
            ButtonAppleAdd() {
                setFocusable(false);
                setText("Fill");
                setBounds(200, 30, 100, 30);
                addActionListener(this);
            }

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        }

        static class AppleStorage extends JPanel {
            JLabel label = new JLabel("количество");

            AppleStorage() {
                label.setBackground(Color.green);
                setBounds(110, 30, 90, 35);
                setBackground(Color.green);
                add(label);
            }
        }
    }

    /*class Buttons extends JButton{
        Buttons(){
           setBounds(0,30,30,30);
        }
    }*/

    public static void main(String[] args) {

        new MiniClicker();
    }
}
