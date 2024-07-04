package test;

import com.example.Item;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import  java.util.List;

import com.example.Receipt;

public class ReceiptTest {
    @Test
    public void testCalculateSalesTax_CA_Food() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("potato chips", 3.99, 1, "food"));
        double tax = Receipt.calculateSalesTax("CA", items.get(0));
        assertEquals(0.0, tax, 0.01);
    }

    @Test
    public void testCalculateSalesTax_CA_Book() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("book", 17.99, 1, "book"));
        double tax = Receipt.calculateSalesTax("CA", items.get(0));
        assertEquals(1.80, tax, 0.01);
    }

    @Test
    public void testCalculateSalesTax_NY_Book() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("book", 17.99, 1, "book"));
        double tax = Receipt.calculateSalesTax("NY", items.get(0));
        assertEquals(1.60, tax, 0.01);
    }

    @Test
    public void testCalculateSalesTax_NY_Pencil() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("pencil", 2.99, 3, "stationery"));
        double tax = Receipt.calculateSalesTax("NY", items.get(0));
        assertEquals(0.80, tax, 0.01);
    }

    @Test
    public void testCalculateSalesTax_NY_Shirt() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("shirt", 29.99, 1, "clothing"));
        double tax = Receipt.calculateSalesTax("NY", items.get(0));
        assertEquals(0.00, tax, 0.01);
    }
}
