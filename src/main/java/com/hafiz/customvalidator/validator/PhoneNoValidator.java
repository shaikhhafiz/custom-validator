package com.hafiz.customvalidator.validator;

import com.hafiz.customvalidator.exception.handlers.InvalidInput;
import lombok.SneakyThrows;
import org.hibernate.validator.internal.engine.constraintvalidation.ConstraintValidatorContextImpl;
import org.hibernate.validator.internal.metadata.descriptor.ConstraintDescriptorImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNoValidator implements ConstraintValidator<PhoneNoConstraint, String> {
    @Override
    public void initialize(PhoneNoConstraint constraintAnnotation) {

    }

    @SneakyThrows
    @Override
    public boolean isValid(String contactField, ConstraintValidatorContext ctx) {
        if(contactField != null && contactField.matches("[0-9]+") && (contactField.length() > 8 ) && (contactField.length() < 12) ){
            return true;
        } else {
            String message = ((ConstraintDescriptorImpl) ((ConstraintValidatorContextImpl) ctx).getConstraintDescriptor()).getAnnotationDescriptor().getMessage();
            throw new InvalidInput(message);
        }
    }
}
