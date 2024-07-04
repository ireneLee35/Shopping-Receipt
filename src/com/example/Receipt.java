package com.example;

import java.util.List;

public class Receipt {
    private static final double CA_TAX_RATE = 0.0975;
    private static final double NY_TAX_RATE = 0.08875;

    private static final String CATEGORY_FOOD = "food";
    private static final String CATEGORY_CLOTHING = "clothing";

    public static void generateReceipt(String location, List<Item> items) {
        double subtotal = 0;
        double totalTax = 0;

        System.out.println("com.example.Item\t\tPrice\tQty");

        for (Item item : items) {
            double itemTotal = item.price * item.quantity;
            subtotal += itemTotal;

            double itemTax = calculateSalesTax(location, item);
            totalTax += itemTax;

            System.out.printf("%s\t\t$%.2f\t%d\n", item.name, item.price, item.quantity);
        }

        double total = subtotal + totalTax;

        System.out.printf("Subtotal:\t$%.2f\n", subtotal);
        System.out.printf("Tax:\t\t$%.2f\n", totalTax);
        System.out.printf("Total:\t\t$%.2f\n", total);
    }

    public static double calculateSalesTax(String location, Item item) {
        double taxRate = 0;
        if (location.equals("CA")) {
            if (!item.category.equals(CATEGORY_FOOD)) {
                taxRate = CA_TAX_RATE;
            }
        } else if (location.equals("NY")) {
            if (!item.category.equals(CATEGORY_FOOD) && !item.category.equals(CATEGORY_CLOTHING)) {
                taxRate = NY_TAX_RATE;
            }
        }
        double tax = roundUp(item.price * item.quantity * taxRate);
        return tax;
    }

    private static double roundUp(double amount) {
        return Math.ceil(amount * 20.0) / 20.0;
    }
}
