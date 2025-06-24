package JAVA;
//Bank account class with deposit/withdraw methods
class Day03Task1 {
	double balance = 1000;
	void deposit(double amt) {
		balance += amt;
		System.out.println("Deposited : $" + amt);
		}
	void withdraw(double amt) {
		if (amt <= balance) {
			balance -= amt;
			System.out.println("withdrawn : $" + amt);
			}else{
				System.out.println("not enough balance :");
				}
			}
	void show() {
		System.out.println("Balance : $" + balance);
	}
	public static void main(String[] args) {
		 Day03Task1 acc = new Day03Task1();
			acc.deposit(500);
			acc.withdraw(300);
			acc.show();
		}
	}


