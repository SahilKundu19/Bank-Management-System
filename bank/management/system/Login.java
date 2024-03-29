package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener{

    JButton login, clear, signup;
    JTextField cardtext;
    JPasswordField pintext;
    Login() {
        setTitle("ATM");

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Times New Roman", Font.BOLD, 38));
        text.setBounds(210,40,400,40);
        add(text);

        JLabel cardno = new JLabel("Card No.: ");
        cardno.setFont(new Font("Rale way", Font.BOLD, 25));
        cardno.setBounds(120,150,150,30);
        add(cardno);

        cardtext = new JTextField();
        cardtext.setBounds(300,150,230,30);
        cardtext.setBorder(BorderFactory.createLineBorder(Color.black));
        add(cardtext);

        JLabel pin = new JLabel("PIN: ");
        pin.setFont(new Font("Rale way", Font.BOLD, 25));
        pin.setBounds(120,220,250,30);
        add(pin);

        pintext = new JPasswordField();
        pintext.setBounds(300,220,230,30);
        pintext.setBorder(BorderFactory.createLineBorder(Color.black));
        add(pintext);

        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setFont(new Font("Arial", Font.BOLD, 14));
        login.setBackground(Color.WHITE);
        login.setForeground(Color.BLACK);
        login.addActionListener(this);
        login.setBorder(BorderFactory.createLineBorder(Color.black));
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setFont(new Font("Arial", Font.BOLD, 14));
        clear.setBackground(Color.WHITE);
        clear.setForeground(Color.BLACK);
        clear.addActionListener(this);
        clear.setBorder(BorderFactory.createLineBorder(Color.black));
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setFont(new Font("Arial", Font.BOLD, 14));
        signup.setBackground(Color.WHITE);
        signup.setForeground(Color.BLACK);
        signup.addActionListener(this);
        signup.setBorder(BorderFactory.createLineBorder(Color.black));
        add(signup);

        getContentPane().setBackground(Color.WHITE);

        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == clear) {
            cardtext.setText("");
            pintext.setText("");
        }
        else if(ae.getSource() == login) {
            Conn conn = new Conn();
            String cardnumber = cardtext.getText();
            String pinnumber = pintext.getText();

            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"' ";

            try {
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()) {
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else if (ae.getSource() == signup) {
            setVisible(false);
            new SignUpOne().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}

