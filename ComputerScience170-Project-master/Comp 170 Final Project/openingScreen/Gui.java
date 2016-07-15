/**
 * Created by Zack on 4/10/2016.
 */
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Handler;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame {
        private JButton reg;
        private JButton custom;
        private JButton b1;
        private JLabel l1;
       private Decisions userDecision;


        public Gui() {
            super("SARZ++");






            setLayout(new BorderLayout());
            setContentPane(new JLabel(new ImageIcon("C:\\Users\\Zack\\Documents\\SplashPage\\src\\opening.gif")));
            setLayout(new FlowLayout());
            setBackground(Color.BLACK);
            l1 = new JLabel("");
            b1 = new JButton("PLAY");

            b1.setForeground(Color.white);
            b1.setBackground(Color.BLACK);
            Icon b = new ImageIcon(getClass().getResource("playButton.png"));
            Icon x = new ImageIcon(getClass().getResource("playButton2.png"));
            custom = new JButton("", b);
            custom.setRolloverIcon(x);





            add(b1);

            HandlerClass handler = new HandlerClass();

            b1.addActionListener(handler);



        }
        public class HandlerClass implements ActionListener{
        public void actionPerformed(ActionEvent event){




            System.out.println("Performed");



            setLayout(new BorderLayout());

            setLayout(new FlowLayout());

            setContentPane(new JLabel(new ImageIcon("C:\\Users\\Zack\\Documents\\SplashPage\\src\\splashpage.png")));
            setBackground(Color.WHITE);





    }
           




    }}


