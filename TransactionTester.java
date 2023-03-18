package com.hillcrest.cashtransactions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TransactionTester {

    public static void main(String[] args) {
        String filename = "transactions.txt";
        double beginningBalance = 0.0;
        double endingBalance = 0.0;

        Transactions transactions = new Transactions(beginningBalance, endingBalance);

        try {
            File file = new File("transactions.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");

                // create Invoice object based on data in line
                String invoiceNumber = parts[0];
                double amount = Double.parseDouble(parts[1]);
                char status = parts[2].charAt(0);

                Invoice invoice = new Invoice(invoiceNumber, amount, status);

                transactions.addInvoice(invoice);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            e.printStackTrace();
        }

        try {
            transactions.reconcile();
            System.out.println("Account is in balance.");
        } catch (AccountOutOfBalanceException e) {
            System.out.println("Account is out of balance. Expected balance: " + e.getExpectedBalance() + ", actual balance: " + e.getActualBalance());
            e.printStackTrace();
        }
    }
}
