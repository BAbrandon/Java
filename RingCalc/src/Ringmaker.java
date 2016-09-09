import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Ringmaker extends JPanel{
 private JLabel lblRingSize, lblGuage;
 private JLabel lblfactsize;
 private JTextField txtGuage;
 private String[] ringSize = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"};
 private String[] factSize = {"0,1/4,1/2,3/4"};
 private JComboBox cboRingSize, cboFactsize;
 private JLabel lblOutput;
 
 public Ringmaker(){
  lblOutput = new JLabel("------------");
  
  lblGuage = new JLabel("What the guage of the wire?");
  txtGuage = new JTextField(12);
  
  lblRingSize = new JLabel("What is the Ring size?");
  cboRingSize = new JComboBox(ringSize);
  cboRingSize.addActionListener(new cboListener());
  
  add(lblGuage);
  add(txtGuage);
  add(lblRingSize);
  add(cboRingSize);
  add(lblOutput);
  
  setPreferredSize (new Dimension(325 , 125));
     setBackground (Color.lightGray);
 }
 private class cboListener implements ActionListener 
 {
  public void actionPerformed(ActionEvent event)
  {
   int selectionR;
   int selectionG = 0;
   String guage = txtGuage.getText();
   
   double tempSize= 0;
   double tempGuage = 0; 
   String output = "";
   double[] guageToMM = {8.26,7.34,6.52,5.81,5.18,4.62,4.11,3.66,3.25,2.90,2.59,2.31,2.06,1.83,1.63,1.45,1.30,1.14,1.02,0.914,0.812,0.711,0.635,0.558,0.508,0.457,0.355,0.304,0.279,0.254};
    

   // determine which combo box
    // was selected and act appropriately
   selectionR = cboRingSize.getSelectedIndex();
   if(guage == ""){
   selectionG = 0;
   }else{ selectionG = Integer.parseInt(guage);
   System.out.println(selectionG +"");
   }
   tempGuage = guageToMM[selectionG];
   
   switch(selectionR){
    case 1  : tempSize = 12.45; break;
    case 2  : tempSize = 13.26; break;
    case 3  : tempSize = 14.07; break;
    case 4  : tempSize = 14.88; break;
    case 5  : tempSize = 15.7;  break;
    case 6  : tempSize = 16.51; break;
    case 7  : tempSize = 17.32; break;
    case 8  : tempSize = 18.14; break;
    case 9  : tempSize = 18.95; break;
    case 10 : tempSize = 19.76; break;
    case 11 : tempSize = 20.57; break;
    case 12 : tempSize = 21.39; break;
    case 13 : tempSize = 22.2; break;
    case 14 : tempSize = 23.01; break;
    case 15 : tempSize = 23.83; break;
    case 16 : tempSize = 24.64; break;
    }
   
   
   
   
   
        // display this label!
   output = (tempSize + tempGuage)*3.14 +" mm";
       lblOutput.setText(output);
  }   // end method actionPerfomed
}
}
