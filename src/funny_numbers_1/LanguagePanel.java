package funny_numbers_1;

import javax.swing.*;
import java.awt.*;

public class LanguagePanel extends JPanel {

    LanguagePanel(){
       // setLayout(null);
        //setBackground(Color.green);
        setBounds(10, 360, 120,40);
        add(new DropMenuLanguage());
    }
}
