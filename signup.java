package ATM_services_portal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2;
    JButton next;
    JTextField textName ,textFname,textdob,textadd,textct,textpin,textEmail;
    Random ran = new Random();
    long first4 = (ran.nextLong()%9000L)+1000L;
    String first =""+Math.abs(first4);

    signup() {
        super("APPLICATION FORM" );

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICOn/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO. " + first4);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("RALEWAY", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel(" PAGE 1 ");
        label2.setBounds(330,70,600,38);
        label2.setFont(new Font("RALEWAY", Font.BOLD, 38));
        add(label2);

        JLabel label3 = new JLabel(" PERSONAL DETAILS   ");
        label3.setBounds(290,120,600,30);
        label3.setFont(new Font("RALEWAY", Font.BOLD, 22));
        add(label3);

        JLabel labelNAME = new JLabel("Name :- ");
        labelNAME.setBounds(100,190,100,30);
        labelNAME.setFont(new Font("RALEWAY", Font.BOLD, 20));
        add(labelNAME);

        textName = new JTextField();
        textName.setBounds(300,190,400,30);
        textName.setFont(new Font("RALEWAY", Font.BOLD, 20));
        add(textName);

        JLabel labelnName = new JLabel("Fathers Name :- ");
        labelnName.setBounds(100,240,200,30);
        labelnName.setFont(new Font("RALEWAY", Font.BOLD, 20));
        add(labelnName);

        textFname = new JTextField();
        textFname.setBounds(300,240,400,30);
        textFname.setFont(new Font("RALEWAY", Font.BOLD, 20));
        add(textFname);

        JLabel DOB = new JLabel("Date Of Birth  :- ");
        DOB.setBounds(100,300,200,30);
        DOB.setFont(new Font("RALEWAY", Font.BOLD, 20));
        add(DOB);

        textdob = new JTextField();
        textdob.setBounds(300,300,400,30);
        textdob.setForeground(new Color(105,105,105));
        add(textdob);

        JLabel labelG = new JLabel("Gender :- ");
        labelG.setBounds(100,390,200,30);
        labelG.setFont(new Font("RALEWAY", Font.BOLD, 20));
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setBounds(300,390,100,30);
        r1.setFont(new Font("RALEWAY", Font.BOLD, 15));
        r1.setBackground(new Color(222,255,228));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(450,390,100,30);
        r2.setFont(new Font("RALEWAY", Font.BOLD, 15));
        r2.setBackground(new Color(222,255,228));
        add(r2);

        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(r1);
        buttongroup.add(r2);

        JLabel labelmarr = new JLabel("Marriage status  :- ");
        labelmarr.setBounds(100,470,200,30);
        labelmarr.setFont(new Font("RALEWAY", Font.BOLD, 20));
        add(labelmarr);

        m1 = new JRadioButton("Married");
        m1.setBounds(300,470,100,30);
        m1.setFont(new Font("RALEWAY", Font.BOLD, 15));
        m1.setBackground(new Color(222,255,228));
        add(m1);

        m2 = new JRadioButton("Not Married");
        m2.setBounds(450,470,200,30);
        m2.setFont(new Font("RALEWAY", Font.BOLD, 15));
        m2.setBackground(new Color(222,255,228));
        add(m2);

        ButtonGroup buttongroup1 = new ButtonGroup();
        buttongroup1.add(m1);
        buttongroup1.add(m2);

        JLabel labeladd = new JLabel("Address  :- ");
        labeladd.setBounds(100,530,200,30);
        labeladd.setFont(new Font("RALEWAY", Font.BOLD, 20));
        add(labeladd);

        textadd = new JTextField();
        textadd.setBounds(300,530,400,30);
        textadd.setFont(new Font("RALEWAY", Font.BOLD, 20));
        add(textadd);

        JLabel labelcity = new JLabel("City  :- ");
        labelcity.setBounds(100,580,200,30);
        labelcity.setFont(new Font("RALEWAY", Font.BOLD, 20));
        add(labelcity);

        textct = new JTextField();
        textct.setBounds(300,580,400,30);
        textct.setFont(new Font("RALEWAY", Font.BOLD, 20));
        add(textct);

        JLabel labelpin = new JLabel("Pin Code  :- ");
        labelpin.setBounds(100,630,200,30);
        labelpin.setFont(new Font("RALEWAY", Font.BOLD, 20));
        add(labelpin);

        textpin = new JTextField();
        textpin.setBounds(300,630,400,30);
        textpin.setFont(new Font("RALEWAY", Font.BOLD, 20));
        add(textpin);

        JLabel labelemail = new JLabel("E-MAIL id :- ");
        labelemail.setBounds(100,680,200,30);
        labelemail.setFont(new Font("RALEWAY", Font.BOLD, 20));
        add(labelemail);

        textEmail = new JTextField();
        textEmail.setBounds(300,680,400,30);
        textEmail.setFont(new Font("RALEWAY", Font.BOLD, 20));
        add(textEmail);

        next = new JButton("Next");
        next.setBounds(630,720,100,30);
        next.setFont(new Font("RALEWAY", Font.BOLD, 15));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = textdob.getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if(r2.isSelected()){
            gender = "Female";
        }

        String maritalStatus = null;
        if(m1.isSelected()){
            maritalStatus = "Married";
        }else if(m2.isSelected()){
            maritalStatus = "Not Married";
        }
        String address = textadd.getText();
        String city = textpin.getText();
        String pincode = textpin.getText();
        String email = textEmail.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter your name");
            }else{
                con con1 = new con();
                String q = "insert into signup values('"+formno+"',' "+name+"',' "+fname+"',' "+dob+"',' "+gender+ "', ' "+maritalStatus+ "', ' "+address+ "', ' "+city+ "', ' "+pincode+ "',' "+email+ "')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new signup();
    }
}