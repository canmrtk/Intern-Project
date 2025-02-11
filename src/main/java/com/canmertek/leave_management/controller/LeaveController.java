package com.canmertek.leave_management.controller;

import com.canmertek.leave_management.dto.LeaveRequestDTO;
import com.canmertek.leave_management.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/leave")
public class LeaveController {

    @Autowired
    private LeaveService leaveService;

    @PostMapping("/request")
    public String requestLeave(@RequestBody LeaveRequestDTO leaveRequestDTO) {
        return leaveService.requestLeave(leaveRequestDTO.getEmployeeId(), leaveRequestDTO.getLeaveDays());
    }
}
