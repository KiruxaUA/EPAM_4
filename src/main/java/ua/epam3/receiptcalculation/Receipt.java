package ua.epam3.receiptcalculation;

import java.util.Date;

public class Receipt {
    private Date date;
    private int discount;
    private double amountToPay;
    private double totalPay;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(double amountToPay) {
        this.amountToPay = amountToPay;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    @Override
    public String toString() {
        return "Date: " + getDate() + ",\n" +
                "Amount to pay: " + getAmountToPay() + ",\n" +
                "Discount: " + getDiscount() + ",\n" +
                "Total pay: " + getTotalPay();
    }
}