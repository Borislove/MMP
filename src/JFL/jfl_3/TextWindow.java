package JFL.jfl_3;

import javax.swing.*;
import java.awt.*;

public class TextWindow extends JPanel {

    JInternalFrame textWindow;

    public static JTextArea textArea = new JTextArea();

    TextWindow() {
        //-----------------------------
        textWindow = new JInternalFrame("описание", true, false, true, true);
        textWindow.setSize(610, JFL_3.height - 50);
        textWindow.setLocation(160, 0);
        textWindow.setBackground(Color.white);

        textWindow.add(textArea);
        textArea.setEditable(false);

        textWindow.setVisible(true);
    }
}
