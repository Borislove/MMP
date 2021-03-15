package funny_numbers;

import javax.imageio.ImageIO;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

// TODO: 13.03.2021  group buttons
// center image on label
public class FunnyNumbers implements ActionListener {
    BufferedImage image = ImageIO.read(new File("e:\\javadoc\\cursor_5.png"));

    private static int button_language_number = 2; //   1 - en , 2 - ru

    static int numberForSound = 0; //no use

    JFrame frame;
    JPanel panel;

    JButton button_1;
    JButton button_2;
    JButton button_3;
    JButton button_4;
    JButton button_5;
    JButton button_6;
    JButton button_7;
    JButton button_8;
    JButton button_9;

    //static String str = "123";
//    static JButton button_language;


    static int numberForImage = 0;

    JLabel label = new JLabel();
    //private Image image;

    //sound
    File file;

    public FunnyNumbers() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setTitle("Funny Numbers");
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        // TODO: 13.03.2021 circle
        //buttons_1
        button_1 = new JButton("1");
        button_1.setBackground(Color.white);
        button_1.setFocusable(false);
        button_1.setBounds(10, 10, 45, 45);
        button_1.addActionListener(this);
        //buttons_2
        button_2 = new JButton("2");
        button_2.setBackground(Color.white);
        button_2.setFocusable(false);
        button_2.setBounds(60, 10, 45, 45);
        button_2.addActionListener(this);
        //buttons_3
        button_3 = new JButton("3");
        button_3.setBackground(Color.white);
        button_3.setFocusable(false);
        button_3.setBounds(110, 10, 45, 45);
        button_3.addActionListener(this);
        //buttons_4
        button_4 = new JButton("4");
        button_4.setBackground(Color.white);
        button_4.setFocusable(false);
        button_4.setBounds(10, 60, 45, 45);
        button_4.addActionListener(this);
        //buttons_5
        button_5 = new JButton("5");
        button_5.setBackground(Color.white);
        button_5.setFocusable(false);
        button_5.setBounds(60, 60, 45, 45);
        button_5.addActionListener(this);
        //buttons_6
        button_6 = new JButton("6");
        button_6.setBackground(Color.white);
        button_6.setFocusable(false);
        button_6.setBounds(110, 60, 45, 45);
        button_6.addActionListener(this);
        //buttons_7
        button_7 = new JButton("7");
        button_7.setBackground(Color.white);
        button_7.setFocusable(false);
        button_7.setBounds(10, 110, 45, 45);
        button_7.addActionListener(this);
        //buttons_8
        button_8 = new JButton("8");
        button_8.setBackground(Color.white);
        button_8.setFocusable(false);
        button_8.setBounds(60, 110, 45, 45);
        button_8.addActionListener(this);
        //buttons_9
        button_9 = new JButton("9");
        button_9.setBackground(Color.white);
        button_9.setFocusable(false);
        button_9.setBounds(110, 110, 45, 45);
        button_9.addActionListener(this);

        //
        panel = new JPanel();
        panel.setBounds(170, 10, 250, 250);

        //add icon label
        label.setIcon(new ImageIcon("E:\\MMP\\src\\funny_numbers\\source\\images\\" + numberForImage + ".png"));
        panel.add(label);
        //

        //ADD BUTTONS
        frame.add(button_1);
        frame.add(button_2);
        frame.add(button_3);
        frame.add(button_4);
        frame.add(button_5);
        frame.add(button_6);
        frame.add(button_7);
        frame.add(button_8);
        frame.add(button_9);
        ////////////////////////////

        //ADD BUTTON LANGUAGE
        frame.add(new ButtonLanguage().button_language);

        frame.setCursor((Toolkit.getDefaultToolkit().createCustomCursor(
                image,
                new Point(0, 0), "custom cursor")));
        //default
        //  label = new JLabel(new ImageIcon("E:\\MMP\\src\\funny_numbers\\source\\images\\default.jpg"));
        // panel.add(label);
        frame.add(panel);

