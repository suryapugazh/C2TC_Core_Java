package com.tnsif.day8.interfaces.implementing;

public class BankApplication {
	
 public static void main(String[] args) {
	 
     // Create a Bank instance
     Bank bank = new BankImp();

     // Create an Account
     Account account = new Account(1753, "Vignesh", 18490, bank);

     // Deposit money
     account.deposit(2000);
     System.out.println(account);
     
     // Withdraw money
     account.withdraw(10000);
     System.out.println(account);
 }
}