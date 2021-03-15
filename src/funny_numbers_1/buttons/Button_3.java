package funny_numbers_1.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button_3 extends JButton implements ActionListener {

    String buttonName = "3";

    //координаты кнопки
    int x = 110;
    int y = 10;

    //размер кнопки
    int width = 45;
    int height = 45;

    public Button_3() {

        this.setText(buttonName);
        this.setBackground(Color.white);
        this.setFocusable(false);
        this.setBounds(x, y, width, height);
        this.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
            System.out.println(buttonName);
        }
    }
}