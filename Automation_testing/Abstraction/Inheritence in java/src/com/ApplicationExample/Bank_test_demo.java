package com.ApplicationExample;

 class Bank {
	String accountHolder="Harshit Chaudhary";
	double balance= 1000000;
	public void deposit(double amount) {
		balance= balance+amount;
		System.out.println("Amount Deposited:" + amount);
	}
	public void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("Amount Withdrawn:" + amount);
	} 
	public void DisplayBalance() {
		System.out.println("Current Balance:" + balance);

	}

}
class SavingsAccount extends Bank{
	public void calculateInterest() {
		double interest = balance * 5 /100;
		System.out.println("Interest earned:" + interest);
	}
	
} 
 public class Bank_test_demo {
	 public static void main(String[] args) {
		 SavingsAccount sa = new SavingsAccount();
		 System.out.println("Account Holder:" + sa.accountHolder);
		 sa.deposit(5000);
	     sa.withdraw(2000);
		 sa.DisplayBalance();
		 sa.calculateInterest();
	 }
	 
 }
