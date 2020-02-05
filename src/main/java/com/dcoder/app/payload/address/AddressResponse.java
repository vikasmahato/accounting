package com.dcoder.app.payload.address;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressResponse {

    private String line1;
    private String line2;
    private String city;
    private String country;
    private String countrySubDivisionCode;
    private String postalCode;

    public AddressResponse() {
    }

    public AddressResponse(String line1, String city, String country, String countrySubDivisionCode, String postalCode) {
        this.line1 = line1;
        this.city = city;
        this.country = country;
        this.countrySubDivisionCode = countrySubDivisionCode;
        this.postalCode = postalCode;
    }
}
