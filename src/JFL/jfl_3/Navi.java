package JFL.jfl_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Navi extends JPanel {

    JInternalFrame navigation;

    Navi() {

        NaviPanel listMenu = new NaviPanel();
        //-----------------------------

        //навигация настройки окна
        navigation = new JInternalFrame("Навигация", true, false, true, true);
        Container nav = navigation.getContentPane();
        //  nav.setLayout(new FlowLayout());
        navigation.setSize(150, JFL_3.height - 50);
        navigation.setBackground(Color.white);
        navigation.add(listMenu);

        navigation.setVisible(true);
    }

    class NaviPanel extends JPanel {

        public NaviPanel() {
            String[] navigationString = {
                    "Text 0123123123",
                    "Text 1",
                    "Text 2",
                    "Text 3",
                    "Text 4",
                    "Text 5",
                    "Text 6",
                    "Text 7",
                    "Text 8",
                    "Text 9",
                    "Text 10",
                    "Text 11",
                    "Text 12",
                    "Text 13",
                    "Text 14",
                    "Text 15",
                    "Text 16",
                    "Text 17",
                    "Text 18",
                    "Text 19",
                    "Text 20",
                    "Text 21",
                    "Text 22",
                    "Text 23",
                    "Text 24",
                    "Text 25",
                    "Text 26",
                    "Text 27",
                    "Text 28",
                    "Text 29",
                    "Text 30222222",
            };
            JList<String> listMenu = new JList<>(navigationString);
            listMenu.setLayout(null);
            listMenu.setBackground(Color.white);

         //   setBackground(Color.orange);
            //-----------------------------
            //скроллинг навигации
            JScrollPane sp = new JScrollPane(listMenu);
            sp.setPreferredSize(new Dimension(140, 500));

            listMenu.addMouseListener(
                    new MouseAdapter() {
                        public void mouseClicked(MouseEvent ev) {
                            System.out.println(listMenu.getSelectedIndex());
                        }
                    });
            add(sp);
        }
    }
}
