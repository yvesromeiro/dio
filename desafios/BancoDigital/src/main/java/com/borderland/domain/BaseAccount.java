package com.borderland.domain;

import java.util.UUID;

public abstract class BaseAccount implements Account {
    protected UUID id;
    protected int branch;
    protected int number;
    protected double balance;
    protected Customer customer;

    public BaseAccount(int branch, int number, Customer customer) {
        this.id = UUID.randomUUID();
        this.branch = branch;
        this.number = number;
        this.customer = customer;
    }

    @Override
    public void withdraw(double value) {
        if(verifyIfHasValue(value)) {
            this.balance -= value;
        }
        System.out.println("You do not have enough balance to withdraw !\n");
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void transfer(double value, Account account) {
        if(verifyIfHasValue(value)) {
            this.balance -= value;
            account.deposit(value);
        }
    }

    @Override
    public boolean verifyIfHasValue(double value) {
        return this.balance >= value;
    }

    public UUID getId() {
        return id;
    }

    public int getBranch() {
        return branch;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String printResumeOfAccount() {
        return """
                Resume of Account %s
                ID: %s
                NUMBER: %s
                BRANCH: %s
                CUSTOMER NAME: %s
                BALANCE: %s
                """.formatted(id, id, number, branch, customer.getName(), balance);
    }
}
