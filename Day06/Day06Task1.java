package JAVA;

//Extend Thread class to print numbers 1 to 10
class Day06Task1 extends Thread {
 public void run() {
     for (int i = 1; i <= 10; i++) {
         System.out.println(i);
         try {
             Thread.sleep(500); // half-second delay for smooth output
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }
 }

 public static void main(String[] args) {
     Day06Task1 t1 = new Day06Task1(); // create thread object
     t1.start(); // start the thread
 }
}