class Bank
{
public synchronized void withdraw(int accno)
{
for(int i = 1; i<=10;i++)
{
System.out.println(Thread.currentThread().getName());}
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(accno);
}
}
}

class MyATM extends Thread
{
int accno;
Bank o;
MyATM(Bank o,int accno)
{
this.accno = accno;
this.o = o;
}
public void run()
{
 o.withdraw(accno);
}
}
class Main
{
public static void main(String args[])
{
Bank sbi = new Bank();
MyATM t1 = new MyATM(sbi,1234);
MyATM t2 = new MyATM(sbi,1234);
t1.setName("HUSBAND:1234");
t2.setName("WIFE:1234");
t1.start();
t2.start();
}
}

