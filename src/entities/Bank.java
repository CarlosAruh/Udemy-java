package entities;

public class Bank {
	private int number;
	private String holder;
	private double balance;


	public Bank(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Bank(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit (double amount) {
		this.balance += amount;
	}
	
	public void whithdraw (double amount) {
		this.balance -= amount + 5.00;
	}
	
	public String toString() {
		return "Accont " + number + ", Holder: " + holder + ", Balance: $ " + String.format ("%.2f%n",getBalance());
	}
}