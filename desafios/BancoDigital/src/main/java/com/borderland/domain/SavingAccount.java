package com.borderland.domain;

public class SavingAccount extends BaseAccount{
    public SavingAccount(int branch, int number, Customer customer) {
        super(branch, number, customer);
    }

    public void monthlyCashIncome() {
        if(this.balance > 0)
            this.balance += this.balance * 0.1;
    }
}
