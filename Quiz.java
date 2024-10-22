import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Quiz
{
public static void main(String args[])
{
JFrame f=new JFrame("Java Quiz");
f.setSize(500,500);
JLabel q= new JLabel("Inheritance not supported in java ");
JRadioButton o1=new JRadioButton("Hybrid");
JRadioButton o2=new JRadioButton("Hierarchial"); 
JRadioButton o3=new JRadioButton("Multilevel");
JButton submit =new JButton("SUBMIT");
JLabel score = new JLabel();
 

ButtonGroup q1 = new ButtonGroup();
q1.add(o1);
q1.add(o2);
q1.add(o3);


q.setBounds(20,20,300,30);
o1.setBounds(20,70,300,30);
o2.setBounds(20,120,300,30);
o3.setBounds(20,170,300,30);



JLabel q2= new JLabel("Is String Mutable?");
JCheckBox o5=new JCheckBox("Yes ");
JCheckBox o6=new JCheckBox("No "); 
 


q2.setBounds(20,220,300,30);
o5.setBounds(20,270,300,30);
o6.setBounds(20,320,300,30);
submit.setBounds(20,370,300,30);
score.setBounds(20,420,300,30);

submit.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
int marks=0;
if(o1.isSelected() &&  o6.isSelected())
{
marks= 2;
}
else if (o1.isSelected())
{
marks = 1;
}
else if (o6.isSelected())
{
marks = 1;
}
else if (o5.isSelected() && o6.isSelected())
{
marks = 1;
}
else 
{
marks = 0;
}
score.setText("You got"+" "+marks+" "+"marks");
}
});


f.add(q);
f.add(o1);
f.add(o2);
f.add(o3);
f.add(q2);
f.add(o5);
f.add(o6);

f.add(submit);
f.add(score);

f.setLayout(null);
f.setVisible(true);
}}