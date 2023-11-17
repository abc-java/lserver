package org.example.validator.validator_primitive;

import java.util.List;

public class ValidatorString {

    public boolean validate(String str, int maxLength, List<String> errors, String field) {

        return validateExist(str, errors, field, "String is not exist") &&
                validateLength(str, maxLength, errors, field, "Length string > maxLength") &&
                validateEmpty(str, errors, field, "String is empty");
    }

    public boolean validateLength(String str, int maxLength, List<String> errors, String fieldName, String errorMessage) {
        if (str.length() > maxLength) {
            errors.add(fieldName + ":" + errorMessage);
            return false;
        }
        return true;
    }
    public boolean validateExist(String str, List<String> errors, String fieldName, String errorMessage) {
        if (str == null) {
            errors.add(fieldName + ":" + errorMessage);
            return false;
        }
        return true;
    }

    public boolean validateEmpty(String str, List<String> errors, String fieldName, String errorMessage) {
        if (str.isEmpty()) {
            errors.add(fieldName + ":" + errorMessage);
            return false;
        }
        return true;
    }
}
