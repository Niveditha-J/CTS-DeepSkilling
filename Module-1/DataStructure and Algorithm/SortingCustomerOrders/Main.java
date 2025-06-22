package SortingCustomerOrders;
public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Alice", 299.99),
            new Order(102, "Bob", 159.49),
            new Order(103, "Charlie", 499.00)
        };

        System.out.println("Before Sorting:");
        for (Order o : orders) {
            System.out.println(o);
        }

        Sorting.bubbleSort(orders);

        System.out.println("\nAfter Sorting (by Total Price):");
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
