package org.example.lab;

import java.util.Date;

public class InventoryManagementSystemLab {
    public static void main(String[] args) {
        InventorySystem inventorySystem = InventorySystem.getInstance();

        // Adding products
        Product product1 = new Product("Smartphone", "Electronics", 599.99, 10, new Date());
        Product product2 = new Product("T-shirt", "Clothing", 19.99, 50, null);
        Product product3 = new Product("Milk", "Groceries", 2.99, 20, new Date());

        inventorySystem.addProduct(product1);
        inventorySystem.addProduct(product2);
        inventorySystem.addProduct(product3);

        // Update inventory
        inventorySystem.updateInventory("Smartphone", 8);

        // Generate reports
        inventorySystem.generateReports();
    }
}