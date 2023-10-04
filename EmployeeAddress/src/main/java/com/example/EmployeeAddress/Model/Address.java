package com.example.EmployeeAddress.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {


        @Id
        private Long addressId;
        private String firstName;
        private String lastName;


}
