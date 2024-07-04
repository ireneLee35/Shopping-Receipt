import com.example.Item;
import com.example.Receipt;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Test Case 1
        List<Item> items1 = new ArrayList<>();
        items1.add(new Item("book", 17.99, 1, "book"));
        items1.add(new Item("potato chips", 3.99, 1, "food"));
        System.out.println("Use Case 1:");
        Receipt.generateReceipt("CA", items1);
        System.out.println();

        // Test Case 2
        List<Item> items2 = new ArrayList<>();
        items2.add(new Item("book", 17.99, 1, "book"));
        items2.add(new Item("pencil", 2.99, 3, "stationery"));
        System.out.println("Use Case 2:");
        Receipt.generateReceipt("NY", items2);
        System.out.println();

        // Test Case 3
        List<Item> items3 = new ArrayList<>();
        items3.add(new Item("pencil", 2.99, 2, "stationery"));
        items3.add(new Item("shirt", 29.99, 1, "clothing"));
        System.out.println("Use Case 3:");
        Receipt.generateReceipt("NY", items3);
    }
}
