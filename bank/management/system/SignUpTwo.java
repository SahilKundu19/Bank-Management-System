package bank.management.system;

import javax.swing.*;
import javax.swing.JComboBox;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener{

    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, Category, Income, educate, Occupation;
    String formno;

    SignUpTwo(String formno) {
        this.formno = formno;

        setLayout(null);

        setTitle("NEW APPLICATION FORM - Page 02");

        JLabel additionalDetails = new JLabel("Page 02: Additional Details");
        additionalDetails.setFont(new Font("Times New Roman", Font.BOLD, 22));
        additionalDetails.setBounds(290,60,400,30);
        add(additionalDetails);

        JLabel name = new JLabel("Religion: ");
        name.setFont(new Font("Times New Roman", Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);

        String valReligion[] = {"Hindu","Muslim","Christian","Sikh","Others"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setFont(new Font("Rale way", Font.BOLD, 14));
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel category = new JLabel("Category: ");
        category.setFont(new Font("Times New Roman", Font.BOLD, 20));
        category.setBounds(100,190,200,30);
        add(category);

        String valCategory[] = {"General","SC","ST","OBC","Others"};
        Category = new JComboBox(valCategory);
        Category.setFont(new Font("Rale way", Font.BOLD, 14));
        Category.setBounds(300,190,400,30);
        Category.setBackground(Color.WHITE);
        add(Category);

        JLabel income = new JLabel("Income: ");
        income.setFont(new Font("Times New Roman", Font.BOLD, 20));
        income.setBounds(100,240,200,30);
        add(income);

        String incomecategory[] = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        Income = new JComboBox(incomecategory);
        Income.setFont(new Font("Rale way", Font.BOLD, 14));
        Income.setBounds(300,240,400,30);
        Income.setBackground(Color.WHITE);
        add(Income);

        JLabel education = new JLabel("Educational: ");
        education.setFont(new Font("Times New Roman", Font.BOLD, 20));
        education.setBounds(100,290,200,30);
        add(education);

        JLabel qualification = new JLabel("Qualification: ");
        qualification.setFont(new Font("Times New Roman", Font.BOLD, 20));
        qualification.setBounds(100,315,200,30);
        add(qualification);

        String educationValues[] = {"Non-Graduation","Graduation","Post-Graduation","Doctrate","Others"};
        educate = new JComboBox(educationValues);
        educate.setFont(new Font("Rale way", Font.BOLD, 14));
        educate.setBounds(300,315,400,30);
        educate.setBackground(Color.WHITE);
        add(educate);

        JLabel occupation = new JLabel("Occupation: ");
        occupation.setFont(new Font("Times New Roman", Font.BOLD, 20));
        occupation.setBounds(100,390,200,30);
        add(occupation);

        String occupationoalValues[] = {"Salried","Business","Retired","Self-Employed","Student","Others"};
        Occupation = new JComboBox(occupationoalValues);
        Occupation.setFont(new Font("Rale way", Font.BOLD, 14));
        Occupation.setBounds(300,390,400,30);
        Occupation.setBackground(Color.WHITE);
        add(Occupation);

        JLabel panno = new JLabel("PAN No.: ");
        panno.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panno.setBounds(100,440,200,30);
        add(panno);

        pan = new JTextField();
        pan.setFont(new Font("Rale way", Font.BOLD, 14));
        pan.setBounds(300,440,400,30);
        pan.setBorder(BorderFactory.createLineBorder(Color.black));
        add(pan);

        JLabel aadharno = new JLabel("Aadhar No.: ");
        aadharno.setFont(new Font("Times New Roman", Font.BOLD, 20));
        aadharno.setBounds(100,490,200,30);
        add(aadharno);

        aadhar = new JTextField();
        aadhar.setFont(new Font("Rale way", Font.BOLD, 14));
        aadhar.setBounds(300,490,400,30);
        aadhar.setBorder(BorderFactory.createLineBorder(Color.black));
        add(aadhar);

        JLabel seniorcitizen = new JLabel("Senior Citizen: ");
        seniorcitizen.setFont(new Font("Times New Roman", Font.BOLD, 20));
        seniorcitizen.setBounds(100,540,200,30);
        add(seniorcitizen);

        syes = new JRadioButton("YES");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("NO");
        sno.setBounds(450,540,120,30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup seniorgroup = new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);

        JLabel esisting = new JLabel("Existing Account: ");
        esisting.setFont(new Font("Times New Roman", Font.BOLD, 20));
        esisting.setBounds(100,590,200,30);
        add(esisting);

        eyes = new JRadioButton("YES");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("NO");
        eno.setBounds(450,590,120,30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup esistinggroup = new ButtonGroup();
        esistinggroup.add(eyes);
        esistinggroup.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("Rale way", Font.BOLD,14));
        next.setBounds(600,650,100,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850,850);
        setVisible(true);
        setLocation(350,10);
    }

    public void actionPerformed(ActionEvent ae) {

        String sreligion = (String)religion.getSelectedItem();

        String scategory = (String)Category.getSelectedItem();

        String sincome = (String)Income.getSelectedItem();

        String seducation = (String)educate.getSelectedItem();

        String soccupation = (String)Occupation.getSelectedItem();

        String panno = pan.getText();

        String aadharno = aadhar.getText();

        String seniorcitizen = null;
        if(syes.isSelected()) {
            seniorcitizen = "YES";
        } else if(sno.isSelected()) {
            seniorcitizen = "NO";
        }

        String existingaccount = null;
        if(eyes.isSelected()) {
            existingaccount = "YES";
        } else if(eno.isSelected()) {
            existingaccount = "NO";
        }

        try {
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+panno+"', '"+aadharno+"', '"+seniorcitizen+"', '"+existingaccount+"')";
            c.s.executeUpdate(query);

            setVisible(false);
            new SignUpThree(formno).setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new SignUpTwo("");
    }
}
