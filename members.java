import java.util.Scanner;
class members 
{
public static void main(String args[])
{
Scanner SC = new Scanner(System.in);
int N = SC.nextInt();
int counter = 1;
while(counter<=N)
{
if (counter>40)
{
break;
}
System.out.println("mr"+counter + "please join the class");
counter++;
}
}
}