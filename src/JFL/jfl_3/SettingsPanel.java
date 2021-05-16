package JFL.jfl_3;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SettingsPanel extends JPanel {

    JSpinner fontSizeSpinner;

    SettingsPanel() {

        setLocation(0, 0);
        setSize(JFL_3.width, 30);
        setBackground(Color.green);

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
    }
}
