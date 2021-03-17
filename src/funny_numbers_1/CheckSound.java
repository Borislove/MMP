package funny_numbers_1;

import javax.swing.*;
import java.awt.*;

public class CheckSound extends JPanel {

    JLabel label ;
    JCheckBox box;

    CheckSound(){
        box = new JCheckBox();
        label=  new JLabel("sound");
        add(label);
      //  setBackground(Color.green);
        setBounds(220,360,50,50);

        add(box);
    }
}
