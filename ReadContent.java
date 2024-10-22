import java.util.*;
import javax.swing.*;
import java.awt.*;
class ReadContent
{
public static void main(String args[]) throws Exception
{
File fo = new File("abc.txt")
FileReader fr = new FileReader("abc.txt");

JFrame f1 = new JFrame();
JLabel l1 = new JLabel("Enter id:", JLabel.LEFT);
JTextField t1 = new JTextField ();
JButton b1 = new JButton("SUBMIT");

b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
try{
Scanner sc = new Scanner(fo);
Scanner sc1 = new Scanner(System.in);
sc1.close();
while (sc.hasNextLine()){
String record[] = sc.nextLine().split(",");
if(record[0].equals(id))
{
System.out.println(record[1]+":"+record[2]);
}
fw.close();
}
catch(Exception e){}
}
});



l1.setBounds(20,20,700,30);
t1.setBounds(20,70,200,30);
b1.setBounds(20,120,200,30);
f1.add(l1);
f1.add(t1);
f1.add(b1);
f1.setTitle("Get Info");
f1.setSize(500,500);
f1.setLayout(null);
f1.setVisible(true);

}
}
