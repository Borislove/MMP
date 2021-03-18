package funny_numbers_1.buttons;

import funny_numbers_1.Settings;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Button_6 extends JButton implements ActionListener {

    String buttonName = "6";

    //координаты кнопки
    int x = 110;
    int y = 60;

    //размер кнопки
    int width = 45;
    int height = 45;

    File file;

    public Button_6() {

        this.setText(buttonName);
        this.setBackground(Color.white);
        this.setFocusable(false);
        this.setBounds(x, y, width, height);
        this.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
            System.out.println(buttonName);
            /////SWITCH VOICE///////
            if (Settings.switchVoice) {
                file = new File("E:\\MMP\\src\\funny_numbers_1\\source\\sounds\\ru\\male\\6.wav");
            } else {
                file = new File("E:\\MMP\\src\\funny_numbers_1\\source\\sounds\\ru\\female\\6.wav");
            }
            /////////////////////////
            AudioInputStream audioStream = null;
            try {
                audioStream = AudioSystem.getAudioInputStream(file);
            } catch (UnsupportedAudioFileException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            Clip clip = null;
            try {
                clip = AudioSystem.getClip();
            } catch (LineUnavailableException ex) {
                ex.printStackTrace();
            }
            try {
                clip.open(audioStream);
            } catch (LineUnavailableException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            clip.start();

        }
    }
}
