package JAVA;

//Task: Demonstrate sleep() and join()

//Create custom thread class
class SleepJoinDemo extends Thread {
 public void run() {
     // Loop from 1 to 3
     for (int i = 1; i <= 3; i++) {
         System.out.println(Thread.currentThread().getName() + " - " + i);
         try {
             // Pause for 500 milliseconds
             Thread.sleep(500);
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }
 }
}

public class Day06Task3 {
 public static void main(String[] args) {
     // Create two threads
     SleepJoinDemo t1 = new SleepJoinDemo();
     SleepJoinDemo t2 = new SleepJoinDemo();

     // Name the threads
     t1.setName("Thread-1");
     t2.setName("Thread-2");

     // Start first thread
     t1.start();

     try {
         // Wait for t1 to finish before starting t2
         t1.join();
     } catch (InterruptedException e) {
         System.out.println(e);
     }

     // Start second thread after t1 is done
     t2.start();
 }
}
