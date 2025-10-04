package com.tnsif.day8.interfaces.implementing;

public class BankImp implements Bank {
	
 @Override
 public void deposit(Account account, double amount) {
	 if (amount > DEPOSIT_LIMIT)
			System.err.println("Deposit can't be done, it exceeds Deposit Limit. Deposit Limit is 25,000");
		else
			account.setBalance(account.getBalance()+amount);
     System.out.println("Deposited " + amount + " into account: " + account.getAccNo());
 }

 @Override
 public void withdraw(Account account, double amount) {
	 if (account.getBalance() - amount >= MIN_BALANCE)
	 {
			account.setBalance(account.getBalance()-amount);
			System.out.println("Withdrawn " + amount + " from account: " + account.getAccNo());
	 }
	 else
		 System.out.println("Insufficient balance in your account: " + account.getAccNo());
 }
}