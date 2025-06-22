public class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public Product(int i, String string, String string2) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return productId + " | " + productName + " | Qty: " + quantity + " | Price: $" + price;
    }
}
