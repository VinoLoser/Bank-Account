package com;

public class Account {
    private int accountBalance;
    private String FirstName;
    private String LastName;
    
    public Account(int balance, String aFirstName, String aLastName) {
        this.accountBalance = balance;
        this.FirstName = aFirstName;
        this.LastName = aLastName;
    }

    public void withdrawMoney(int ammount) {
        accountBalance -= ammount;
    }
    public void addMoney(int ammount) {
        accountBalance += ammount;
    }
    public void sendMoney(Account person, int money) {
        person.addMoney(money);
        accountBalance -= money;
    }
    public int getBalance() {
        return accountBalance;
    }
    public String getName() {
        return FirstName + " " + LastName;
    }
}
