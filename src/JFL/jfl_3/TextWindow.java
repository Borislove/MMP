package JFL.jfl_3;

import javax.swing.*;
import java.awt.*;

public class TextWindow extends JPanel {

    JInternalFrame textWindow;

    public static JTextArea textArea = new JTextArea();

    JScrollPane scrollPane = new JScrollPane(textArea);

    TextWindow() {

        //перенос строки
        textArea.setLineWrap(true);
        //шрифт, размер по умолчанию
        textArea.setFont(new Font("Arial", Font.PLAIN, 20));
        //-----------------------------
        textWindow = new JInternalFrame("описание", true, false, true, true);
        textWindow.setSize(610, JFL_3.height - 50);
        textWindow.setLocation(160, JFL_3.yLocationWindow);
        textWindow.setBackground(Color.white);

        this.add(scrollPane);

        textWindow.add(textArea);
        textArea.setEditable(false);

        textWindow.setVisible(true);
    }
}
