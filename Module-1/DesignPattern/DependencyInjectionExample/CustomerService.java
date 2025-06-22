package DependencyInjectionExample;

public class CustomerService {
    private CustomerRepository customerRepository;

    // Constructor Injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void printCustomerDetails(String id) {
        Customer customer = customerRepository.findCustomerById(id);
        System.out.println("Customer Found:");
        System.out.println("ID: " + customer.getId());
        System.out.println("Name: " + customer.getName());
    }
}
