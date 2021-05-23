package JFL.jfl_3.jfl_3_test;

import javax.swing.*;
import java.awt.*;

public class Navi extends JPanel {
    public static JList<String> listMenu = new JList<>(TextNavi.navigationString);
    public static JInternalFrame navigation;

    Navi() {
        NaviPanel listMenu = new NaviPanel();

        navigation = new JInternalFrame("Навигация", true, false, true, true);

        navigation.setSize(150, 150);
        navigation.setLocation(0, 50);
        navigation.setBackground(Color.white);
        navigation.add(listMenu);
        navigation.setVisible(true);
    }

    class NaviPanel extends JPanel {

        public NaviPanel() {
            listMenu.setLayout(null);
            listMenu.setBackground(Color.white);

            add(listMenu);
        }
    }
}
