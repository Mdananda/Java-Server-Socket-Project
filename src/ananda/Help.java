package ananda;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Help extends JFrame {
    JLabel an, hm, mh, th;
    JButton home, back;
     ImageIcon i1, i2;
    
    public Help()
    {
        super("Help This Projetcs..!!!");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1400, 750);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        JLabel an = new JLabel("If You need help, then select the open buttom");
        Font font = new Font("Arial", Font.BOLD, 25);
        an.setFont(font);
        an.setBounds(220, 100, 800, 30);
        add(an);
        
        JLabel mh = new JLabel("If You see The Owner this Program, then select the owner buttom");
        Font font1 = new Font("Arial", Font.BOLD, 25);
        mh.setFont(font1);
        mh.setBounds(220, 170, 800, 30);
        add(mh);
        
        JLabel hm = new JLabel("If You Open the Program, then select the open buttom");
        Font font2 = new Font("Arial", Font.BOLD, 25);
        hm.setFont(font2);
        hm.setBounds(220, 240, 750, 30);
        add(hm);
        
        JLabel th = new JLabel("------ Thank You------");
        Font font3 = new Font("Arial", Font.BOLD, 20);
        th.setFont(font3);
        th.setBounds(600, 600, 600, 30);
        add(th);
              
        
        i1 = new ImageIcon("home.png");
        JButton home = new JButton("Home");
        home.setIcon(i1);
        home.setBounds(1200, 630, 120, 50);
        add(home);       
        
        home.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
               new Introduce();
               setVisible(false);
            }
        });
        
        i2 = new ImageIcon("Back2.png");
        JButton back = new JButton("Back");
        back.setIcon(i2);
        back.setBounds(20, 630, 120, 50);
        add(back);       
        
        back.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
               new Introduce();
               setVisible(false);
            }
        });
        
        
        
         Container con = getContentPane();
         con.setBackground(Color.RED);
        /// pack();
    }
    
}
