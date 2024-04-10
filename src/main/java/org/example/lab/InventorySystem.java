package org.example.lab;

import java.util.ArrayList;
import java.util.List;

public class InventorySystem implements ProductOperations {
    private static InventorySystem instance;
    private final List<Product> productList;

    private InventorySystem() {
        productList = new ArrayList<>();
    }

    public static synchronized InventorySystem getInstance() {
        if (instance == null) {
            instance = new InventorySystem();
        }
        return instance;
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("Product added: " + product);
    }

    @Override
    public void updateInventory(String productName, int newQuantity) {
        for (Product product : productList) {
            if (product.getName().equals(productName)) {
                product.setQuantity(newQuantity);
                System.out.println("Inventory updated for " + productName + ": New quantity = " + newQuantity);
                return;
            }
        }
        System.out.println("Product not found: " + productName);
    }

    @Override
    public void generateReports() {
        System.out.println("Generating inventory reports...");
        System.out.println("Inventory Report:");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-20s %-15s %-10s %-10s %-15s\n", "Name", "Type", "Price ($)", "Quantity", "Expiration Date");
        System.out.println("--------------------------------------------------");
        for (Product product : productList) {
            System.out.printf("%-20s %-15s %-10.2f %-10d %-15s\n",
                    product.getName(), product.getType(), product.getPrice(), product.getQuantity(),
                    product.getExpirationDate() != null ? product.getExpirationDate() : "N/A");
        }
        System.out.println("--------------------------------------------------");
    }
}
