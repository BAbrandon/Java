import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckboxesGUI extends JPanel {
	
		// declare variables/controls to
		// be used in program
	private JLabel lblName, lblMajor, lblGrade;
	private JLabel lblOutput;
	private JTextField txtName, txtMajor, txtGrade;
	private JCheckBox cbxName, cbxMajor, cbxGrade;
	private JButton btnDone, btnClear; 
	private String output;
	private Boolean gotName, gotMajor, gotGrade;
	
	public CheckboxesGUI()
	{
			// define listeners
		StyleListener personalInfo = new StyleListener();
		ButtonListener buttonWork = new ButtonListener();
		ClearListener buttonClear = new ClearListener();
		
			// initialize variables
		gotName = false;
		gotMajor = false;
		gotGrade = false;
		output = "";
		
			// create a label that will
			// be used for display
		lblOutput = new JLabel("------------");
		
			// create labels and text fields
			// for name, major and grade
		lblName = new JLabel("What is your name?");
		txtName = new JTextField(12);
			// create check boxes for name,
			// major, and grade
		lblMajor = new JLabel("What is your Major?");
		txtMajor = new JTextField(12);
		
		lblGrade = new JLabel("What is your Grade level?");
		txtGrade = new JTextField(12);
		
		cbxName = new JCheckBox("Name");
		cbxMajor = new JCheckBox("Major");
		cbxGrade = new JCheckBox("Grade");
			// create button for ending input
		btnDone = new JButton("Done");
		
			// create a button for clearing
		btnClear = new JButton("Clear");
		
			// associate listeners with 
			// appropriate controls
		cbxName.addItemListener(personalInfo);
		cbxMajor.addItemListener(personalInfo);
		cbxGrade.addItemListener(personalInfo);
		
		btnDone.addActionListener(buttonWork);
		btnClear.addActionListener(buttonClear);
			// add all controls to panel
		add(lblName);
		add(txtName);
		add(lblMajor);
		add(txtMajor);
		add(lblGrade);
		add(txtGrade);
		add(cbxName);
		add(cbxMajor);
		add(cbxGrade);
		add(btnDone);
		add(btnClear);
		add(lblOutput);
			// set up size and control of panel
	    setPreferredSize (new Dimension(350, 150));
	    setBackground (Color.YELLOW);
		
	}	// end constructor CheckBoxesGUI
	
	private class StyleListener implements ItemListener
	{
		public void itemStateChanged (ItemEvent event)
		{
			
				// name was selected
			if (cbxName.isSelected())
			{
					// don't duplicate name info
					// in building of string
				if (gotName == false)
				{
					System.out.print("Name: "+txtName.getText());
					output = output +" "+ txtName.getText(); 
					gotName = true;
				}
			}	// end outer if
			
			
				// major was selected
			if (cbxMajor.isSelected())
			{
					// don't duplicate major info
					// in building of string
				if (gotMajor == false)
				{
					System.out.print("Major: "+txtMajor.getText());
					output = output +" "+ txtMajor.getText(); 
					gotMajor = true;
				}
				
			}	// end outer if
			
			
				// grade was selected
			if (cbxGrade.isSelected())
			{
					// don't duplicate grade info
					// in building of string
				if (gotGrade == false)
				{
					System.out.print("Grade: "+txtGrade.getText());
					output = output +" "+ txtGrade.getText(); 
					gotGrade = true;
				}
				
			}	// end outer if
			
		}	// end method itemStateChanged
	}	// end class StyleListener
	
	   private class ButtonListener implements ActionListener
	   {
	      public void actionPerformed (ActionEvent event)
	      {
	    	  	// display this label!
	    	  lblOutput.setText(output);
	      }
	   }	// end class ButtonListener
	   
	   private class ClearListener implements ActionListener
	   {
	      public void actionPerformed (ActionEvent event)
	      {
	    	  	// clear everything!
	    	  output = "";
	    	  txtName.setText("");
	    	  txtMajor.setText("");
	    	  txtGrade.setText("");
	    	  cbxName.setSelected(false);
	    	  cbxMajor.setSelected(false);
	    	  cbxGrade.setSelected(false);
	    	  gotName = gotMajor = gotGrade = false;
	    	  lblOutput.setText("------------");
	      }
	   }	// end class ClearListener
	
}	// end class CheckboxesGUI

