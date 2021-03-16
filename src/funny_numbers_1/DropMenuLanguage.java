package funny_numbers_1;

import javax.swing.*;
import java.awt.*;

public class DropMenuLanguage extends JPanel {

    ImageIcon[] images;
    String[] languageStrings = {"Russia", "English", "Deutsch", "France"};

    DropMenuLanguage() {

        images = new ImageIcon[languageStrings.length];
        Integer[] intArray = new Integer[languageStrings.length];
        for (int i = 0; i < languageStrings.length; i++) {
            intArray[i] = new Integer(i);
            images[i] = new ImageIcon("E:\\javadoc\\flag\\" + languageStrings[i] + ".png");
            if (images[i] != null) {
                images[i].setDescription(languageStrings[i]);
            }
        }
        JComboBox languageList = new JComboBox(intArray);
        ComboBoxRenderer renderer = new ComboBoxRenderer();
        renderer.setPreferredSize(new Dimension(80, 20));
        languageList.setRenderer(renderer);
        //languageList.setMaximumRowCount(4);

      //  add(languageList, BorderLayout.PAGE_START);
        add(languageList, BorderLayout.WEST);
     //   setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

    }

    class ComboBoxRenderer extends JLabel
            implements ListCellRenderer {
        public ComboBoxRenderer() {
            setOpaque(true);
            setHorizontalAlignment(CENTER);
            setVerticalAlignment(CENTER);
        }

        public Component getListCellRendererComponent(
                JList list,
                Object value,
                int index,
                boolean isSelected,
                boolean cellHasFocus) {

            int selectedIndex = ((Integer) value).intValue();

            if (isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            } else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }
            ImageIcon icon = images[selectedIndex];
            String pet = languageStrings[selectedIndex];
            setIcon(icon);
            if (icon != null) {
                setText(pet);
                setFont(list.getFont());
            } else {
            }
            return this;
        }
    }
}
