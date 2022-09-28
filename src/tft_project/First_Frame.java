
package tft_project;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;



public class First_Frame extends JFrame  {
     
    
     JButton Start_Button = new JButton("start");
     JButton Information_Button = new JButton("Information");
     JButton Play_Button= new JButton("Play");
     JButton Stop_Button = new JButton("Stop");
     JLabel Titel_labelMusic = new JLabel();
     JButton JoinUs_Button=new JButton("Join us");
     Icon Titel_icon = new ImageIcon(getClass().getResource("clipart2108666.png"));
     JLabel Titel_label = new JLabel(Titel_icon);
     Icon backGraund_home = new ImageIcon(getClass().getResource("image404.png"));
     JLabel backGraund_home_label = new JLabel(backGraund_home);
       
     
     
 public First_Frame (){
          
          
           super ("Home ");
           setLayout(null); 
           setResizable(false);
           
           
           
           
       Titel_labelMusic=new JLabel("Audio Options");
       backGraund_home_label = new JLabel(backGraund_home);
       backGraund_home_label.setBounds(0, 0, 750, 627);
       Titel_label.setBounds(200, 65, 302, 68);
        Start_Button.setBounds(291, 204, 150, 84);
        Information_Button.setBounds(291, 304, 150, 84);
        JoinUs_Button.setBounds(291, 404, 150, 84);
        
        
        Titel_labelMusic.setBounds(291, 477, 150, 84);
        Play_Button.setBounds(270, 540, 90, 50);
        Stop_Button.setBounds(370, 540, 90, 50);
        
        Start_Button.setFocusable(false);
        Information_Button.setFocusable(false);
        JoinUs_Button.setFocusable(false);
        Play_Button.setFocusable(false);
         Stop_Button.setFocusable(false);
          Play_Button.setFont (new Font("Comic Sans",Font.BOLD,15));
         Stop_Button.setFont (new Font("Comic Sans",Font.BOLD,15));
         
         Titel_labelMusic.setFont (new Font("Comic Sans",Font.BOLD,20));
        Start_Button.setFont (new Font("Comic Sans",Font.BOLD,20));
        Information_Button.setFont (new Font("Comic Sans",Font.BOLD,20));
        JoinUs_Button.setFont (new Font("Comic Sans",Font.BOLD,20));
      
         
        add(Titel_label);
        add(Start_Button);
        add(Information_Button);
        add(JoinUs_Button);
        add(Play_Button);
        add(Stop_Button);
        add(Titel_labelMusic);
        add(backGraund_home_label);
        
          Handler h = new Handler();
        Start_Button.addActionListener(h);
        Information_Button.addActionListener(h);
        JoinUs_Button.addActionListener(h);
        Play_Button.addActionListener(h);
        Stop_Button.addActionListener(h);
        
        
      }
      
      
      public class Handler implements ActionListener {
      
       
        @Override
        public void actionPerformed(ActionEvent event) {

            
            if (event.getSource() == Start_Button)
               {
                Second__Frame f2=new Second__Frame();
                f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f2.setSize(801, 627);
                f2.setVisible(true);
               }

            if (event.getSource() == Information_Button) {
                JOptionPane.showMessageDialog(null,
                        "How to play:\n"
                        + "\n"
                        + "- The game will take it in turns to roll the dice.\n"
                        + "\n"
                        + "- If you click your button Your player will move forward with the \n"
                        + "the number shown under your button.\n"
                        + "\n"
                        + "- If your player lands at the bottom of a ladder, your player will move up to the top of the ladder.\n"
                        + "\n"
                        + "- If your player lands on the head of a snake, your player will slide down to the bottom of the snake.\n"
                        + "\n"
                        + "- The first player to get to the 100 is the winner.\n"
                        + "©️copyrights.All Rights Reserved",
                         "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            
            
             if (event.getSource() == JoinUs_Button)
                  {
                    Third___Frame f3=new Third___Frame();
                    f3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    f3.setSize(750, 627);
                    f3.setVisible(true);
                  }
           
           
             if(event.getSource()==Play_Button)
             {
               playMusic();
             }
            
            if(event.getSource()==Stop_Button)
            {
             
            }
            
           
            
            
    }
        
  void  playMusic()
           {
             InputStream music;
             try
              {
               music =new FileInputStream(new File("Musicplay2.mp3"));
               AudioStream audios = new AudioStream(music);
               AudioPlayer.player.start(audios);
              }
             catch(Exception e)
                 {
                  JOptionPane.showMessageDialog(null,"error");
                 }
            }     
         
      
  }
}
     
          
          
      
      

     

