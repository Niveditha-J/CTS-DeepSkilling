package DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // Dummy data, in real apps this would query a database
        return new Customer(id, "Nive Mahalakshmi");
    }
}
