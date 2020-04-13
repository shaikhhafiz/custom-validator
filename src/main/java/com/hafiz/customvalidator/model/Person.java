package com.hafiz.customvalidator.model;

import com.hafiz.customvalidator.validator.PhoneNoConstraint;
import lombok.Data;

@Data
public class Person {
    @PhoneNoConstraint(message = "Phone no is not valid")
    private String phoneNo;
}
