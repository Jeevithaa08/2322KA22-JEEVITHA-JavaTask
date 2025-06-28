package JAVA;

//Day06Task2.java

class MyRunnable implements Runnable {
 public void run() {
     System.out.println("Hello from: " + Thread.currentThread().getName());
 }
}

public class Day06Task2 {
 public static void main(String[] args) {
     Thread t1 = new Thread(new MyRunnable(), "Thread-A");
     Thread t2 = new Thread(new MyRunnable(), "Thread-B");

     t1.start();
     t2.start();
 }
}