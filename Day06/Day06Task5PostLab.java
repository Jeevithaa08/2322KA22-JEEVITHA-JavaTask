package JAVA;

//Mini Project: Banking App using Multithreading

//Bank class with balance and synchronized withdraw method
class Bank {
 private int balance = 1000; // initial balance

 // synchronized to prevent overdrawing
 public synchronized void withdraw(String name, int amount) {
     if (amount <= balance) {
         System.out.println(name + " is withdrawing " + amount);
         balance -= amount; // deduct amount
         System.out.println("Balance left: " + balance);
     } else {
         System.out.println(name + " tried to withdraw " + amount + " — Not enough balance!");
     }
 }
}

//BankUser class represents a user thread
class BankUser extends Thread {
 Bank bank;
 int amount;

 // constructor to set bank, amount, name
 BankUser(Bank bank, int amount, String name) {
     this.bank = bank;
     this.amount = amount;
     setName(name);
 }

 public void run() {
     // call withdraw for this user
     bank.withdraw(getName(), amount);
 }
}

public class Day06Task5PostLab {
 public static void main(String[] args) {
     Bank bank = new Bank(); // create bank object

     // create 3 user threads
     BankUser u1 = new BankUser(bank, 500, "Vaishnavi");
     BankUser u2 = new BankUser(bank, 400, "Swetha");
     BankUser u3 = new BankUser(bank, 300, "Varsha");

     // start threads
     u1.start();
     u2.start();
     u3.start();
 }
}
