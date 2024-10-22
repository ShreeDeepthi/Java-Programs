import javax.swing.*;
import java.awt.*;
class GUIDemo
{
public static void main(String args[])
{
JFrame f1=new JFrame();
JLabel L1=new JLabel("Name : Deepthi",JLabel.CENTER);
JLabel L2=new JLabel("Roll no : 2303",JLabel.CENTER);  
JLabel L3=new JLabel("Department : Cse",JLabel.CENTER);
JLabel L4=new JLabel("contact : 9063804588",JLabel.CENTER);
JLabel L5=new JLabel("Address : Walmart",JLabel.CENTER);
L1.setForeground(Color.RED);
L2.setForeground(Color.GREEN);
L3.setForeground(Color.BLUE);
L4.setForeground(Color.BLACK);
L5.setForeground(Color.PINK);
L1.setFont(new Font("Algerian",Font.BOLD,30));
L2.setFont(new Font("Algerian",Font.BOLD,30));
L3.setFont(new Font("Algerian",Font.BOLD,30));
L4.setFont(new Font("Algerian",Font.BOLD,30));
L5.setFont(new Font("Algerian",Font.BOLD,30));
L1.setBounds(20,20,400,100);
L2.setBounds(20,70,400,100);
L3.setBounds(20,120,400,100);
L4.setBounds(20,170,400,100);
L5.setBounds(20,220,400,100);
f1.add(L1);
f1.add(L2);
f1.add(L3);
f1.add(L4);
f1.add(L5);
f1.setTitle("Details");
f1.setSize(500,500);
f1.setLayout(null);
f1.setVisible(true);
System.out.println("Frame object created");
}
}