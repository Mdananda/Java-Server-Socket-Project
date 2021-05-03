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

public class Introduce extends JFrame {
   // JButton owner, open, help;
   /// JLabel th;
   // ImageIcon ii, i1, i2, i3, i4;
    
     public Introduce()
     {
       // ImageIcon ii, i1, i2, i3, i4;
        super("Home :: Welcome to You...!!!");
        ImageIcon ii, i1, i2, i3, i4, i5, i6;
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1400, 750);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        
         
        i5 = new ImageIcon("home.png");
        JButton home = new JButton("Home");
        home.setIcon(i5);
        home.setBounds(20, 50, 120, 50);
        add(home);    
        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               new Introduce();
               setVisible(false);
            }
        });
         i6 = new ImageIcon("exit.png");
        JButton exit = new JButton("Exit");
        exit.setIcon(i6);
        exit.setBounds(20, 515, 120, 50);
        add(exit);    
        exit.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
               ///new Introduce();
               setVisible(false);
            }
        });
        
         
        i1 = new ImageIcon("Owner2.png");
        JButton owner = new JButton("Owner");
        //i1 = new ImageIcon("Owner2.png");
        owner.setIcon(i1);
        owner.setBounds(20, 170, 120, 50);
        add(owner);
        
        i2 = new ImageIcon("open.png");
        JButton open = new JButton("Open");
        open.setIcon(i2);
        open.setBounds(20, 280, 120, 50);
        add(open);
        
        i3 = new ImageIcon("help.png");
        JButton help = new JButton("Help");
        //help.setForeground(Color.yellow);
       // help.setBackground(Color.GREEN); 
        help.setIcon(i3);
        help.setBounds(20, 400, 120, 50);
        //ii = new ImageIcon("image\\shareit(2).pnj");
        //help.setIcon(ii);
        add(help);
        
        owner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    new Owner();
                    setVisible(false);
            }
        });
       
       
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                   new Project();
                   setVisible(false);
            }
        });
        
         
        help.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    new Help();
                    setVisible(false);
            }
        });
        
        i4 = new ImageIcon("thank.png");
        JLabel th = new JLabel("------ Thank You------");
        Font font3 = new Font("Arial", Font.BOLD, 20);
        th.setFont(font3);
        th.setIcon(i4);
        th.setBounds(600, 600, 400, 30);
        add(th);
      
         ImageIcon shr = new ImageIcon("download.jpg");
         JLabel sr = new JLabel("Share it");
         sr.setIcon(shr);
         sr.setBounds(0, 0, 1400, 750);
         add(sr);
       
         Container con = getContentPane();
         con.setBackground(Color.GREEN);
         //con.setIgnoreRepaint(shr);
         /// pack();
        
    }     
    
}
