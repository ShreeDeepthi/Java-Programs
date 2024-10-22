import javax.swing.*;
import java.awt.*;

class Tables
{
public static void main(String args[])
{
JFrame f=new JFrame("Mobile Application");
f.setSize(500,500);
String data[][] = {{"Rno","Name","Contact"},{"1","SRU","9999"},{"2","SRIX", "8888"},{"3" ,"SRIIT", "7777"}};
String columns[]= {"Rno","Name","Contact"};
JTable jt = new JTable(data,columns);
f.add(jt);
f.setLayout(new GridLayout(5,4,10,10));
f.setVisible(true);
}}