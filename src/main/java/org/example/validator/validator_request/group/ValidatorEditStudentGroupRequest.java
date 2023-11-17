package org.example.validator.validator_request.group;

import org.example.request.group.EditStudentGroupRequest;
import org.example.validator.validator_primitive.ValidatorId;
import org.example.validator.validator_primitive.ValidatorString;
import org.example.validator.validator_request.ValidatorRequest;

import java.util.ArrayList;
import java.util.List;

public class ValidatorEditStudentGroupRequest implements ValidatorRequest<EditStudentGroupRequest> {
    private final ValidatorId validatorId;
    private final ValidatorString validatorString;
    private final int maxLength;
    public ValidatorEditStudentGroupRequest() {
        validatorId = new ValidatorId();
        validatorString = new ValidatorString();
        maxLength = 1000;
    }


    @Override
    public List<String> validate(EditStudentGroupRequest params) {
        List<String> result = new ArrayList<>();

        validatorId.validate(params.getId(), result, "id", "id <= 0");
        validatorString.validate(params.getName(), maxLength, result, "name");

        return result;
    }
}
