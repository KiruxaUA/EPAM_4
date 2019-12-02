package ua.epam3.receiptcalculation;

import java.util.Date;

public class BusinessLogic {
    public int calculateDiscount(double amountToPay) {
        int discount;
        if (amountToPay > 0 && amountToPay < 500) {
            discount = 5;
        }
        else if (amountToPay > 500 && amountToPay < 1001) {
            discount = 10;
        }
        else {
            discount = 15;
        }
        return discount;
    }

    public double calculateTotalPay(double amountToPay, int discount) {
        return amountToPay * (100 - discount) / 100;
    }

    public Receipt generateReceipt(double amountToPay) {
        Receipt receipt = new Receipt();
        receipt.setDate(new Date());
        receipt.setAmountToPay(amountToPay);
        receipt.setDiscount(calculateDiscount(amountToPay));
        receipt.setTotalPay(calculateTotalPay(receipt.getAmountToPay(), receipt.getDiscount()));
        return receipt;
    }
}
