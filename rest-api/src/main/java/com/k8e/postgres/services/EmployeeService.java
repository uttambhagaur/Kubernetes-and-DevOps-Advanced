package com.k8e.postgres.services;

import com.k8e.postgres.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();

    Employee getEmployeeById(Long id);

    Employee saveEmployee(Employee employee);

    void deleteEmployee(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
