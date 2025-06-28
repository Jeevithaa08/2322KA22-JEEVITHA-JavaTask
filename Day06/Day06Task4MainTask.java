package JAVA;

//Day06Task4.java
//Task: Simulate ticket booking using multiple threads

//Thread class for booking
class TicketBooking extends Thread {
 static int tickets = 5; // total available tickets
 static Object lock = new Object(); // common lock object

 public void run() {
     // Synchronized block to avoid race condition
     synchronized (lock) {
         if (tickets > 0) {
             System.out.println(Thread.currentThread().getName() + " booked 1 ticket.");
             tickets--;
             System.out.println("Tickets left: " + tickets);
         } else {
             System.out.println("No tickets left for " + Thread.currentThread().getName());
         }
     }
 }
}

public class Day06Task4MainTask {
 public static void main(String[] args) {
     // Create 6 user threads trying to book 5 tickets
     for (int i = 1; i <= 6; i++) {
         TicketBooking user = new TicketBooking();
         user.setName("User-" + i);
         user.start(); // start each thread
     }
 }
}
