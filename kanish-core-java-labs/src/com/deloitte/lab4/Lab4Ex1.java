package com.deloitte.lab4;

class Person {
	private String name;
	private float age;

	Person(String name, float age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

}

class Account {
	private static long accountNumberGenerator = 100000;
	private long accNum;
	private double balance;
	private Person accountHolder;

	public Account(Person accountHolder, double initialBalance) {
		this.accNum = accountNumberGenerator++;
		this.balance = initialBalance;
		this.accountHolder = accountHolder;
	}

	public long getAccNum() {
		return accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(Person accountHolder) {
		this.accountHolder = accountHolder;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited INR " + amount + " to account " + accNum);
		}
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println("Deposited INR " + amount + " to account " + accNum);
			return true;
		}
		System.out.println("Withdrawal denied: Insufficient funds.");
		return false;
	}
}

class SavingsAccount extends Account {
	private final double minimumBalance;

	public SavingsAccount(Person accountHolder, double initialBalance, double minimumBalance) {
		super(accountHolder, initialBalance);
		this.minimumBalance = minimumBalance;
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0 && (getBalance() - amount) >= minimumBalance) {
			setBalance(getBalance() - amount);
			System.out.println("Withdrew INR " + amount + " from Savings Account " + getAccNum());
			return true;
		}
		System.out.println("Withdrawal denied: Minimum balance must be maintained.");
		return false;
	}
}

class CurrentAccount extends Account {
	private double overdraftLimit;

	public CurrentAccount(Person accountHolder, double initialBalance, double overdraftLimit) {
		super(accountHolder, initialBalance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
			if (getBalance() >= amount) {
				setBalance(getBalance() - amount);
			} else {
				double remainingAmount = amount - getBalance();
				overdraftLimit -= remainingAmount;
				setBalance(0);
			}
			System.out.println("Withdrew INR " + amount + " from Current Account " +  getAccNum());
            return true;

		}
		System.out.println("Withdrawal denied: Overdraft limit exceeded.");
		return false;

	}

	
}                                                                 
public class Lab4Ex1 {

	public static void main(String[] main) {
		Person smith = new Person("sunil", 30);
		Person kathy = new Person("shilpa", 25);

		SavingsAccount smithAccount = new SavingsAccount(smith, 2000, 500);
		CurrentAccount kathyAccount = new CurrentAccount(kathy, 3000, 1000);

		smithAccount.deposit(2000);
		kathyAccount.withdraw(2000);

		System.out.println("Smith's account balance: " + smithAccount.getBalance());
		System.out.println("Kathy's account balance: " + kathyAccount.getBalance());

	}

}
