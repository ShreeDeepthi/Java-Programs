class MovieBooking
{
public synchronized void bookTicket(int ticketno)
{
for(int i=1;i<=5;i++)
{
try
{
Thread.sleep(1000);
}
catch(Exception e)
{}
System.out.println(Thread.currentThread().getName());}
System.out.println(ticketno);
}}
class AvaiSeats
{
public synchronized void viewAvailableSeats(int avaiseats)
{
for(int i=1;i<=5;i++)
{
try
{
Thread.sleep(1000);
}
catch(Exception e)
{}
System.out.println(Thread.currentThread().getName());
}
System.out.println(avaiseats);
}}
class CancelTicket
{
public synchronized void cancelTicket(int ticketcancel)
{
for(int i=1;i<=5;i++)
{
try
{
Thread.sleep(1000);
}
catch(Exception e)
{}
System.out.println(Thread.currentThread().getName());
}
System.out.println(ticketcancel);}}
class Ticket extends Thread
{
int ticketno;
TicketBooking t;
Ticket(TicketBooking t , int ticketno)
{
this.ticketno=ticketno;
this.t=t;
}
public void run()
{
t.bookTicket(ticketno);
}
}
class Seats extends Thread
{
int avaiseats;
AvaiSeats s;
Seats(AvaiSeats s,int avaiseats)
{
this.avaiseats=avaiseats;
this.s=s;
}
public void run()
{
s.viewAvailableSeats(avaiseats);
}
}
class Cancel extends Thread
{
int ticketcancel; 
CancelTicket c;
Cancel(CancelTicket c,int ticketcancel)
{
this.ticketcancel=ticketcancel;
this.c=c;
}
public void run()
{
c.cancelTicket(ticketcancel);
}
}

class MovieTickets
{
public static void main(String args[])
{
TicketBooking Titanic= new TicketBooking();
Ticket t1=new Ticket(Titanic,56);
Ticket t2=new Ticket(Titanic,56);
Ticket t3=new Ticket(Titanic,12);
Ticket t4=new Ticket(Titanic,12);
Ticket t5=new Ticket(Titanic,56);
Ticket t6=new Ticket(Titanic,56);
t1.setName("Seat1:56");
t2.setName("Seat2:56" );
t3.setName("Available seat:12");
t4.setName("Available seat:12");
t5.setName("Cancelled ticket:56");
t6.setName("Cancelled ticket:56");
t1.start();
t2.start();
t3.start();
t4.start();
t5.start();
t6.start();
}
}