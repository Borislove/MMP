package funny_numbers_1;

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {

    public static JLabel label ;

    ImagePanel(){
        label = new JLabel();
      //  label = new JLabel("ImagePanel");
        add(label);

     //   setBackground(Color.orange);
        setBounds(170, 10, 250, 250);
    }
}
