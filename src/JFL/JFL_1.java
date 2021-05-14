package JFL;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFL_1 extends JFrame {


    public JFL_1() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(600, 450);
        this.setTitle("JFL_1");
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        add(new Navi());
        this.setVisible(true);
    }

    class Navi extends JPanel {

        // String navigation[] = {"один", "два", "три", "четыре", "пять"};

        String navigation[] = {
                "Text 0",
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
                "Text 30",
        };

        JList list = new JList(navigation);
        //        JScrollPane listbox = new JScrollPane(list);
        JScrollPane sp = new JScrollPane(this.list);

        Navi() {
            setBackground(Color.lightGray);
            setBounds(0, 0, 100, 600);

            list.addMouseListener(
                    new MouseAdapter() {
                        public void mouseClicked(MouseEvent ev) {
                            System.out.println(list.getSelectedIndex());
                        }
                    });

            setBorder(new LineBorder(Color.white, 1, false));
            // add(list);
            sp.getMaximumSize();
            add(sp);
        }

    }

    public static void main(String[] args) {
        new JFL_1();

        for (int i = 0; i < 30; i++) {
            System.out.println("\"Text " + i + "\"" + ",");
        }
    }
}

