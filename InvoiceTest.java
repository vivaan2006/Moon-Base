package com.hillcrest.cashtransactions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InvoiceTest {

    @Test
    public void testGettersAndSetters() {
        Invoice invoice = new Invoice("10001", 56.67, 'P');
        assertEquals("10001", invoice.getInvoiceNumber());
        assertEquals(56.67, invoice.getCashAmount(), 0.001);
        assertEquals("P", invoice.getStatus());

        invoice.setInvoiceNumber("10002");
        invoice.setCashAmount(23.67);
        invoice.setStatus('R');

        assertEquals("10002", invoice.getInvoiceNumber());
        assertEquals(23.67, invoice.getCashAmount(), 0.001);
        assertEquals("R", invoice.getStatus());
    }
}

