
package tft_project;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Second__Frame  extends JFrame  
{
    
    
     Icon backGraund = new ImageIcon(getClass().getResource("Board Small 600 600.png"));
     Icon player1_blue = new ImageIcon(getClass().getResource("player 1.png"));
     Icon player2_yellow = new ImageIcon(getClass().getResource("player 2.png"));
     Icon Diskone = new ImageIcon(getClass().getResource("Disk 1.png"));
     Icon Disktwo = new ImageIcon(getClass().getResource("dice 2.png"));
     Icon Diskthree = new ImageIcon(getClass().getResource("dice 3.png"));
     Icon Diskfour = new ImageIcon(getClass().getResource("dice 4.png"));
     Icon Diskfive = new ImageIcon(getClass().getResource("dice 5.png"));
     Icon Disksix = new ImageIcon(getClass().getResource("dice 6.png"));
     
       JLabel backGraund_label = new JLabel(backGraund);
       JButton Play_Button_blue = new JButton();
       JButton Play_Button_yellow = new JButton();
       JButton Exit_Button = new JButton();
       JLabel player_Array[] = new JLabel[2];
       JLabel player_Array2[] = new JLabel[2];
       JLabel Trun_player=new JLabel();
       JLabel Diskicon =new JLabel();
         
       

       
public Second__Frame()
   {  
       
     
        super("Game");
        setLayout(null);
        setResizable(false);
          
          
        
          backGraund_label = new JLabel(backGraund);
          Play_Button_blue = new JButton("ThrowDice");
          Play_Button_blue.setFont (new Font("Comic Sans",Font.BOLD,10));
          Play_Button_blue.setFocusable(false);
          Play_Button_yellow = new JButton("ThrowDice");
          Play_Button_yellow.setFont (new Font("Comic Sans",Font.BOLD,10));
          Play_Button_yellow.setFocusable(false);
          Exit_Button = new JButton(" Exit ");
          Exit_Button .setFont (new Font("Comic Sans",Font.BOLD,20));
          Exit_Button .setFocusable(false);
          Exit_Button.setForeground(Color.red);
          player_Array[0] = new JLabel(player1_blue);
          player_Array[1] = new JLabel(player2_yellow);
          player_Array2[0] = new JLabel(player1_blue);
          player_Array2[1] = new JLabel(player2_yellow);
          Trun_player=new JLabel("Blue role Play");
          Trun_player.setFont (new Font("Comic Sans",Font.BOLD,20));
          Diskicon =new JLabel();
        
        
        player_Array[0].setBounds(1, 542, 60, 60);
        player_Array[1].setBounds(1, 542, 60, 60);
        backGraund_label.setBounds(0, 0, 605, 605);
        Play_Button_blue.setBounds(623, 230, 90, 100);
        Play_Button_yellow.setBounds(700, 230, 90, 100);
        Exit_Button.setBounds(623, 534, 144, 60);
        Trun_player.setBounds(623, 18, 158, 46);
        Diskicon.setBounds(623, 94, 110, 110);
        player_Array2[0].setBounds(623, 380, 70, 70);
        player_Array2[1].setBounds(716, 380, 70, 70);
        
      
        
        add(player_Array[0]);
        add(player_Array[1]);
        add(player_Array2[0]);
        add(player_Array2[1]);
        add(backGraund_label);
        add(Play_Button_blue);
        add(Play_Button_yellow);
        add(Exit_Button);
        add(Trun_player);
        add(Diskicon);
       
       
       Handeler h = new Handeler();
        
        Play_Button_blue.addActionListener(h);
        Play_Button_yellow.addActionListener(h);
        Exit_Button.addActionListener(h);
           
           
    }
 
 
 
 
 
 
       public class Handeler implements ActionListener
{
           
           
           
           Random random = new Random();
           int arrayX[] = {1, 61, 122, 183, 244, 305, 366, 427, 488, 549};
           int arrayY[] = {540, 480, 420, 360, 300, 240, 180, 120, 60, 0};
           int total_Random = 0;
           int array_count = 0;
           boolean[] flag = {false, false};
           int position_Array[][] = {{0, 0}, {0, 0}};
           String message = null;
           int copytotal_Random;
              
           
           
           
           
                public void actionPerformed(ActionEvent event)
        {
       
                    
           if (array_count == 0 && event.getSource() == Play_Button_blue)
               {
                playFunction();
               }
           
            if ( event.getSource() == Exit_Button)
              {
                ExitFunction();
              }
             
            if (array_count == 1 && event.getSource() == Play_Button_yellow) 
               {
                playFunction();
               }
               
        }
                
             
                
                
               public void ExitFunction(){dispose();}
                
                
public void playFunction(){
                 
     
                  total_Random  = 1 + random.nextInt(6);
                  copytotal_Random=total_Random;

                     if(total_Random==1)
                     {
                         Diskicon.setIcon(Diskone);
                     }
                      
                     else  if(total_Random==2)
                     {
                         Diskicon.setIcon(Disktwo);
                     }
                       
                     else  if(total_Random==3)
                     {
                        Diskicon.setIcon(Diskthree); 
                     }
                       
                     else if(total_Random==4)
                     {
                           Diskicon.setIcon(Diskfour);
                     }
                     
                     else  if(total_Random==5)
                     {
                         Diskicon.setIcon(Diskfive);
                     }
                       
                     else {
                         Diskicon.setIcon(Disksix);
                     }
                       
                   
                      
                      
                 while (true){
                 
                     
                     if (total_Random == 0) {
                    
                         break;
                         
                     }
                     
                     
                     
                     if (flag[array_count] == true && position_Array[array_count][0] == 0) {
                    position_Array[array_count][1]++;
                    total_Random--;
                    flag[array_count] = false;
                }
                     
                     
                     position_Array[array_count][0]++;
                         total_Random--;   
                
                
                 if (position_Array[array_count][0] == 10) {
                    position_Array[array_count][0] = -9;
                    position_Array[array_count][1]++;

                }
                 
                 
                 
                   if (position_Array[array_count][0] == 0 && position_Array[array_count][1] == 9) {
                    
                    player_Array[array_count].setBounds(arrayX[Math.abs(position_Array[array_count][0])], arrayY[position_Array[array_count][1]], 60, 60);
                    if (array_count == 0) {
                        message = "Player Blue  won";
                    }
                    if (array_count == 1) {
                        message = "Player yellow  won";
                    }
                    JOptionPane.showMessageDialog(null, message, "Congratulation", JOptionPane.DEFAULT_OPTION);
                    dispose();
                    break;
                }
                  
                    player_Array[array_count].setBounds(arrayX[Math.abs(position_Array[array_count][0])], arrayY[position_Array[array_count][1]], 60, 60);
                     
                    
                    if (position_Array[array_count][0] == 0) { //if x=0 ->y++
                    if (total_Random > 0) {
              
                        total_Random--;
                        position_Array[array_count][1]++;
                        
                    } else {
                      
                        flag[array_count] = true;
                    }
                }
                               
                    }
                 
                 
                 
                    ladderFunction();
                    snakeFunction();
                    
                    
                    if (copytotal_Random==6){
                    
                    }
                    else if (array_count == 1&&copytotal_Random!=6) 
                    {
                     array_count = 0;
                     Trun_player.setText("Blue role Play");
                     Trun_player.setFont (new Font("Comic Sans",Font.BOLD,20));
                     Trun_player.setForeground(Color.blue);
                    
                    } 
                    else 
                    { 
                    array_count++; 
                    Trun_player.setText("yellow role Play");
                    Trun_player.setFont (new Font("Comic Sans",Font.BOLD,20));
                    Trun_player.setForeground(Color.yellow);
                    } 
                    
     if (position_Array[0][0] == position_Array[1][0] && position_Array[0][1] == position_Array[1][1]) {
                player_Array[0].setBounds((arrayX[Math.abs(position_Array[array_count][0])] - 20), arrayY[position_Array[array_count][1]], 60, 60);
                player_Array[1].setBounds((arrayX[Math.abs(position_Array[array_count][0])] + 20), arrayY[position_Array[array_count][1]], 60, 60);}
                     
              


 } 
           
 
public void ladderFunction()
       {
               if (Math.abs(position_Array[array_count][0]) == 2 && position_Array[array_count][1] == 2) 
               {
                position_Array[array_count][0] = 1;
                position_Array[array_count][1] = 4;
               } //second
            else if (Math.abs(position_Array[array_count][0]) == 8 && position_Array[array_count][1] == 3) 
               {
                position_Array[array_count][0] = 9;
                position_Array[array_count][1] = 5;
               } //third
            else if (Math.abs(position_Array[array_count][0]) == 0 && position_Array[array_count][1] == 6) 
               {
                position_Array[array_count][0] = 1;
                position_Array[array_count][1] = 7;
               } //fourth
            else if (Math.abs(position_Array[array_count][0]) == 3 && position_Array[array_count][1] == 6) 
               {
                position_Array[array_count][0] = 3;
                position_Array[array_count][1] = 8;
               } //fifth  
            else if (Math.abs(position_Array[array_count][0]) == 5 && position_Array[array_count][1] == 7) 
              {
                position_Array[array_count][0] = 6;
                position_Array[array_count][1] = 8;
              } 
            player_Array[array_count].setBounds(arrayX[Math.abs(position_Array[array_count][0])], arrayY[position_Array[array_count][1]], 60, 60);
       }
           
      
           
   public void snakeFunction()
       {
                if (Math.abs(position_Array[array_count][0]) == 0 && position_Array[array_count][1] == 2) 
                {
                position_Array[array_count][0] = 1;
                position_Array[array_count][1] = 0;
                } //second
            else if (Math.abs(position_Array[array_count][0]) == 6 && position_Array[array_count][1] == 2) 
               {
                position_Array[array_count][0] = 5;
                position_Array[array_count][1] = 1;
               } //third
            else if (Math.abs(position_Array[array_count][0]) == 6 && position_Array[array_count][1] == 4)  
               {
                position_Array[array_count][0] = 8;
                position_Array[array_count][1] = 2;
                } //fourth
            else if (Math.abs(position_Array[array_count][0]) == 4 && position_Array[array_count][1] == 5) 
               {
                position_Array[array_count][0] = 3;
                position_Array[array_count][1] = 3;
                } //fifth  
            else if (Math.abs(position_Array[array_count][0]) == 6 && position_Array[array_count][1] == 7) 
               {
                position_Array[array_count][0] = 5;
                position_Array[array_count][1] = 4;
               } //sixth
            else if (Math.abs(position_Array[array_count][0]) == 9 && position_Array[array_count][1] == 8) 
               {
                position_Array[array_count][0] = 8;
                position_Array[array_count][1] = 5;
               }
                else if (Math.abs(position_Array[array_count][0]) == 1 && position_Array[array_count][1] == 9) 
               {
                position_Array[array_count][0] = 0;
                position_Array[array_count][1] = 4;
               }
            player_Array[array_count].setBounds(arrayX[Math.abs(position_Array[array_count][0])], arrayY[position_Array[array_count][1]], 60, 60); 
       }
           
           
           
    }

    
}
