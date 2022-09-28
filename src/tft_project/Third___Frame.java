
package tft_project;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;




public class Third___Frame extends JFrame {
   
    
   JButton Save_Button = new JButton("Save");
   JTextField TextField1=new JTextField("Enter your Email ",20);
   JLabel Label_text=new JLabel();
   JLabel Label01_text=new JLabel();
   JLabel Label02_text=new JLabel();
   JLabel Label03_text=new JLabel();
   JLabel Label04_text=new JLabel();
   JLabel Label05_text=new JLabel();
   Icon backGraund_Jouin_Us = new ImageIcon(getClass().getResource("image303.png"));
   Icon icon1_Jouin_Us = new ImageIcon(getClass().getResource("image20.png"));
   Icon icon2_Jouin_Us = new ImageIcon(getClass().getResource("image30.png"));
   Icon icon3_Jouin_Us = new ImageIcon(getClass().getResource("image40.png"));
   JLabel Labe_icon31_text=new JLabel(icon1_Jouin_Us);
   JLabel Labe_icon32_text=new JLabel(icon2_Jouin_Us);
   JLabel Labe_icon33_text=new JLabel(icon3_Jouin_Us);
   JLabel Labe_backGraund_Jouin_Us=new JLabel(backGraund_Jouin_Us);
   JLabel Labe2_text=new JLabel();
   JLabel Labe201_text=new JLabel();
   JLabel Labe202_text=new JLabel();
   JLabel Labe31_text=new JLabel();
   JLabel Labe32_text=new JLabel();
   JLabel Labe33_text=new JLabel();
   
   Connection connection=null;
   
   public Third___Frame(){
     
        super("Jouin Us ");
        setLayout(null);
        setResizable(false);
       
       
       
      // try{
   // String db_url="jdbc:mysql://localhost:3306/db?useSSL= true ";
          // String db_username="root";
         // String db_pass="1234";
            
    // connection = DriverManager.getConnection(db_url,db_username,db_pass); 
    //  } 
  //  catch (SQLException e) {
   //  e.printStackTrace();
 // }
      
        
        
         Save_Button = new JButton("Save");
         Label_text=new JLabel("Thank you for participating in the TFT satisfaction survey!\n  ");
         Label01_text=new JLabel(" \n These comments are important to us because your responses will help us \n");
         Label02_text=new JLabel("\n track and address any issues you may have, in addition to focusing better\n");
         Label03_text=new JLabel("\n on our development. Your responses will be used and added to your favorite list.\n");
         Label04_text=new JLabel("\n  You will receive all updates, applications and searches by SNAKES LADDERS.  ");
         Label05_text =new JLabel( "\n Please put your email address in a box below and we will send you a survey as soon as possible.  ");
         Labe2_text=new JLabel("Special thanks from the team workers for the project ");
         Labe201_text =new JLabel("\n who put all their energy and time to present this game s ");
         Labe202_text =new JLabel("\n It consists of three members ");
         Labe31_text=new JLabel("Group leader : Anyasus ");
         Labe32_text=new JLabel("Developer 1 : Gerard  ");
         Labe33_text=new JLabel("Developer 2 : Mr.X  ");
        
         
         
         
         Save_Button.setFocusable(false);
         Save_Button.setFont (new Font("Comic Sans",Font.BOLD,15));
         Save_Button.setForeground(Color.red);
         Label_text.setFont (new Font("Comic Sans",Font.BOLD,15));
         Label_text.setForeground(Color.blue);
         Label01_text.setFont (new Font("Comic Sans",Font.BOLD,15));
         Label01_text.setForeground(Color.blue);
         Label02_text.setFont (new Font("Comic Sans",Font.BOLD,15));
         Label02_text.setForeground(Color.blue);
         Label03_text.setFont (new Font("Comic Sans",Font.BOLD,15));
         Label03_text.setForeground(Color.blue);
         Label04_text.setFont (new Font("Comic Sans",Font.BOLD,15));
         Label04_text.setForeground(Color.blue);
         Label05_text.setFont (new Font("Comic Sans",Font.BOLD,15));
         Label05_text.setForeground(Color.blue);
         Labe2_text.setFont (new Font("Comic Sans",Font.BOLD,15));
         Labe2_text.setForeground(Color.blue);
         Labe201_text.setFont (new Font("Comic Sans",Font.BOLD,15));
         Labe201_text.setForeground(Color.blue);
         Labe202_text.setFont (new Font("Comic Sans",Font.BOLD,15));
         Labe202_text.setForeground(Color.blue);
         Labe31_text.setFont (new Font("Comic Sans",Font.BOLD,12));
         Labe31_text.setForeground(Color.red);
         Labe32_text.setFont (new Font("Comic Sans",Font.BOLD,12));
         Labe32_text.setForeground(Color.red);
         Labe33_text.setFont (new Font("Comic Sans",Font.BOLD,12));
         Labe33_text.setForeground(Color.red);
         
         
         
            Labe_backGraund_Jouin_Us.setBounds(0, 0, 750, 627);
            Label_text.setBounds(10, 20, 725, 27);
            Label01_text.setBounds(10, 57, 725, 27);
            Label02_text.setBounds(10, 94, 725, 27);
            Label03_text.setBounds(10, 131, 725, 27); 
            Label04_text.setBounds(10, 168, 725, 27);
            Label05_text.setBounds(10, 205, 725, 27); 
            TextField1.setBounds(95, 270, 460, 50);
            Save_Button.setBounds(580, 270, 90, 50);
            Labe2_text.setBounds(10, 360, 725, 27);
            Labe201_text.setBounds(10, 397, 725, 27);
            Labe202_text.setBounds(10, 434, 725, 27);
            Labe31_text.setBounds(10, 470, 140, 27);
            Labe32_text.setBounds(160, 470, 140, 27);
            Labe33_text.setBounds(310, 470, 140, 27);
            Labe_icon31_text.setBounds(10, 500, 100, 100);
            Labe_icon32_text.setBounds(160, 500, 100, 100);
            Labe_icon33_text.setBounds(310, 500, 100, 100);
        
        
        
        add(Labe_backGraund_Jouin_Us);
        add(Label_text);
        add(TextField1);
        add(Save_Button);
        add(Labe2_text);
        add(Labe31_text);
        add(Labe32_text);
        add(Labe33_text);
        add(Labe_icon31_text);
        add(Labe_icon32_text);
        add(Labe_icon33_text);
        add(Label01_text);
        add(Label02_text);
        add(Label03_text);
        add(Label04_text);
        add(Label05_text);
        add(Labe201_text);
        add(Labe202_text);
        
       Handeler h = new Handeler(); 
        
        
        
       
        Save_Button.addActionListener(h);
       
       
       
   }
   
   public class Handeler implements ActionListener{
   
    public void actionPerformed(ActionEvent event){
        if ( event.getSource() == Save_Button){
             
              String Email=TextField1.getText();
                ;
                String Insert=String.format("INSERT INTO users(Email) values ('%s',);",Email);
                
                try
                {
                    Statement s=connection.createStatement();
                    s.executeUpdate(Insert);
                    
            }   catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            
        }
    }
   
   }
   
   
   
   
}
