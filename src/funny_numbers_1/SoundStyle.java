package funny_numbers_1;

import javax.swing.*;
import java.awt.*;

public class SoundStyle extends JPanel {


    JRadioButton maleButton = new JRadioButton("Male", true);
    JRadioButton femaleButton = new JRadioButton("Female", false);

    SoundStyle() {
       // setBackground(Color.orange);
        setBounds(140, 350, 70, 70);

        add(maleButton);
        add(femaleButton);
    }
}
