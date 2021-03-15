package funny_numbers_1;

import funny_numbers_1.buttons.ButtonsList;

import javax.swing.*;

//main class
public class FunnyNumbers extends JFrame{

    public FunnyNumbers() {
        //window
        /////////////////////
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 500);
        this.setTitle("Funny Numbers");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
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

