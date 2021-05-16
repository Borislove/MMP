package JFL.jfl_3;

import javax.swing.*;
import java.awt.*;

//текст String
public class JFL_3 {

    protected static JDesktopPane desktop;
    protected static int width = 800;
    protected static int height = 600;

    protected static int yLocationWindow = 30;

    protected static JFrame frame = new JFrame();

    public JFL_3() {
        Container c = frame.getContentPane();
        desktop = new JDesktopPane();
        c.add(desktop);

        //setup window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(width, height);
        frame.setTitle("Guide");
        frame.setLocationRelativeTo(null);
        //  setLayout(null);

        //класс  навигации
        this.desktop.add(new Navi().navigation);

        //класс текстового окна
        this.desktop.add(new TextWindow().textWindow);

        //класс настроек панели
        this.desktop.add(new SettingsPanel());

        frame.setVisible(true);
    }
}

