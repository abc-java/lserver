package org.example.validator.validator_request.student;

import org.example.request.student.EditStudentRequest;
import org.example.validator.validator_primitive.ValidatorId;
import org.example.validator.validator_primitive.ValidatorString;
import org.example.validator.validator_request.ValidatorRequest;

import java.util.ArrayList;
import java.util.List;

public class ValidatorEditStudentRequest implements ValidatorRequest<EditStudentRequest> {
    private final ValidatorId validatorId;
    private final ValidatorString validatorString;

    private final int maxLength;

    public ValidatorEditStudentRequest() {
        validatorId = new ValidatorId();
        validatorString = new ValidatorString();
        maxLength = 1000;
    }
    @Override
    public List<String> validate(EditStudentRequest params) {
        List<String> result = new ArrayList<>();

        validatorId.validate(params.getId(), result, "id", "id <= 0");
        validatorString.validate(params.getFirstName(), maxLength, result, "firstName");
        validatorString.validate(params.getMiddleName(), maxLength, result, "middleName");
        validatorString.validate(params.getLastName(), maxLength, result, "lastName");
        validatorString.validate(params.getStatus(), maxLength, result, "Status");
        validatorString.validate(params.getGroupId(), maxLength, result, "groupId");

        return result;
    }
}
