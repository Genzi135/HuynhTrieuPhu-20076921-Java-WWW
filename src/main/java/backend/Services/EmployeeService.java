package backend.Services;

import backend.models.Employee;
import backend.repositories.EmployeeRepositories;

public class EmployeeService {
    private final EmployeeRepositories employeeRepositories;

    public EmployeeService() {
        employeeRepositories = new EmployeeRepositories();
    }

    public Employee findById(String id) {
        return employeeRepositories.findByID(id);
    }

    ;
}
