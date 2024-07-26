package Project;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class GUIform extends JFrame {
    final private Font mainFont =new Font ("Segoe",Font.BOLD,18);
    JTextField tfFirstName,tfLastName;
    JLabel lbwelcome;
    public void initialize(){
      /************Form Panel************/
       JLabel lbFirstName=new JLabel("First Name");
       lbFirstName.setFont(mainFont);

        tfFirstName=new JTextField();
        tfFirstName.setFont(mainFont);

       JLabel lbLastName=new JLabel("Last Name");
       lbLastName.setFont(mainFont);

        tfLastName=new JTextField();
        tfLastName.setFont(mainFont);

        JPanel formpanel=new JPanel();
        formpanel.setLayout(new GridLayout(4,1,5,5));
        formpanel.setOpaque(false);
        formpanel.add(lbFirstName);
        formpanel.add(tfFirstName);
        formpanel.add(lbLastName);
        formpanel.add(tfLastName);
        
      /************Welcome Label*********/
        lbwelcome=new JLabel();
        lbwelcome.setFont(mainFont);

      /**********Buttton Label********/  
        JButton btnOK=new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            String firstName=tfFirstName.getText();
            String lastName=tfLastName.getText();
            lbwelcome.setText("Hello "+ firstName + "  "+lastName);
            
          }
          
        });
        
        JButton btnclear=new JButton("Clear");
        btnclear.setFont(mainFont);
        btnclear.addActionListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            tfFirstName.setText("");
            tfLastName.setText("");
            lbwelcome.setText("");
          }
          
        });

        JPanel buttonPanel=new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2,5,5));
        buttonPanel.setOpaque(false);
        buttonPanel.add(btnOK);
        buttonPanel.add(btnclear);

        JPanel mainpanel=new JPanel();
        mainpanel.setLayout(new BorderLayout());
        mainpanel.setBackground(new Color(128,128,255));
        mainpanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainpanel.add(formpanel,BorderLayout.NORTH);
        mainpanel.add(lbwelcome,BorderLayout.CENTER);
        mainpanel.add(buttonPanel,BorderLayout.SOUTH);

        add(mainpanel);

        setTitle("Welcome");
        setSize(500,600);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
      GUIform myproject= new GUIform();
      myproject.initialize();
    }
  }



