package JFL.jfl_3;

import javax.swing.*;
import java.awt.*;

//текст String
public class JFL_3 extends JFrame {

    JDesktopPane desktop;
    protected static int width = 800;
    protected static int height = 600;

    protected static int yLocationWindow = 30;

    public JFL_3() {

        Container c = getContentPane();
        desktop = new JDesktopPane();
        c.add(desktop);

        //setup window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setTitle("JFL_3");
        setLocationRelativeTo(null);
        //  setLayout(null);

        //класс  навигации
        desktop.add(new Navi().navigation);

        //класс текстового окна
        desktop.add(new TextWindow().textWindow);

        desktop.add(new SettingsPanel());

        setVisible(true);
    }

    public static void main(String[] args) {
        new JFL_3();
    }
}

