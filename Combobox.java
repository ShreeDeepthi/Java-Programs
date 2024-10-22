import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Combobox
{
public static void main(String args[])
{
JFrame f=new JFrame("States");
f.setSize(500,500);
String States[] = {"TG" , "AP" , "UP" , "TN"};
JComboBox j1 = new JComboBox(States);
f.add(j1);

f.setLayout(new GridLayout());
f.setVisible(true);
}}
