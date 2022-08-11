package com.sirius.koshelek.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class EmailValidator implements ConstraintValidator<ValidEmail, String> {

    private static final Pattern emailPattern = Pattern.compile("^.+@.+\\..+$");

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        return email != null && emailPattern.matcher(email).matches();
    }
}
