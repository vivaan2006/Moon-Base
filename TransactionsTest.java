package com.hillcrest.cashtransactions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TransactionsTest {
    @Test
    public void testGettersAndSetters() {
        Transactions transaction = new Transactions(100.0, 200.0);
        assertEquals(100.0, transaction.getBeginningBalance(), 0.001);
        assertEquals(200.0, transaction.getEndingBalance(), 0.001);

        assertEquals(100.0, transaction.getBeginningBalance(), 0.001);
        assertEquals(200.0, transaction.getEndingBalance(), 0.001);
    }

    @Test
    public void testAddInvoice() {
        Transactions transaction = new Transactions(100.0, 200.0);
        Invoice invoice1 = new Invoice("10001", 56.67, 'P');
        Invoice invoice2 = new Invoice("10002", 23.67, 'R');

        transaction.addInvoice(invoice1);
        assertEquals(1, transaction.getInvoices().size());

        transaction.addInvoice(invoice2);
        assertEquals(2, transaction.getInvoices().size());
    }

    @Test
    public void testCalculateInvoiceTotal() {
        Transactions transaction = new Transactions(100.0, 200.0);
        Invoice invoice1 = new Invoice("10001", 56.67, 'P');
        Invoice invoice2 = new Invoice("10002", 23.67, 'R');
        Invoice invoice3 = new Invoice("10003", 99.50, 'R');
        Invoice invoice4 = new Invoice("10004", 10.95, 'P');

        transaction.addInvoice(invoice1);
        transaction.addInvoice(invoice2);
        transaction.addInvoice(invoice3);
        transaction.addInvoice(invoice4);
    }
}
