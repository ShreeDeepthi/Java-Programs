import javax.swing.*;
import java.awt.*;

class GridDemo
{
public static void main(String args[])
{
JFrame f=new JFrame("Mobile Application");
f.setSize(500,500);
JButton j1 = new JButton("Instagram");
JButton j2 = new JButton("WhatsApp");
JButton j3 = new JButton("Linkedin");
JButton j4 = new JButton("Contacts");
JButton j5 = new JButton("Spotify");
JButton j6 = new JButton("FaceBook");
JButton j7 = new JButton("Gallery");
JButton j8 = new JButton("Note");
JButton j9 = new JButton("Youtube");


f.add(j1);
f.add(j2);
f.add(j3);
f.add(j4);
f.add(j5);
f.add(j6);
f.add(j7);
f.add(j8);
f.add(j9);


f.setLayout(new GridLayout(3,3,10,10));
f.setVisible(true);
}}




