import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LinkedListGUI extends JPanel {
    // declare variables that will be used in our program
    private String names[] = {"Simon", "Andy", "Betty"};
    private int ages[] = {22, 38, 19};
    private int i;
    private Person newPerson;
    private PeopleList everyone;

    private String result;

    private JPanel pnlName, pnlAge, pnlTwoButtons, pnlBottom1;
    private JPanel pnlBottom2;
    private JLabel lblName, lblAge, lblStringOutput, lblAuthor;
    private JTextField txtName, txtAge;
    private JButton btnAddName, btnDisplay, btnExit;

    public LinkedListGUI()
    {
        // give our panel a 'BoxLayout' with appropriate
        // dimensions and color
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(800, 200));
        setBackground(Color.LIGHT_GRAY);

        // instantiate the object that will represent
        // the entire linked list of people
        everyone = new PeopleList();

        // add the people's name and age from
        // the arrays 'names' and 'ages'
        for(i = 0; i<names.length;i++){
            newPerson= new Person(names[i],ages[i]);

            everyone.add(newPerson);
        }

        //------------create labels------------
        lblName = new JLabel("Enter a name:");
        lblName.setFont(new Font("Helvetica", Font.PLAIN, 16));
        lblName.setForeground(Color.BLACK);

        lblAge = new JLabel("Enter an age:");
        lblAge.setFont(new Font("Helvetica", Font.PLAIN, 16));
        lblAge.setForeground(Color.BLACK);

        lblStringOutput = new JLabel();
        lblStringOutput.setFont(new Font("Helvetica", Font.PLAIN, 16));
        lblStringOutput.setForeground(Color.BLACK);

        lblAuthor = new JLabel("This program was written by Brandon Ashworth");
        lblAuthor.setFont(new Font("Helvetica", Font.PLAIN, 16));
        lblAuthor.setForeground(Color.BLACK);


        //------------create text fields------------
        txtName = new JTextField(15);
        txtName.setFont(new Font("Helvetica", Font.PLAIN, 16));
        txtName.setForeground(Color.BLACK);

        txtAge = new JTextField(5);
        txtAge.setFont(new Font("Helvetica", Font.PLAIN, 16));
        txtAge.setForeground(Color.BLACK);


        //-----------create normal buttons------------
        btnAddName = new JButton("Add person to linked list");
        btnAddName.setBackground(Color.BLUE);
        btnAddName.setFont(new Font("Helvetica", Font.BOLD, 20));
        btnAddName.setForeground(Color.WHITE);

        btnDisplay = new JButton("Display linked list");
        btnDisplay.setBackground(Color.YELLOW);
        btnDisplay.setFont(new Font("Helvetica", Font.BOLD, 20));
        btnDisplay.setForeground(Color.BLACK);

        btnExit = new JButton("Exit");
        btnExit.setBackground(Color.RED);
        btnExit.setFont(new Font("Helvetica", Font.BOLD, 20));
        btnExit.setForeground(Color.WHITE);


        //------------create panels------------
        pnlName = new JPanel();
        pnlName.add(lblName);
        pnlName.add(txtName);

        pnlAge = new JPanel();
        pnlAge.add(lblAge);
        pnlAge.add(txtAge);

        pnlBottom1 = new JPanel();
        pnlBottom1.add(lblAuthor);

        pnlBottom2 = new JPanel();
        pnlBottom2.add(btnExit);

        pnlTwoButtons = new JPanel();
        pnlTwoButtons.add(btnAddName);
        pnlTwoButtons.add(Box.createRigidArea(new Dimension(0,10)));
        pnlTwoButtons.add(btnDisplay);

        // create listeners for components
        btnAddName.addActionListener(new AddNameListener());
        btnDisplay.addActionListener(new DisplayListener());
        btnExit.addActionListener(new ExitListener());


        // add sub panels to the main panel
        add(pnlName);
        add(pnlAge);
        add(pnlTwoButtons);
        add(pnlBottom1);
        add(pnlBottom2);
    }   // end constructor LinkedListGUI

    //------------listeners------------

    private class AddNameListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            String inputName, inputAgeText;
            int inputAge;

            inputName = txtName.getText();

            if(inputName.equals("")){
                JOptionPane.showMessageDialog(null,"You must enter a name! ", "ERROR",JOptionPane.ERROR_MESSAGE);
                return;
            }//end of if
            inputAgeText = txtAge.getText();
            if(inputAgeText.equals("")){
                JOptionPane.showMessageDialog(null,"You must enter an age! ", "ERROR",JOptionPane.ERROR_MESSAGE);
                return;
            }//end of if
            inputAge = Integer.parseInt(inputAgeText);

            newPerson = new Person(inputName,inputAge);
            everyone.add(newPerson);
            txtAge.setText("");
            txtName.setText("");
        }   // end method actionPerformed
    }   // end class AddNameListener

    private class DisplayListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            result = everyone.printList();

            JOptionPane.showMessageDialog(null, result, "Linked List",JOptionPane.INFORMATION_MESSAGE);

        }   // end method actionPerformed
    }   // end class DisplayListener

    private class ExitListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            int answer;
            answer = JOptionPane.showConfirmDialog(null, "Exit application?","Terminate",JOptionPane.YES_NO_OPTION);
            if(answer == JOptionPane.YES_OPTION){
                System.exit(0);
            }

        }   // end method actionPerformed
    }   // end class ExitListener

}   // end LinkedListGUI