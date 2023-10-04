package com.example.EmployeeAddress.Controller;

import com.example.EmployeeAddress.Model.Address;
import com.example.EmployeeAddress.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;


    //  POST /addresses - create a new address
    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

  //  GET /addresses - get all addresses
    @GetMapping("addresses")
    public List<Address> getAllAdresses(){
        return addressService.getAllAddresses();
    }

   // GET /addresses/{id} - get an address by id
    @GetMapping("address/id/{id}")
    public Address getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

  //  PUT /addresses/{id} - update an address by id
    @PutMapping("address/id/{id}/fisrtname/{firstname}")
    public String updateAddressFirstname(@PathVariable Long id,@PathVariable String firstname){
        return addressService.updateAddressFirstname(id,firstname);
    }

  //  DELETE /addresses/{id} - delete an address by id
    @DeleteMapping("address/id/{id}")
    public String deleteAddress(@PathVariable Long id){
        return addressService.deleteAddress(id);
    }
}
