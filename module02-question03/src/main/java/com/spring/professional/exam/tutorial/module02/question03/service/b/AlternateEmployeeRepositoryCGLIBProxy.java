package com.spring.professional.exam.tutorial.module02.question03.service.b;

import com.spring.professional.exam.tutorial.module02.question03.ds.Employee;

public class AlternateEmployeeRepositoryCGLIBProxy extends AlternateEmployeeRepository {

    @Override
    public Employee findEmployeeById(long id) {
        System.out.println("Before Advice");
        Employee employeeById = super.findEmployeeById(id);
        System.out.println("Before Advice");
        return employeeById;
    }

    @Override
    public void saveEmployee(Employee employee) {
        System.out.println("Before Advice");
        super.saveEmployee(employee);
        System.out.println("After Advice");
    }

    @Override
    public void deleteEmployee(Employee employee) {
        System.out.println("Before Advice");
        super.deleteEmployee(employee);
        System.out.println("After Advice");
    }
}
