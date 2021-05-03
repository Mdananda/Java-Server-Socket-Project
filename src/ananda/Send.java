package ananda;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Send extends JFrame{
    JButton home, back, file, image, audio, vedio;
    ImageIcon i1, i2, fl, img, ad, vd, mg;
    public Send(){
        super("Select The Options...");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1400, 750);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        
        i1 = new ImageIcon("home.png");
        JButton home = new JButton("Home");
        home.setIcon(i1);
        home.setBounds(1200, 630, 120, 50);
        add(home);    
        
        i2 = new ImageIcon("Back2.png");
        JButton back = new JButton("Back");
        back.setIcon(i2);
        back.setBounds(20, 630, 120, 50);
        add(back); 
        
        home.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
               new Introduce();
               setVisible(false);
            }
        });
        
        
        back.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
               new Project();
               setVisible(false);
            }
        });
        
         fl = new ImageIcon("file.png");
        JButton file = new JButton("File");
        file.setIcon(fl);
        file.setBounds(620, 100, 120, 50);
        add(file);
        
        mg = new ImageIcon("file.png");
        JButton mgs = new JButton("Others");
        mgs.setIcon(mg);
        mgs.setBounds(620, 500, 120, 50);
        add(mgs);
        
        img = new ImageIcon("image.png");
        JButton image = new JButton("Image");
        image.setIcon(img);
        image.setBounds(620, 200, 120, 50);
        add(image);
        
        ad = new ImageIcon("audio.png");
        JButton audio = new JButton("Audio");
        audio.setIcon(ad);
        audio.setBounds(620, 300, 120, 50);
        add(audio);
        
        vd = new ImageIcon("vedio.png");
        JButton vedio = new JButton("Vedio");
        vedio.setIcon(vd);
        vedio.setBounds(620, 400, 120, 50);
        add(vedio);
         
        file.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
              setVisible(false);
              new FileServer().main(null);
            }
        });
          
          
        image.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
              setVisible(false);
              new FileServer().main(null);
            }
        });
        
        
        
        mgs.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
            setVisible(false);
            new FileServer().main(null);
            }
        });
        
        audio.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                setVisible(false);
                new FileServer().main(null);
            }
        });
        
        
       vedio.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                System.out.println("Work on this page is underway"); 
                setVisible(false);
                new FileServer().main(null);
            }
        });
        
        ImageIcon shr = new ImageIcon("download.jpg");
         JLabel sr = new JLabel("Share it");
         sr.setIcon(shr);
         sr.setBounds(0, 0, 1400, 750);
         add(sr);
         Container con = getContentPane();
         con.setBackground(Color.BLUE);
        
    }
        
}
