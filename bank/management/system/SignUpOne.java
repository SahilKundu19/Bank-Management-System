package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpOne extends JFrame implements ActionListener{

    long random;
    JTextField nametext, fnametext, emailtext, addresstext, citytext, statetext, pincodetext, phnotext;
    JButton next;
    JRadioButton mr, mrs, dr, miss, male, female, married, unmarried;
    JDateChooser dateChooser;

    SignUpOne() {

        setLayout(null);

        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO.: " + random);
        formno.setFont(new Font("Times New Roman", Font.BOLD, 35));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 01: Personal Details");
        personalDetails.setFont(new Font("Rale way", Font.BOLD, 22));
        personalDetails.setBounds(290,60,400,30);
        add(personalDetails);

        JLabel title = new JLabel("Title: ");
        title.setFont(new Font("Times New Roman", Font.BOLD, 20));
        title.setBounds(100,140,100,30);
        add(title);

        mr = new JRadioButton("Mr.");
        mr.setBounds(300,140,70,30);
        mr.setBackground(Color.WHITE);
        add(mr);

        mrs = new JRadioButton("Mrs.");
        mrs.setBounds(400,140,70,30);
        mrs.setBackground(Color.WHITE);
        add(mrs);

        dr = new JRadioButton("Dr.");
        dr.setBounds(500,140,70,30);
        dr.setBackground(Color.WHITE);
        add(dr);

        miss = new JRadioButton("Miss");
        miss.setBounds(600,140,70,30);
        miss.setBackground(Color.WHITE);
        add(miss);

        ButtonGroup titlegroup = new ButtonGroup();
        titlegroup.add(mr);
        titlegroup.add(mrs);
        titlegroup.add(dr);
        titlegroup.add(miss);

        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Times New Roman", Font.BOLD, 20));
        name.setBounds(100,190,100,30);
        add(name);

        nametext = new JTextField();
        nametext.setFont(new Font("Rale way", Font.BOLD, 14));
        nametext.setBounds(300,190,400,30);
        nametext.setBorder(BorderFactory.createLineBorder(Color.black));
        add(nametext);

        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        fname.setBounds(100,240,200,30);
        add(fname);

        fnametext = new JTextField();
        fnametext.setFont(new Font("Rale way", Font.BOLD, 14));
        fnametext.setBounds(300,240,400,30);
        fnametext.setBorder(BorderFactory.createLineBorder(Color.black));
        add(fnametext);

        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Times New Roman", Font.BOLD, 20));
        dob.setBounds(100,290,200,30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,290,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Times New Roman", Font.BOLD, 20));
        gender.setBounds(100,340,200,30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300,340,100,30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450,340,120,30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Times New Roman", Font.BOLD, 20));
        email.setBounds(100,390,200,30);
        add(email);

        emailtext = new JTextField();
        emailtext.setFont(new Font("Rale way", Font.BOLD, 14));
        emailtext.setBounds(300,390,400,30);
        emailtext.setBorder(BorderFactory.createLineBorder(Color.black));
        add(emailtext);

        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Times New Roman", Font.BOLD, 20));
        marital.setBounds(100,440,200,30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(300,440,100,30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,440,120,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);

        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Times New Roman", Font.BOLD, 20));
        address.setBounds(100,490,200,30);
        add(address);

        addresstext = new JTextField();
        addresstext.setFont(new Font("Rale way", Font.BOLD, 14));
        addresstext.setBounds(300,490,400,30);
        addresstext.setBorder(BorderFactory.createLineBorder(Color.black));
        add(addresstext);

        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Times New Roman", Font.BOLD, 20));
        city.setBounds(100,540,200,30);
        add(city);

        citytext = new JTextField();
        citytext.setFont(new Font("Rale way", Font.BOLD, 14));
        citytext.setBounds(300,540,400,30);
        citytext.setBorder(BorderFactory.createLineBorder(Color.black));
        add(citytext);

        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Times New Roman", Font.BOLD, 20));
        state.setBounds(100,590,200,30);
        add(state);

        statetext = new JTextField();
        statetext.setFont(new Font("Rale way", Font.BOLD, 14));
        statetext.setBounds(300,590,400,30);
        statetext.setBorder(BorderFactory.createLineBorder(Color.black));
        add(statetext);

        JLabel pincode = new JLabel("Pincode: ");
        pincode.setFont(new Font("Times New Roman", Font.BOLD, 20));
        pincode.setBounds(100,640,200,30);
        add(pincode);

        pincodetext = new JTextField();
        pincodetext.setFont(new Font("Rale way", Font.BOLD, 14));
        pincodetext.setBounds(300,640,400,30);
        pincodetext.setBorder(BorderFactory.createLineBorder(Color.black));
        add(pincodetext);

        JLabel phno = new JLabel("Mobile No.: ");
        phno.setFont(new Font("Times New Roman", Font.BOLD, 20));
        phno.setBounds(100,690,200,30);
        add(phno);

        phnotext = new JTextField();
        phnotext.setFont(new Font("Rale way", Font.BOLD, 14));
        phnotext.setBounds(300,690,400,30);
        phnotext.setBorder(BorderFactory.createLineBorder(Color.black));
        add(phnotext);

        next = new JButton("Next");
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("Rale way", Font.BOLD,14));
        next.setBounds(620,750,100,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850,850);
        setVisible(true);
        setLocation(350,10);
    }

    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;

        String title = null;
        if(mr.isSelected()) {
            title = "Mr.";
        } else if(mrs.isSelected()) {
            title = "Mrs.";
        } else if(dr.isSelected()) {
            title = "Dr.";
        } else if(miss.isSelected()) {
            title = "Miss";
        }

        String name = nametext.getText();

        String fname = fnametext.getText();

        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        String gender = null;
        if(male.isSelected()) {
            gender = "Male";
        } else if(female.isSelected()) {
            gender = "Female";
        }

        String email = emailtext.getText();

        String marital = null;
        if(married.isSelected()) {
            marital = "Married";
        } else if(unmarried.isSelected()) {
            marital = "Unmarried";
        }

        String address = addresstext.getText();

        String city = citytext.getText();

        String state = statetext.getText();

        String pincode = pincodetext.getText();

        String phoneno = phnotext.getText();

        try {
            if(name.equals("")) {
                JOptionPane.showMessageDialog(null,"Name is Required");
            }
            else if(fname.equals("")) {
                JOptionPane.showMessageDialog(null,"Father's Name is required");
            }
            else if(dob.equals("")) {
                JOptionPane.showMessageDialog(null,"Date of Birth is required");
            }
            else if(gender.equals("")) {
                JOptionPane.showMessageDialog(null,"Gender is required");
            }
            else if(address.equals("")) {
                JOptionPane.showMessageDialog(null,"Address is required");
            }
            else if(city.equals("")) {
                JOptionPane.showMessageDialog(null,"City is required");
            }
            else if(state.equals("")) {
                JOptionPane.showMessageDialog(null,"State is required");
            }
            else if(pincode.equals("")) {
                JOptionPane.showMessageDialog(null,"Pin code is required");
            }
            else if(phoneno.equals("")) {
                JOptionPane.showMessageDialog(null,"Mobile Number is required");
            }
            else {
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"', '"+title+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+marital+"', '"+email+"', '"+phoneno+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignUpTwo(formno).setVisible(true);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new SignUpOne();
    }
}
