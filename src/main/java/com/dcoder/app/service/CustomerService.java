package com.dcoder.app.service;

import com.dcoder.app.payload.customer.CustomerRequest;
import com.dcoder.app.payload.customer.CustomerResponse;
import com.intuit.ipp.exception.FMSException;

import java.util.List;

public interface CustomerService {
    CustomerResponse createCustomer(CustomerRequest customerRequest) throws FMSException;
    CustomerResponse updateCustomer(CustomerRequest customerRequest);
    Boolean deleteCustomer(Long customerId);
    CustomerResponse getCustomer(Long customerId);
    CustomerResponse getCustomer(String email);
    List<CustomerResponse> getAllCustomers();
}
