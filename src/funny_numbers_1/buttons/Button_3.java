package funny_numbers_1.buttons;

import funny_numbers_1.ImagePanel;
import funny_numbers_1.MessageLabel;
import funny_numbers_1.Settings;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Button_3 extends JButton implements ActionListener {

    String buttonName = "3";

    //координаты кнопки
    int x = 110;
    int y = 10;

    //размер кнопки
    int width = 45;
    int height = 45;

    File file;

    public Button_3() {

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
            /////////IMAGE/////////////
            ImagePanel.label.setIcon(new ImageIcon("E:\\картиночки\\3.png"));
            /////////MESSAGE IMAGE////
            MessageLabel.label.setIcon(new ImageIcon("E:\\javadoc\\message\\3.png"));
            /////SWITCH VOICE///////


            if (Settings.switchVoice) {
                file = new File("E:\\MMP\\src\\funny_numbers_1\\source\\sounds\\ru\\male\\3.wav");
            } else {
                file = new File("E:\\MMP\\src\\funny_numbers_1\\source\\sounds\\ru\\female\\3.wav");
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