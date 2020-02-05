package com.dcoder.app.payload.customer;

import com.dcoder.app.payload.address.AddressRequest;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class CustomerRequest {

    private String id;
    private String firstName;
    private String lastName;
    private String displayName;
    private String companyName;
    private String primaryPhone;
    private AddressRequest billingAddress;
    private AddressRequest shippingAddress;
    private String email;
    private Boolean job;
    private BigDecimal balance;
    private Date openBalanceDate;
    private BigDecimal balanceWithJobs;
    private BigDecimal overDueBalance;
    private Boolean tdsEnabled;
    private String gstin;
    private String contactName;
    private String altContactName;
    private String notes;
    private Boolean billWithParent;
    private Integer level;

}
