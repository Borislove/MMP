package language_menu;

import javax.swing.*;
import java.awt.*;

public class LanguagePanel extends JPanel {

    //    Image image = new ImageIcon("e:\\javadoc\\test.txt.png").getImage();

    //private String[] languages = {"Русский", "English"};

    //private JComboBox combo = new JComboBox(languages);

  /*  private DefaultComboBoxModel<Icon> loadImages() {
        DefaultComboBoxModel<Icon> dm = new DefaultComboBoxModel<>();
        dm.addElement(new ImageIcon("E:\\javadoc\\russia.png"));
        dm.addElement(new ImageIcon("E:\\javadoc\\united-states.png"));
        dm.addElement(new ImageIcon("E:\\javadoc\\germany.png"));
        dm.addElement(new ImageIcon("E:\\javadoc\\france.png"));
        return dm;
    }

    private DefaultComboBoxModel<String> loadText() {
        DefaultComboBoxModel<String> dm = new DefaultComboBoxModel<>();
        dm.addElement("Русский");
        dm.addElement("English");
        dm.addElement("Deutsche");
        dm.addElement("French");
        return dm;
    }*/

    private DefaultComboBoxModel combo() {
        DefaultComboBoxModel dm = new DefaultComboBoxModel();
        //dm.addElement(new String(""), (new String("E:\\javadoc\\russia.png")));

        return dm;
    }


    // private JComboBox combo = new JComboBox(loadText());
    ;
    //JComboBox[][] combo;

    //JComboBox[][] combo2 = new JComboBox[loadText().getSize()][loadImages().getSize()];

    JComboBox<Icon> box = new JComboBox<Icon>();
    JComboBox t = new JComboBox();

    public LanguagePanel() {

        t.setModel(combo());
        this.add(t);


        this.setBounds(10, 400, 150, 30);
        this.setVisible(true);
        this.setBackground(Color.CYAN);
        // combo.setBackground(Color.orange);
        //combo.setBounds(200,20,600,100);

    }
}

