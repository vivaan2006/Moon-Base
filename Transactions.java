package com.hillcrest.cashtransactions;

import java.util.ArrayList;
import java.util.List;

public class Transactions {
    private double beginningBalance;
    private double endingBalance;
    private List<Invoice> invoices;

    public Transactions(double beginningBalance, double endingBalance) {
        this.beginningBalance = beginningBalance;
        this.endingBalance = endingBalance;
        this.invoices = new ArrayList<>();
    }

    public void addInvoice(Invoice invoice) {
        this.invoices.add(invoice);
    }

    public double getBeginningBalance() {
        return beginningBalance;
    }

    public double getEndingBalance() {
        return endingBalance;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void reconcile() throws AccountOutOfBalanceException {
        double total = beginningBalance;
        for (Invoice invoice : invoices) {
            if (invoice.getStatus() == 'R') {
                total += invoice.getCashAmount();
            } else if (invoice.getStatus() == 'P') {
                total -= invoice.getCashAmount();
            }
        }
        if (total != endingBalance) {
            throw new AccountOutOfBalanceException(endingBalance, total);
        }
    }
}
