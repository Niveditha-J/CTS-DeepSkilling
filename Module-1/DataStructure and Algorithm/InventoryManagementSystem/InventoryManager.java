import java.util.HashMap;

public class InventoryManager {
    HashMap<Integer, Product> inventory = new HashMap<>();

    // Add Product
    public void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Added: " + product);
    }

    // Update Product
    public void updateProduct(int productId, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.quantity = quantity;
            product.price = price;
            System.out.println("Updated: " + product);
        } else {
            System.out.println("Product ID " + productId + " not found.");
        }
    }

    // Delete Product
    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            Product removed = inventory.remove(productId);
            System.out.println("Deleted: " + removed);
        } else {
            System.out.println("Product ID " + productId + " not found.");
        }
    }

    // Display Inventory
    public void displayInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}
