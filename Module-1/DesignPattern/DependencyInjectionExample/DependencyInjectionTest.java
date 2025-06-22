package DependencyInjectionExample;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Injecting dependency manually
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        // Use the service
        service.printCustomerDetails("C101");
    }
}
