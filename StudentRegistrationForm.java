import java.awt.event.*;
import  javax.swing.*;

public class StudentRegistrationForm extends JFrame implements ActionListener {

    //labels
    JLabel lb1Name, lb1Roll, lb1Gender, lb1Branch;

    JTextField txtName, txtRoll, txtBranch;

    JRadioButton male, female;
    ButtonGroup genderGroup;

    JCheckBox terms;
    
    JButton submit, reset;

    public StudentRegistrationForm()
    {
        setTitle("Student Registration Form");
        setSize(450, 450);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Student name
        lb1Name = new JLabel("Student Name");
        lb1Name.setBounds (30, 30, 120, 30);
        add(lb1Name);

        txtName = new JTextField();
        txtName.setBounds(170, 30, 180,30);
        add(txtName);
        //roll number
        lb1Roll = new JLabel("Roll Number");
        lb1Roll.setBounds(30, 80, 120, 30);
        add(lb1Roll);
        txtRoll = new JTextField();
        txtRoll.setBounds(170, 80, 180, 30);
        add(txtRoll);
        //gender
        lb1Gender = new JLabel("Gender");
        lb1Gender.setBounds(30, 130, 120, 30);
        add(lb1Gender);
        male = new JRadioButton("male");
        male.setBounds(170, 130, 80, 30);
        add(male);
        female = new JRadioButton("Female");
        female.setBounds(260, 130, 100, 30);
        add(female);
        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

    //branch
    lb1Branch = new JLabel("Branch");
    lb1Branch.setBounds(30, 180, 120,30);
    add(lb1Branch);
    txtBranch = new JTextField();
    txtBranch.setBounds(170, 180, 180, 30);
    add(txtBranch);

    //terms & conditions
    terms = new JCheckBox("I accept Terms & Conditions");
    terms.setBounds(30, 230, 250, 30);
    add(terms);

    //submit button 
    submit = new JButton("Submit");
    submit.setBounds(80, 290, 100, 35);
    add(submit);

    //reset button
    reset = new JButton("Reset");
    reset.setBounds(220, 290, 100, 35);
    reset.addActionListener(this);
    add(reset);

    setVisible(true);
    }
    @Override 
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == reset)
        {
    txtName.setText("");
    txtRoll.setText("");
    txtBranch.setText("");
        }

    genderGroup.clearSelection();
    terms.setSelected(false);
    }
public static void main(String[]args)
{
    new StudentRegistrationForm();
}
}