interface MenuCard
{
void apple();
int apcost=120;
void mango();
int macost=100;
}
class amazonfresh implements MenuCard
{
void apple()
{
System.out.println("I am apple - my cost is"+apcost);
}
void mango()
{
System.out.println("I am mango - my cost is"+macost);
}
}
class bigbasket
{
public static void main(String args[])
{
bigbasket o = new bigbasket();
o.apple();
}
}

