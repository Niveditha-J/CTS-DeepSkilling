public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product(101, "Laptop", 10, 75000));
        manager.addProduct(new Product(102, "Mouse", 50, 500));
        manager.updateProduct(102, 45, 480);
        manager.deleteProduct(101);
        manager.displayInventory();
    }
}
