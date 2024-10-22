import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class studentinfo
{
public static void main(String args[])throws IOException
{
File fo = new File("sinfo.txt");
fo.createNewFile();

JFrame f1 = new JFrame();
JLabel l1 = new JLabel("Enter HallTicket:");

JTextField t1 = new JTextField();
JLabel l2 = new JLabel("Enter Name:");

JTextField t2 = new JTextField();
JLabel l3 = new JLabel("Enter Contact:");

JTextField t3 = new JTextField();
JButton b1 = new JButton("SAVE");
l1.setBounds(20,20,300,30);
l2.setBounds(20,70,300,30);
l3.setBounds(20,120,300,30);
t1.setBounds(150,20,300,30);
t2.setBounds(150,70,300,30);
t3.setBounds(150,120,300,30);
b1.setBounds(200,170,200,30);

b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
try{
FileWriter fw = new FileWriter("sinfo.txt",true);
//fw.write(t1.getText());
//fw.write(t2.getText());
//fw.write(t3.getText());
fw.write(t1.getText()+" "+t2.getText()+" "+t3.getText()+" "+"\n");
fw.close();
JOptionPane.showMessageDialog(f1,"Record Inserted successfully.");
}
catch(Exception e){}
}
});

f1.add(l1);
f1.add(l2);
f1.add(l3);
f1.add(t1);
f1.add(t2);
f1.add(t3);
f1.add(b1);
f1.setTitle("Student Info");
f1.setSize(500,500);
f1.setLayout(null);
f1.setVisible(true);
}
}






