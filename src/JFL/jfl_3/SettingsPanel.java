package JFL.jfl_3;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsPanel extends JPanel {

    JSpinner fontSizeSpinner;
    JButton button = new JButton("menu");

    //темы
    String[] theme = {"dark", "white"};
    JComboBox box = new JComboBox(theme);

    SettingsPanel() {

        setLocation(0, 0);
        setSize(JFL_3.width, 30);
        //setBackground(Color.green);

        fontSizeSpinner = new JSpinner();
        fontSizeSpinner.setPreferredSize(new Dimension(50, 25));
        fontSizeSpinner.setValue(20);

        fontSizeSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                TextWindow.textArea.setFont(new Font(TextWindow.textArea.getFont().getFamily(), Font.PLAIN, (Integer) fontSizeSpinner.getValue()));
            }
        });

        add(fontSizeSpinner);

        add(box);
        box.addActionListener(new BoxListener());

        add(button);
        button.addActionListener(new ButtonListener());

    }

    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                System.out.println("click");

                new MainWindow();

                Navi.navigation.dispose();
                TextWindow.textWindow.dispose();
                JFL_3.frame.dispose();
                JFL_3.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            }
        }
    }

    class BoxListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //  System.out.println("ok");
            String item = (String) box.getSelectedItem();
            if (item.equals("dark")) {
                System.out.println("dark");
                TextWindow.textArea.setBackground(Color.black);
                TextWindow.textArea.setForeground(Color.green);
            }

            if (item.equals("white")) {
                System.out.println("white");
                TextWindow.textArea.setBackground(Color.white);
                TextWindow.textArea.setForeground(Color.black);
            }
        }
    }
}
