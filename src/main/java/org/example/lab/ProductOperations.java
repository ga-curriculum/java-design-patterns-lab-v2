package org.example.lab;

public interface ProductOperations {
    void addProduct(Product product);
    void updateInventory(String productName, int newQuantity);
    void generateReports();
}
