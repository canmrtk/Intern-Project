package com.canmertek.leave_management.dto;

public class LeaveRequestDTO {
    private Long employeeId;
    private int leaveDays;

    public LeaveRequestDTO() {}

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }
}
