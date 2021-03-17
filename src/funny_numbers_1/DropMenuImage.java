package funny_numbers_1;

import javax.swing.*;
import java.awt.*;

public class DropMenuImage extends JPanel {

    JLabel label;

    String[] imageString = {"цифры", "грибочки", "конфеты", "бабочки"};
    JComboBox imageList = new JComboBox(imageString);

    DropMenuImage() {

        label = new JLabel("DropMenuImage");
      //  setBackground(Color.red);
        setBounds(300, 360, 120, 40);

        add(imageList);
    }
}
