package com.canmertek.leave_management.service;

import com.canmertek.leave_management.model.Employee;
import com.canmertek.leave_management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    // Çalışan ekleme
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Çalışanları listeleme
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
