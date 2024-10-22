package oopj;
public class arithmetic 
{
public void addition(int x,int y)
{
System.out.println(x+y);
}
public void subtraction(int x,int y)
{
System.out.println(x-y);
}
public void multiplication(int x,int y)
{
System.out.println(x*y);
}
public void division(int x,int y)
{
System.out.println(x/y);
}

}
import oopj.arithmetic;
class main
{
public static void main(String args[])
{
arithmetic o = new arithmetic();
o.addition();
o.subtraction();
o.multiplication();
o.division();

}
}
