package org.example.validator.validator_primitive;

import org.example.entity.GroupStudent;

import java.util.List;

public class ValidatorGroupId {
    private final ValidatorString validatorString;
    private final ValidatorId validatorId;
    private final int maxLength;

    public ValidatorGroupId() {
        validatorString = new ValidatorString();
        validatorId = new ValidatorId();
        maxLength = 1000;
    }
    public boolean validate(GroupStudent str, List<String> errors, String field) {
        var a = validatorString.validate(str.getName(), maxLength, errors, field);
        var b = validatorId.validate(str.getId(), errors, "id", "id <= 0");
        return a && b;
    }
}