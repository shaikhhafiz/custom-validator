package com.hafiz.customvalidator.controller;

import com.hafiz.customvalidator.model.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("valid")
public class ValidationController {

    @PostMapping("contact-no")
    public String validContactNo(@RequestBody @Valid Person person) {
        return person.getPhoneNo() + " is a valid phone no";
    }
}