        frame.setVisible(true);
    }

    // TODO: 13.03.2021 switch!
    @Override
    public void actionPerformed(ActionEvent e) {
        //1
        if (e.getSource() == button_1) {
            System.out.println("click button_1");
            numberForImage = 1;
            label.setIcon(new ImageIcon("E:\\MMP\\src\\funny_numbers\\source\\images\\" + numberForImage + ".png"));
            System.out.println("numberForSound = " + numberForSound);
            //sound
            ///////////////

            if (button_language_number == 2) {
                file = new File("E:\\MMP\\src\\funny_numbers\\source\\sounds\\ru\\1.wav");
            }
            if (button_language_number == 1) {
                file = new File("E:\\MMP\\src\\funny_numbers\\source\\sounds\\en\\1.wav");
            }
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

        //2
        if (e.getSource() == button_2) {
            System.out.println("click button_2");
            numberForImage = 2;
            label.setIcon(new ImageIcon("E:\\MMP\\src\\funny_numbers\\source\\images\\" + numberForImage + ".png"));

            //sound
            if (button_language_number == 2) {
                file = new File("E:\\MMP\\src\\funny_numbers\\source\\sounds\\ru\\2.wav");
            }
            if (button_language_number == 1) {
                file = new File("E:\\MMP\\src\\funny_numbers\\source\\sounds\\en\\2.wav");
            }
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

        //3
        if (e.getSource() == button_3) {
            System.out.println("click button_3");
            numberForImage = 3;
            label.setIcon(new ImageIcon("E:\\MMP\\src\\funny_numbers\\source\\images\\" + numberForImage + ".png"));

            //sound
            if (button_language_number == 2) {
                file = new File("E:\\MMP\\src\\funny_numbers\\source\\sounds\\ru\\3.wav");
            }
            if (button_language_number == 1) {
                file = new File("E:\\MMP\\src\\funny_numbers\\source\\sounds\\en\\3.wav");
            }

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

        //4
        if (e.getSource() == button_4) {
            System.out.println("click button_4");
            numberForImage = 4;
            label.setIcon(new ImageIcon("E:\\MMP\\src\\funny_numbers\\source\\images\\" + numberForImage + ".png"));

            //sound
            if (button_language_number == 2) {
                file = new File("E:\\MMP\\src\\funny_numbers\\source\\sounds\\ru\\4.wav");
            }
            if (button_language_number == 1) {
                file = new File("E:\\MMP\\src\\funny_numbers\\source\\sounds\\en\\4.wav");
            }

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

        //5
        if (e.getSource() == button_5) {
            System.out.println("click button_5");
            numberForImage = 5;
            label.setIcon(new ImageIcon("E:\\MMP\\src\\funny_numbers\\source\\images\\" + numberForImage + ".png"));
            //sound
            if (button_language_number == 2) {
                file = new File("E:\\MMP\\src\\funny_numbers\\source\\sounds\\ru\\5.wav");
            }
            if (button_language_number == 1) {
                file = new File("E:\\MMP\\src\\funny_numbers\\source\\sounds\\en\\5.wav");
            }

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

        //6
        if (e.getSource() == button_6) {
            System.out.println("click button_6");
            numberForImage = 6;
            label.setIcon(new ImageIcon("E:\\MMP\\src\\funny_numbers\\source\\images\\" + numberForImage + ".png"));
            //sound
            if (button_language_number == 2) {
                file = new File("E:\\MMP\\src\\funny_numbers\\source\\sounds\\ru\\6.wav");
            }
            if (button_language_number == 1) {
                file = new File("E:\\MMP\\src\\funny_numbers\\source\\sounds\\en\\6.wav");
            }

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
        if (e.getSource() == button_7) {
            System.out.println("click button_7");
            numberForImage = 7;
            label.setIcon(new ImageIcon("E:\\MMP\\src\\funny_numbers\\source\\images\\" + numberForImage + ".png"));
            //sound
            if (button_language_number == 2) {
                file = new File("E:\\MMP\\src\\funny_numbers\\source\\sounds\\ru\\7.wav");
            }
            if (button_language_number == 1) {
                file = new File("E:\\MMP\\src\\funny_numbers\\source\\sounds\\en\\7.wav");
            }

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
        if (e.getSource() == button_8) {
            System.out.println("click button_8");
            numberForImage = 8;
            label.setIcon(new ImageIcon("E:\\MMP\\src\\funny_numbers\\source\\images\\" + numberForImage + ".png"));
            if (button_language_number == 2) {
                file = new File("E:\\MMP\\src\\funny_numbers\\source\\sounds\\ru\\8.wav");
            }
            if (button_language_number == 1) {
                file = new File("E:\\MMP\\src\\funny_numbers\\source\\sounds\\en\\8.wav");
            }
            //sound
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
        if (e.getSource() == button_9) {
            System.out.println("click button_9");
            numberForImage = 9;
            label.setIcon(new ImageIcon("E:\\MMP\\src\\funny_numbers\\source\\images\\" + numberForImage + ".png"));
            //sound
            if (button_language_number == 2) {
                file = new File("E:\\MMP\\src\\funny_numbers\\source\\sounds\\ru\\9.wav");
            }
            if (button_language_number == 1) {
                file = new File("E:\\MMP\\src\\funny_numbers\\source\\sounds\\en\\9.wav");
            }
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


    class ButtonLanguage implements ActionListener {
        JButton button_language = new JButton();


        public ButtonLanguage() {
            button_language.setText("RU");
            button_language.setBackground(Color.orange);
            button_language.setBounds(10, 200, 50, 50);
            button_language.setFocusable(false);
            button_language.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button_language) {
                switch (button_language_number) {
                    case 1:
                        button_language.setText("RU");
                        button_language_number = 2;
                        break;
                    case 2:
                        button_language.setText("EN");
                        button_language_number = 1;
                        break;
                }
            }
        }
    }


    public static void main(String[] args) throws IOException, LineUnavailableException, UnsupportedAudioFileException {

        new FunnyNumbers();

    }
}
