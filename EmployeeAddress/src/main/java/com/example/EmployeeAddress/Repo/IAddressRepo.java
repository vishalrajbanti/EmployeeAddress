package com.example.EmployeeAddress.Repo;

import com.example.EmployeeAddress.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Long> {
}
