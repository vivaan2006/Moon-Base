package com.hillcrest.cashtransactions;

public class AccountOutOfBalanceException extends Exception {
    private double expectedBalance;
    private double actualBalance;

    public AccountOutOfBalanceException(double expectedBalance, double actualBalance) {
        this.expectedBalance = expectedBalance;
        this.actualBalance = actualBalance;
    }

    public AccountOutOfBalanceException() {
    }

    public double getExpectedBalance() {
        return expectedBalance;
    }

    public double getActualBalance() {
        return actualBalance;
    }
}
