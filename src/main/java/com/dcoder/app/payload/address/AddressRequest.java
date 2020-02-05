package com.dcoder.app.payload.address;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressRequest {

    private String line1;
    private String line2;
    private String city;
    private String country;
    private String countrySubDivisionCode;
    private String postalCode;
}
