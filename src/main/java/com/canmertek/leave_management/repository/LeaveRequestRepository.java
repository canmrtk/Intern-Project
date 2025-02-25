package com.canmertek.leave_management.repository;

import com.canmertek.leave_management.model.Employee;
import com.canmertek.leave_management.model.LeaveRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long> {
    
    List<LeaveRequest> findByEmployee(Employee employee);
    List<LeaveRequest> findByEmployeeId(Long employeeId);
    boolean existsByEmployeeAndStatus(Employee employee, String status);
}
