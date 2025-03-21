package com.canmertek.leave_management.repository;

import com.canmertek.leave_management.model.LeaveRequest;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LeaveRepository extends JpaRepository<LeaveRequest, UUID> {
}
