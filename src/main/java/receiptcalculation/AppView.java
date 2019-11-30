package receiptcalculation;

import java.util.Scanner;

public class AppView {
    private static Scanner sc = new Scanner(System.in);
    private BusinessLogic businessLogic = new BusinessLogic();

    void start() {
        System.out.println("Welcome to the receipt generator!");
        double amountToPay;
        do {
            System.out.print("Enter your amount to pay: ");
            amountToPay = sc.nextDouble();
        } while (amountToPay <= 0);
        Receipt receipt = businessLogic.generateReceipt(amountToPay);
        System.out.println(receipt.toString());
    }
}
