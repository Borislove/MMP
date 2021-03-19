package funny_numbers_1;

import javax.swing.*;
import java.awt.*;

public class CharacterPanel extends JPanel {


    JLabel label;


    CharacterPanel() {
     //   label = new JLabel("CharacterPanel");
        label = new JLabel();
       // label.setIcon(new ImageIcon("E:\\javadoc\\teacher.png"));
        label.setIcon(new ImageIcon("E:\\javadoc\\message\\teacher.png"));
      //  setBackground(Color.lightGray);
        setBounds(450, 300, 100, 80);

        add(label);
    }
}
