package org.example.validator.validator_primitive;

import java.util.List;

public class ValidatorId {
    public boolean validate(long id, List<String> errors, String fieldName, String errorMessage) {
        if (id <= 0) {
            errors.add(fieldName + ":" + errorMessage);
            return false;
        }
        return true;
    }
}

