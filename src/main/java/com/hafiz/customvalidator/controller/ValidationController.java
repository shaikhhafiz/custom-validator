package com.hafiz.customvalidator.controller;

import com.hafiz.customvalidator.model.Person;
import com.hafiz.customvalidator.model.User;
import com.hafiz.customvalidator.validator.CreateValidateGroup;
import com.hafiz.customvalidator.validator.UpdateValidateGroup;
import org.springframework.validation.annotation.Validated;
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

    @PostMapping("user-create")
    public User validateUserCreate(@RequestBody @Validated({CreateValidateGroup.class}) User user) {
        return user;
    }

    @PostMapping("user-update")
    public User validateUserUpdate(@RequestBody @Validated({UpdateValidateGroup.class}) User user) {
        return user;
    }
}
