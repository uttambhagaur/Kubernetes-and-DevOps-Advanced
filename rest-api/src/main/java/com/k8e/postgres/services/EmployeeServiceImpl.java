package com.k8e.postgres.services;

import com.k8e.postgres.exceptions.EmployeeNotFoundException;
import com.k8e.postgres.model.Employee;
import com.k8e.postgres.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getEmployees() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return this.employeeRepository.findById(id).orElseThrow(
                ()-> new EmployeeNotFoundException("Employee with id "+id+" not found")
        );
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        this.employeeRepository.findById(id).orElseThrow(
                ()-> new EmployeeNotFoundException("Employee with id "+id+" not found")
        );
        this.employeeRepository.deleteById(id);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee existingEmployee = this.employeeRepository.findById(id).orElseThrow(
                ()-> new EmployeeNotFoundException("Employee with id "+id+" not found")
        );
        existingEmployee.setName(employee.getName());
        existingEmployee.setAge(employee.getAge());
        return this.employeeRepository.save(existingEmployee);
    }
}
