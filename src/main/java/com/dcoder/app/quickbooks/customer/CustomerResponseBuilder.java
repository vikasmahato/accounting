package com.dcoder.app.quickbooks.customer;

import com.dcoder.app.payload.address.AddressResponse;
import com.dcoder.app.payload.customer.CustomerResponse;
import com.intuit.ipp.data.Customer;

public class CustomerResponseBuilder {

    public static CustomerResponse getCustomerResponse(Customer customer) {

        AddressResponse billingAddress = new AddressResponse(
                customer.getBillAddr().getLine1(),
                customer.getBillAddr().getCity(),
                customer.getBillAddr().getCountryCode(),
                customer.getBillAddr().getCountrySubDivisionCode(),
                customer.getBillAddr().getPostalCode()
        );

        AddressResponse shippingAddress = new AddressResponse(
                customer.getShipAddr().getLine1(),
                customer.getShipAddr().getCity(),
                customer.getShipAddr().getCountryCode(),
                customer.getShipAddr().getCountrySubDivisionCode(),
                customer.getShipAddr().getPostalCode()
        );

        return new CustomerResponse.CustomerResponsseBuilder()
                .setId(customer.getId())
                //.setFirstName(customer.get)
                //.setLastName(customer.getN)
                .setDisplayName(customer.getDisplayName())
                .setCompanyName(customer.getCompanyName())
                .setPrimaryPhone(customer.getPrimaryPhone().getFreeFormNumber())
                .setBillingAddress(billingAddress)
                .setShippingAddress(shippingAddress)
                .setEmail(customer.getPrimaryEmailAddr().getAddress())
                .build();

    }

}
