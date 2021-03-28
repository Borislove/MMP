package TEST;

import javax.swing.*;
import java.io.IOException;

public class Main extends JFrame{

    Main() throws IOException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 450);
        setTitle("TEST");
        setLocationRelativeTo(null);
        setLayout(null);

        add(new ImagePanel());

        setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        new Main();
    }
}
