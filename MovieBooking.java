class MovieBooking {
    public synchronized void bookTicket(int ticketno) {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
        System.out.println("Booked Ticket Number: " + ticketno);
    }
}

class AvaiSeats {
    public synchronized void viewAvailableSeats(int avaiseats) {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
        System.out.println("Available Seats: " + avaiseats);
    }
}

class CancelTicket {
    public synchronized void cancelTicket(int ticketcancel) {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
        System.out.println("Cancelled Ticket Number: " + ticketcancel);
    }
}

class Ticket extends Thread {
    int ticketno;
    MovieBooking t;

    Ticket(MovieBooking t, int ticketno) {
        this.ticketno = ticketno;
        this.t = t;
    }

    public void run() {
        t.bookTicket(ticketno);
    }
}

class Seats extends Thread {
    int avaiseats;
    AvaiSeats s;

    Seats(AvaiSeats s, int avaiseats) {
        this.avaiseats = avaiseats;
        this.s = s;
    }

    public void run() {
        s.viewAvailableSeats(avaiseats);
    }
}

class Cancel extends Thread {
    int ticketcancel;
    CancelTicket c;

    Cancel(CancelTicket c, int ticketcancel) {
        this.ticketcancel = ticketcancel;
        this.c = c;
    }

    public void run() {
        c.cancelTicket(ticketcancel);
    }
}

class Booking {
    public static void main(String[] args) {
        MovieBooking movieBooking = new MovieBooking();
        AvaiSeats availableSeats = new AvaiSeats();
        CancelTicket cancelTicket = new CancelTicket();

        Ticket t1 = new Ticket(movieBooking, 56);
        Ticket t2 = new Ticket(movieBooking, 56);
        Seats s1 = new Seats(availableSeats, 57);
        Seats s2 = new Seats(availableSeats, 123);
        Cancel c1 = new Cancel(cancelTicket, 56);
        Cancel c2 = new Cancel(cancelTicket, 56);

        t1.setName("Seat1: 56");
        t2.setName("Seat2: 56");
        s1.setName("Available seat: 57");
        s2.setName("Available seat: 57");
        c1.setName("Cancelled ticket: 56");
        c2.setName("Cancelled ticket: 56");

        t1.start();
        t2.start();
        s1.start();
        s2.start();
        c1.start();
        c2.start();
    }
}
