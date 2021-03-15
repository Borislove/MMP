package funny_numbers_1.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button_1 extends JButton implements ActionListener {

    String buttonName = "1";

    //координаты кнопки
    int x = 10;
    int y = 10;

    //размер кнопки
    int width = 45;
    int height = 45;

    //цвет фона
    // String colorBackground = "white";
    public Button_1() {
        //  this.setLayout(null);
        this.setText(buttonName);
        this.setBackground(Color.white);
        this.setFocusable(false);
        //this.setBounds(10, 10, 45, 45);
        this.setBounds(x, y, width, height);
        this.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*if (e.getSource() == Button_1.this) {
            System.out.println("123");
        }*/
        if (e.getSource() == this) {
            System.out.println(buttonName);
        }
    }
}
