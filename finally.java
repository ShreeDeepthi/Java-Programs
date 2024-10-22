import java.util.*;
class final{
public static void main(String args [])
{
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
try{
System.out.println(x/y);
}
catch(ArithmeticException e)
{
System.out.println("Denominator shouldnt be 0");
}
finally
{
sc.close();
System.out.println("I am finally i can execute always ");
}
}
}