public class Main {

    public static void main(String[] args) {
        Product[] products = {
            new Product(201, "Laptop", "Electronics"),
            new Product(202, "Shirt", "Clothing"),
            new Product(203, "Book", "Education"),
            new Product(204, "Phone", "Electronics"),
            new Product(205, "Shoes", "Footwear")
        };

        // 🔎 Linear Search
        String searchName = "Phone";
        Product foundLinear = SearchFunctions.linearSearch(products, searchName);
        System.out.println("Linear Search Result: " + (foundLinear != null ? foundLinear : "Product not found"));

        // 📊 Sort for Binary Search
        SearchFunctions.sortByProductName(products);

        // 🔍 Binary Search
        Product foundBinary = SearchFunctions.binarySearch(products, searchName);
        System.out.println("Binary Search Result: " + (foundBinary != null ? foundBinary : "Product not found"));
    }
}
