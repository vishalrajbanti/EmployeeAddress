package com.example.EmployeeAddress.Service;

import com.example.EmployeeAddress.Model.Address;
import com.example.EmployeeAddress.Model.Employee;
import com.example.EmployeeAddress.Repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepo iEmployeeRepo;

    public String addEmployee(Employee employee) {
        iEmployeeRepo.save(employee);
        return "employee added";
    }

    public List<Employee> getEmployees() {
        return iEmployeeRepo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return iEmployeeRepo.findById(id).orElseThrow();
    }

    public String updateEmployeeState(Long id, String state) {
       Employee employee = iEmployeeRepo.findById(id).orElseThrow();
       employee.setState(state);
       return "employee state updated";
    }

    public String deleteEmployeeById(Long id) {
        iEmployeeRepo.deleteById(id);
//       Employee employee = iEmployeeRepo.findById(id).orElseThrow();
//       Address address = employee.getAddress();
       return "employee deleted";
    }
}
