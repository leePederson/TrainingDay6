package Day6;

import lombok.Getter;
import lombok.Setter;

public class synchronise {
	public static void main(String[] args) {
		ThreadEx1 bankObj1 = new ThreadEx1();
		Thread bank1 = new Thread(bankObj1);
		bank1.start();
		
		Thread bank2 = new Thread(bankObj1);
		bank2.start();
	}


}

class ThreadEx1 implements Runnable{
	
	BankService bs = new BankService();
	@Override
	public void run() {
		bs.withdraw(550);
		
	}
	
}

class ThreadEx2 implements Runnable{
	
	BankService bs = new BankService();
	@Override
	public void run() {
		bs.withdraw(500);
		
	}
	
}

class BankService{
	Bank b = new Bank();
	
	public synchronized void withdraw(int amount) {
		int bal = b.getBalance();
		if(bal-amount < 0) {
			System.out.println("Overdraft detected, withdraw declined.");
			return;
		}else {
			int remaining = bal-amount;
			System.out.println("Balance deducted..."+amount);
			b.setBalance(remaining);
			System.out.println("Remaining balance..."+b.getBalance());
		}
	}
}

@Setter
@Getter
class Bank {
	@Setter @Getter
	private Long acNum;
	@Setter @Getter
	private int balance = 1000;
	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	public void setBalance(int remaining) {
		balance = remaining;
		
	}
}