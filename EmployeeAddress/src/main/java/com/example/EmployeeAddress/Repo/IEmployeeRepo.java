package com.example.EmployeeAddress.Repo;

import com.example.EmployeeAddress.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepo extends JpaRepository<Employee,Long> {
}
