package com.canmertek.leave_management.controller;

import com.canmertek.leave_management.model.Employee;
import com.canmertek.leave_management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Employee loginRequest) {
        Optional<Employee> employeeOpt = employeeRepository.findByEmail(loginRequest.getEmail());

        if (employeeOpt.isPresent()) {
            Employee employee = employeeOpt.get();
            
            if (employee.getPassword().equals(loginRequest.getPassword())) {
                return ResponseEntity.ok(employee); // Başarılı girişte çalışan bilgilerini dön
            } else {
                return ResponseEntity.status(401).body("Şifre yanlış!");
            }
        } else {
            return ResponseEntity.status(404).body("Kullanıcı bulunamadı!");
        }
    }
}
