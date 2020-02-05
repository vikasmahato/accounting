package com.dcoder.app.quickbooks.customer;

import com.dcoder.app.payload.customer.CustomerRequest;
import com.dcoder.app.payload.customer.CustomerResponse;
import com.dcoder.app.quickbooks.factory.DataServiceFactory;
import com.dcoder.app.service.CustomerService;
import com.intuit.ipp.data.Customer;
import com.intuit.ipp.exception.FMSException;
import com.intuit.ipp.services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.intuit.ipp.util.Logger;

@Service
public class QBCustomerService implements CustomerService {

    private static final org.slf4j.Logger LOG = Logger.getLogger();
    private DataServiceFactory dataServiceFactory;

    @Autowired
    public QBCustomerService(DataServiceFactory dataServiceFactory) {
        this.dataServiceFactory = dataServiceFactory;
    }

    @Override
    public CustomerResponse createCustomer(CustomerRequest customerRequest) throws FMSException {
        DataService service = null;
        service = DataServiceFactory.getDataService();
        // add customer with minimum mandatory fields
        Customer customer = CustomerHelper.transformCustomerRequest(customerRequest);
        Customer savedCustomer = service.add(customer);
        LOG.info("Customer with mandatory fields created: " + savedCustomer.getId() + " ::customer name: " + savedCustomer.getDisplayName());

        return CustomerResponseBuilder.getCustomerResponse(customer);
    }

    @Override
    public CustomerResponse updateCustomer(CustomerRequest customerRequest) {
        return null;
    }

    @Override
    public Boolean deleteCustomer(Long customerId) {
        return null;
    }

    @Override
    public CustomerResponse getCustomer(Long customerId) {
        return null;
    }

    @Override
    public CustomerResponse getCustomer(String email) {
        return null;
    }

    @Override
    public List<CustomerResponse> getAllCustomers() {
        return null;
    }
}
