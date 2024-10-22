import java.util.*;
class key {
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
try{
throw new ArrayIndexOutOfBoundsException("Index out of range");
}
catch(ArithmeticException e)
{
System.out.println("Denominator shouldnt be 0");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Index out of range");
}
System.out.println("Task is completed");
} 

}



