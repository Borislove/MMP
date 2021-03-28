package TEST;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends JPanel {

    JLabel label;

    File file = new File("src\\funny_numbers_1\\source\\images\\1.png");
    Image image = ImageIO.read(file);

    ImagePanel() throws IOException {
        label = new JLabel();
//        label.setText("Test");
        //label.setIcon(new ImageIcon("E:\\javadoc\\Screenshot_4.jpg"));
        label.setIcon(new ImageIcon(image));
        add(label);

        setBackground(Color.orange);
        setBounds(170, 10, 250, 250);
    }
}
