package com.example.EmployeeAddress.Controller;

import com.example.EmployeeAddress.Model.Employee;
import com.example.EmployeeAddress.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;


    // POST /employees - create a new employee
    @PostMapping("employee")
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
   // GET /employees - get all employees

    @GetMapping("employees")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

   // GET /employees/{id} - get an employee by id
   @GetMapping("empoyee/id/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
   }


  //  PUT /employees/{id} - update an employee by id

    @PutMapping("employee/id/{id}/state/{state}")
    public String updateEmployeeState(@PathVariable Long id,@PathVariable String state){
        return employeeService.updateEmployeeState(id,state);
    }
  //  DELETE /employees/{id} - delete an employee by id
    @DeleteMapping("employee/id/{id}")
    public String deleteEmployeeById(@PathVariable Long id){
        return employeeService.deleteEmployeeById(id);
    }
}
