class Operation
{
int number;
int status=0;
public synchronized void generateNumber()
{
while(status!=0)
{
try{wait();}
catch(Exception e){}
}
this.number=(int)(Math.random()*100);
System.out.println("T1 generated"+ this.number);
if(this.number%2==0)
{
this.status=1;
}
else{
this.status=2;
}
notifyAll();
}
public synchronized void square()
{
while(this.status!=1)
{
try{wait();}
catch(Exception e){}
}
System.out.println("T2 square:"+this.number*this.number);
this.status=0;
notifyAll();
}
public synchronized void cube()
{
while(this.status!=2)
{
try{wait();}
catch(Exception e){}
}
System.out.println("T3 cube:"+ this.number*this.number*this.number);
this.status=0;
notifyAll();
}
}
class GenerateNumber extends Thread
{
Operation o;
GenerateNumber(Operation o)
{
this.o=o;
}
public void run()
{
while(true)
{
o.generateNumber();
try{Thread.sleep(1000);}
catch(Exception e){}
}}}
class SquareNumber extends Thread
{
Operation o;
SquareNumber(Operation o)
{
this.o=o;
}
public void run()
{
while(true)
{
o.square();
try{Thread.sleep(1000);}
catch(Exception e){}
}}}
class CubeNumber extends Thread
{
Operation o;
CubeNumber(Operation o)
{
this.o=o;
}
public void run()
{
while(true)
{
o.cube();
try{Thread.sleep(1000);}
catch(Exception e){}
}}}
class Calculator
{
public static void main(String args[])
{
Operation o = new Operation();
GenerateNumber t1 = new GenerateNumber(o);
SquareNumber t2 = new SquareNumber(o);
CubeNumber t3 = new CubeNumber(o);
t1.start();
t2.start();
t3.start();
}}