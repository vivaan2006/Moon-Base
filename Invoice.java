package com.hillcrest.cashtransactions;

public class Invoice {
    private String invoiceNumber;
    private double cashAmount;
    private char status;

    public Invoice(String invoiceNumber, double cashAmount, char status) {
        this.invoiceNumber = invoiceNumber;
        this.cashAmount = cashAmount;
        this.status = status;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(double cashAmount) {
        this.cashAmount = cashAmount;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
}
