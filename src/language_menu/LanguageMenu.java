package language_menu;

import javax.swing.*;

public class LanguageMenu extends JFrame {

    public LanguageMenu() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 500);
        this.setTitle("LanguageMenu");
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        this.add(new LanguagePanel());

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new LanguageMenu();
    }
}


