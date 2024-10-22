import javax.swing.*;
import java.awt.*;
class Login
{
public static void main(String args[])
{
JFrame f1 = new JFrame();
JLabel l1 = new JLabel("Welcome to SRU Login", JLabel.CENTER);
l1.setForeground(Color.BLUE);
l1.setFont(new Font("Algerian",Font.BOLD,30));
JLabel l2 = new JLabel("UserName:", JLabel.LEFT);
l2.setForeground(Color.BLUE);
l2.setFont(new Font("Algerian",Font.BOLD,10));
JTextField t1 = new JTextField ();
JLabel l3 = new JLabel("Password:", JLabel.LEFT);
l3.setForeground(Color.BLUE);
l3.setFont(new Font("Algerian",Font.BOLD,10));
JPasswordField p1 = new JPasswordField();
JButton b1 = new JButton("LOGIN");
JButton b2 = new JButton("FORGOT PASSWORD");
l1.setBounds(20,20,700,30);
l2.setBounds(20,70,200,30);
l3.setBounds(20,120,200,30);
t1.setBounds(250,70,200,30);
p1.setBounds(250,120,200,30);
b1.setBounds(250,170,200,30);
b2.setBounds(470,170,200,30);
f1.add(l1);
f1.add(l2);
f1.add(l3);
f1.add(t1);
f1.add(p1);
f1.add(b1);
f1.add(b2);
f1.setTitle("Login Page");
f1.setSize(500,500);
f1.setLayout(null);
f1.setVisible(true);
System.out.println("Frame Object Created");
}
}
