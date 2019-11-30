package ReceiptCalculationTest;

import org.junit.Test;
import receiptcalculation.*;

import static org.junit.Assert.assertEquals;

public class ReceiptCalculationTest {
    private BusinessLogic businessLogic = new BusinessLogic();
    private Receipt receipt = new Receipt();

    @Test
    public void calculateDiscountTest1() {
        assertEquals(10, businessLogic.calculateDiscount(550), 0.0);
    }

    @Test
    public void calculateDiscountTest2() {
        assertEquals(15, businessLogic.calculateDiscount(1122), 0.0);
    }

    @Test
    public void calculateDiscountTest3() {
        assertEquals(15, businessLogic.calculateDiscount(1360), 0.0);
    }

    @Test
    public void calculateTotalPay1() {
        assertEquals(495, businessLogic.calculateTotalPay(550, 10), 0.0);
    }

    @Test
    public void calculateTotalPay2() {
        assertEquals(953.7, businessLogic.calculateTotalPay(1122, 15), 0.0);
    }

    @Test
    public void calculateTotalPay3() {
        assertEquals(1156, businessLogic.calculateTotalPay(1360, 15), 0.0);
    }
}
