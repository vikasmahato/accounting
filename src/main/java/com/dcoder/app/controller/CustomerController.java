package com.dcoder.app.controller;

import com.dcoder.app.payload.customer.CustomerRequest;
import com.dcoder.app.service.CustomerService;
import com.intuit.ipp.exception.FMSException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createCustomer(CustomerRequest customerRequest) {
        try {
            return ResponseEntity.ok(customerService.createCustomer(customerRequest));
        } catch (FMSException e) {

        }
        return null;
    }

    @PostMapping("/update")
    public ResponseEntity<?> updateCustomer(CustomerRequest customerRequest) {
        return ResponseEntity.ok(customerService.updateCustomer(customerRequest));
    }

    @PostMapping("/delete/{customerId}")
    public ResponseEntity<?> deleteCustomer(@RequestParam("customerId") Long customerId) {
        return ResponseEntity.ok(customerService.deleteCustomer(customerId));
    }

    @GetMapping("/find/{custoemrId}")
    public ResponseEntity<?> getCustomer(@RequestParam("customerId") Long customerId) {
        return ResponseEntity.ok(customerService.getCustomer(customerId));
    }

    @GetMapping("/find/{email}")
    public ResponseEntity<?> getCustomer(@RequestParam("email") String email) {
        return ResponseEntity.ok(customerService.getCustomer(email));
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> getAllCustomers() {
        return ResponseEntity.ok(customerService.getAllCustomers());
    }
}
