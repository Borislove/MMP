package funny_numbers_1;

import javax.swing.*;
import java.awt.*;

public class OptionPanel extends JPanel {

    public OptionPanel() {
     //   setLayout(null);
        //setSize(new Dimension(300,300));
        setBackground(Color.orange);
        setBounds(0, 300, 600, 130);
      //  add(new DropMenuLanguage());
        add(new LanguagePanel());
    }
}
