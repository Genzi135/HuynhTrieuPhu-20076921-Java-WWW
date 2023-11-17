package backend.Services;

import backend.models.Customer;
import backend.repositories.CustomerRepositories;

public class CustomerServices {
    private final CustomerRepositories customerRepositories;

    public CustomerServices() throws Exception {
        customerRepositories = new CustomerRepositories();
    }

    public void add(Customer c) {
        customerRepositories.insert(c);
    }

    ;

    public Customer findByName(String name) {
        return customerRepositories.findByName(name);
    }

    ;

    public Customer findById(String id) {
        return customerRepositories.find(Long.parseLong(id));
    }
}
