package com.borderland.console;

import com.borderland.domain.CheckingAccount;
import com.borderland.domain.Customer;
import com.borderland.domain.SavingAccount;

public class App {
    public static void main(String[] args) {
        System.out.println("Digital Banking APP \n================================");

        var customerOne = new Customer("Yves", "123.321.456-86");
        var checkingAccountOne = new CheckingAccount(667, 1236, customerOne);
        var customerTwo = new Customer("Adeilton", "321.546.889-66");
        var savingsAccountOne = new SavingAccount(987, 3215, customerTwo);

        checkingAccountOne.deposit(5000);
        checkingAccountOne.withdraw(6000);

        checkingAccountOne.transfer(1500, savingsAccountOne);

        savingsAccountOne.monthlyCashIncome();

        System.out.println(checkingAccountOne.printResumeOfAccount());
        System.out.println(savingsAccountOne.printResumeOfAccount());
    }
}
