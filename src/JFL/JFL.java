package JFL;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFL extends JFrame {

    JLabel label = new JLabel();

    public JFL() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(600, 450);
        this.setTitle("JFL");
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        //add(new Navi());
        //   add(new Message());
        getContentPane().add(new Navi(), BorderLayout.WEST);
        //getContentPane().add(new Message(), BorderLayout.WEST);
        add(new Message());

        this.setVisible(true);
    }


    class Navi extends JPanel implements ActionListener {
        String navigation[] = {"один", "два", "три", "четыре", "пять"};
        JComboBox comboBox = new JComboBox(navigation);

        //JList list = new JList(navigation);
        Navi() {
            setBackground(Color.lightGray);
            setBounds(0, 0, 100, 600);
            comboBox.addActionListener(this);
            setBorder(new LineBorder(Color.white, 1, false));
            add(comboBox);
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == comboBox) {
                //  System.out.println(comboBox.getSelectedItem());
                //  System.out.println(comboBox.getSelectedIndex());
                String msg = (String) comboBox.getSelectedItem();
                switch (msg) {
                    case "один":
                        System.out.println("один");
                        label.setText("один");
                        break;
                    case "два":
                        System.out.println("два");
                        label.setText("два");
                        break;
                    case "три":
                        System.out.println("три");
                        label.setText("три");
                        break;
                    case "четыре":
                        System.out.println("четыре");
                        label.setText("четыре");
                        break;
                    case "пять":
                        System.out.println("пять");
                        label.setText("пять");
                        break;
                }
            }
        }
    }


    class Message extends JPanel {
        Message() {
            add(label);
            label.setText("Текст текст , куча текста, еще текст...");

            setBackground(Color.lightGray);
            setBounds(100, 0, 600, 450);
            setBorder(new LineBorder(Color.white, 1, false));
        }
    }

    public static void main(String[] args) {
        new JFL();
    }
}
