package com.example.EmployeeAddress.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {


    @Id
    private Long employeeId;
    private String street;

    private String city;
    private String state;
    private String zipcode;


    @OneToOne
    @JoinColumn(name = "fk_add")
     Address address;
}
