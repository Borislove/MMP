package funny_numbers_1;

import funny_numbers_1.buttons.ButtonsList;

import javax.swing.*;

//main class
public class FunnyNumbers extends JFrame {

    public FunnyNumbers() {
        //window
        /////////////////////
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 450);
        this.setTitle("Funny Numbers");
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        //  add(new OptionPanel());
        add(new LanguagePanel());

        add(new SoundStyle());

        add(new CheckSound());

        add(new DropMenuImage());

        add(new ImagePanel());

        add(new CharacterPanel());
        add(new MessageLabel());


        /////////////////////

        //add buttons
        new ButtonsList();
        for (int i = 0; i < ButtonsList.listButton.size(); i++) {
            this.add(ButtonsList.listButton.get(i));
        }
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FunnyNumbers();
    }
}

