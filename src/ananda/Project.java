package ananda;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Project extends JFrame{
    
    JButton send, receive, invite, home , back;
    ImageIcon i1, i2, i3, i4, i5;
    
    public Project()
    {
        super("Share it Java Program...");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1400, 750);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        i3 = new ImageIcon("invite.png");
        i4 = new ImageIcon("send.png");
        i5 = new ImageIcon("receive.png");
        JButton send = new JButton("Send");
        JButton invite = new JButton("Invite");
        JButton receive = new JButton("Receive");
        
        send.setIcon(i4);
        send.setBounds(620, 200, 100, 50);
        add(send);
//        invite.setIcon(i3);
//        invite.setBounds(280, 30, 100, 30);
//        add(invite);
        receive.setIcon(i5);
        receive.setBounds(593, 400, 150, 50);
        add(receive);
         send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Receive();
                setVisible(false);
            }
        });
         
         receive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Send();
                System.out.println("Connected to The Devices"); 
                setVisible(false);
            }
        });
         
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
               new Introduce();
               setVisible(false);
            }
        });
        
         ImageIcon shr = new ImageIcon("download.jpg");
         JLabel sr = new JLabel("Share it");
         sr.setIcon(shr);
         sr.setBounds(0, 0, 1400, 750);
         add(sr);
        
         Container con = getContentPane();
         con.setBackground(Color.GRAY);
        
        
    }
    
}
