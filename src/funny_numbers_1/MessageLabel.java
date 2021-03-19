package funny_numbers_1;

import javax.swing.*;
import java.awt.*;

public class MessageLabel extends JPanel {

    public static JLabel label;

    MessageLabel() {
      //  label = new JLabel("Message");
        label = new JLabel();

       // label.setIcon(new ImageIcon("E:\\javadoc\\один.png"));
        //setBackground(Color.lightGray);
        setBounds(360, 240, 200, 100);

        add(label);
    }
}
