import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Arc2D;
import java.util.*;

public class NewtonsMethodGUI extends JPanel{
    private JPanel pnlName, pnlComplete,pnlTitle;
    private JPanel pnlStringOutput, pnlBottom1;
    private JPanel pnlBottom2;
    private JLabel lblBase, lblStringOutput, lblAuthor,lblRoot,lblAnswer, lblTitle;
    private JTextField txtBase, txtStringOutput,txtRoot;
    private JButton btnReverse, btnClear, btnExit;
    public double answer = 0.0;
    public double root, base =1.0;
    public NewtonsMethodGUI(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(1200, 250));
        setBackground(Color.LIGHT_GRAY);

        lblTitle = new JLabel("Calculator to Solve Roots \u207F \u221A x");
        lblTitle.setFont(new Font ("Helvetica", Font.PLAIN, 18));
        lblTitle.setForeground(Color.BLACK);

        lblBase = new JLabel("Enter the base x:");
        lblBase.setFont(new Font ("Helvetica", Font.PLAIN, 16));
        lblBase.setForeground(Color.BLACK);

        lblRoot = new JLabel("Enter the root n:");
        lblRoot.setFont(new Font ("Helvetica", Font.PLAIN, 16));
        lblRoot.setForeground(Color.BLACK);

        lblStringOutput = new JLabel("Your answer:");
        lblStringOutput.setFont(new Font ("Helvetica", Font.PLAIN, 16));
        lblStringOutput.setForeground(Color.BLACK);

        lblAnswer = new JLabel(""+answer);
        lblAnswer.setFont(new Font ("Helvetica", Font.PLAIN, 16));
        lblAnswer.setForeground(Color.BLACK);

        lblAuthor = new JLabel("\n\nThis program was written by Brandon Ashworth");
        lblAuthor.setFont(new Font ("Helvetica", Font.PLAIN, 16));
        lblAuthor.setForeground(Color.BLACK);

        txtBase = new JTextField(70);
        txtBase.setFont(new Font ("Helvetica", Font.PLAIN, 16));
        txtBase.setForeground(Color.BLACK);

        txtRoot = new JTextField(70);
        txtRoot.setFont(new Font ("Helvetica", Font.PLAIN, 16));
        txtRoot.setForeground(Color.BLACK);

        btnReverse = new JButton("solve");
        btnReverse.setBackground(Color.GREEN);
        btnReverse.setFont(new Font("Helvetica", Font.BOLD, 20));
        btnReverse.setForeground(Color.BLACK);

        btnClear = new JButton("Clear");
        btnClear.setBackground(Color.BLUE);
        btnClear.setFont(new Font("Helvetica", Font.BOLD, 20));
        btnClear.setForeground(Color.WHITE);

        btnExit = new JButton("Exit");
        btnExit.setBackground(Color.RED);
        btnExit.setFont(new Font("Helvetica", Font.BOLD, 20));
        btnExit.setForeground(Color.WHITE);

        pnlTitle = new JPanel();
        pnlTitle.add(lblTitle);

        pnlName = new JPanel();
        pnlName.add(lblBase);
        pnlName.add(txtBase);

        pnlComplete = new JPanel();
        pnlComplete.add(lblRoot);
        pnlComplete.add(txtRoot);

        pnlStringOutput = new JPanel();
        pnlStringOutput.add(lblStringOutput);
        pnlStringOutput.add(lblAnswer);

        pnlBottom1 = new JPanel();
        pnlBottom1.add(pnlStringOutput);
        pnlBottom1.add(lblAuthor);

        pnlBottom2 = new JPanel();
        pnlBottom2.add(btnClear);
        pnlBottom2.add(btnExit);
        pnlBottom2.add(btnReverse);


        btnClear.addActionListener(new ClearListener());
        btnExit.addActionListener(new ExitListener());
        btnReverse.addActionListener(new CompleteListener());

        add(pnlTitle);
        add(pnlName);
        add(pnlComplete);
        add(pnlBottom1);
        add(pnlBottom2);

    }
    private class ClearListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            //clearing fields
            txtRoot.setText("");
            txtBase.setText("");
           // txtStringOutput.setText("");
        }	// end method actionPerformed
    }	// end class ClearListener

    private class ExitListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            int answer;

            answer = JOptionPane.showConfirmDialog(null,"Exit application?","Terminate",JOptionPane.YES_NO_CANCEL_OPTION);

            if(answer == JOptionPane.YES_OPTION){System.exit(0);}

        }	// end method actionPerformed
    }	// end class ExitListener


    private class CompleteListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            base = Double.parseDouble(txtBase.getText());
            root = Double.parseDouble(txtRoot.getText());
            answer = NewtonsCalc(base,root);
            lblAnswer.setText(""+answer);
        }   // end method actionPerformed
    }   // end class CompleteListener







public static double NewtonsCalc(double base,double root){
    double guess;
    double nextGuess = 2;
    double dir;
    double form;
    double iTime, eTime;
    iTime = System.currentTimeMillis();
    do {
        guess = nextGuess;
        if(root == 1){
            dir = (root * guess);
        }else{
           dir = (root * Math.pow(guess,root-1));
        }
        form = Math.pow(guess, root) - base;



         nextGuess = guess - (form / dir);
        System.out.println(""+nextGuess);

    }while((guess - nextGuess > .000001));
    eTime = System.currentTimeMillis();
    System.out.println(eTime - iTime+"");
    return nextGuess;
}

}
