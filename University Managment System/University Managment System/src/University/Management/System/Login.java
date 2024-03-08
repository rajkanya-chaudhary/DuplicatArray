package University.Management.System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login  extends JFrame implements ActionListener {
    JTextField textFieldName;
    JPasswordField passwordField;

    JButton Login,Back;
    Login()
    {
        JLabel labelName = new JLabel("Username ");
        labelName.setBounds(40,20,100,20);
        add(labelName);
        textFieldName = new JTextField();
        textFieldName.setBounds(150,20,120,20);
        add(textFieldName);

        JLabel labelpass = new JLabel("Password");
        labelpass.setBounds(40,70,100,20);
        add(labelpass);

        passwordField = new JPasswordField();
        passwordField.setBounds(150,70,150,20);
        add(passwordField);

        Login = new JButton("Login");
        Login.setBounds(40,140,120,38);
        Login.setBackground(Color.black);
        Login.setForeground(Color.white);
        Login.addActionListener(this);
        add(Login);


        Back = new JButton("Back");
        Back.setBounds(188,140,120,38);
        Back.setBackground(Color.black);
        Back.setForeground(Color.white);
        Back.addActionListener(this);
        add(Back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Account1.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(350,20,200,200);
        add(img);


        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/back.webp"));
        Image i22 = i11.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel image = new JLabel(i33);
        image.setBounds(0,0,600,300);
        add(image);




        setSize(600,300);
        setLocation(500,250);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == Login)
        {
           String username = textFieldName.getText();
           String password = passwordField.getText();
           String query = "select * from Login where username='"+username+"'and password = '"+password+"'";
           try {
               Conn c = new Conn();
               ResultSet resultSet = c.statement.executeQuery(query);
               if(resultSet.next())
               {
                   setVisible(false);
                   new Main_Class();
               }
               else
               {
                   JOptionPane.showConfirmDialog(null,"Invalid username or password");
               }


           }catch (Exception E)
           {
              E.printStackTrace();
           }
        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
