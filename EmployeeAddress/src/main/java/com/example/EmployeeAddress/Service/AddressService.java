package com.example.EmployeeAddress.Service;

import com.example.EmployeeAddress.Model.Address;
import com.example.EmployeeAddress.Repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public String addAddress(Address address) {
        iAddressRepo.save(address);
        return "address added";
    }

    public List<Address> getAllAddresses() {
        return iAddressRepo.findAll();
    }

    public Address getAddressById(Long id) {
        return iAddressRepo.findById(id).orElseThrow();
    }

    public String updateAddressFirstname(Long id, String firstname) {
        Address address = iAddressRepo.findById(id).orElseThrow();
        address.setFirstName(firstname);
        return "address firstname updated";
    }

    public String deleteAddress(Long id) {
        iAddressRepo.deleteById(id);
        return "address deleted";
    }
}
