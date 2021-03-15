package funny_numbers_1.buttons;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ButtonsList {

    public static List<JButton> listButton = new ArrayList<JButton>();

    public ButtonsList() {
        for (int i = 0; i < 9; i++) {
            listButton.add(new Button_0());
            listButton.add(new Button_1());
            listButton.add(new Button_2());
            listButton.add(new Button_3());
            listButton.add(new Button_4());
            listButton.add(new Button_5());
            listButton.add(new Button_6());
            listButton.add(new Button_7());
            listButton.add(new Button_8());
            listButton.add(new Button_9());
        }
    }
}
