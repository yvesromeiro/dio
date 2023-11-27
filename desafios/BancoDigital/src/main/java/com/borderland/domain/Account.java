package com.borderland.domain;

public interface Account {
    void withdraw(double value);
    void deposit(double value);
    double getBalance();
    void transfer(double value, Account account);
    boolean verifyIfHasValue(double value);
    String printResumeOfAccount();
}
