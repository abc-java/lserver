package org.example.validator.validator_primitive;

import java.time.LocalDate;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorDate{
    public boolean validate(LocalDate date, String reg, List<String> errors, String fieldName, String errorMessage) {
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(date.toString());
        if (!matcher.matches()) {
            errors.add(fieldName + ":" + errorMessage);
            return false;
        }
        return true;
    }
}
