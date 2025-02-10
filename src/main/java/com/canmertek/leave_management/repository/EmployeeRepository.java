package com.canmertek.leave_management.repository;

import com.canmertek.leave_management.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
