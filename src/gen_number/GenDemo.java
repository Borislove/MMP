package gen_number;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//my mini generator
public class GenDemo implements ActionListener {

    JFrame frame = new JFrame();
    JButton button;
    JPanel panel;
    JTextField textField;

    public GenDemo() {
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setFont(new Font("Consolas", Font.PLAIN, 55));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.black);
        textField.setText(" ");
        textField.setEditable(false);
        textField.setFocusable(false);
        textField.setBorder(null);
        textField.setHorizontalAlignment(JTextField.CENTER);

        panel = new JPanel();
        panel.setBounds(80, 0, 200, 70);
        panel.setBackground(Color.black);

        button = new JButton("Gen");
        button.setBounds(0, 0, 70, 70);

        button.addActionListener(this);
        frame.add(button);

        frame.add(panel);
        panel.add(textField);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            //System.out.println("click");
            //textField.setText("hello");
            int number = (1 + (int) (Math.random() * 6));
            textField.setText(String.valueOf(number));
        }
    }

    public static void main(String[] args) {
        new GenDemo();
    }
}
