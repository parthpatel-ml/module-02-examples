package com.spring.professional.exam.tutorial.module02.question03.service.a;

import com.spring.professional.exam.tutorial.module02.question03.ds.Employee;

public class EmployeeRepositoryImlJDKProxy implements EmployeeRepository {
    private EmployeeRepositoryImpl repository;

    public EmployeeRepositoryImlJDKProxy(EmployeeRepositoryImpl repository) {
        this.repository = repository;
    }

    @Override
    public Employee findEmployeeById(long id) {
        System.out.println("Before - findEmployeeById");
        Employee employeeById = repository.findEmployeeById(id);
        System.out.println("After - findEmployeeById");
        return employeeById;
    }

    @Override
    public void saveEmployee(Employee employee) {
        System.out.println("Before - saveEmployee");
        repository.saveEmployee(employee);
        System.out.println("After - saveEmployee");
    }

    @Override
    public void deleteEmployee(Employee employee) {
        System.out.println("Before - deleteEmployee");
        repository.deleteEmployee(employee);
        System.out.println("After - deleteEmployee");
    }
}
