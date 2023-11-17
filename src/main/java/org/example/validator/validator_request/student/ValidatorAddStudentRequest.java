package org.example.validator.validator_request.student;

import org.example.request.student.AddStudentRequest;
import org.example.validator.validator_primitive.ValidatorGroupId;
import org.example.validator.validator_primitive.ValidatorId;
import org.example.validator.validator_primitive.ValidatorString;
import org.example.validator.validator_request.ValidatorRequest;

import java.util.ArrayList;
import java.util.List;

public class ValidatorAddStudentRequest implements ValidatorRequest<AddStudentRequest> {

    private final ValidatorString validatorString;
    private final ValidatorId validatorId;
    private final int maxLength;

    public ValidatorAddStudentRequest() {
        validatorString = new ValidatorString();
        validatorId = new ValidatorId();
        maxLength = 1000;
    }

    @Override
    public List<String> validate(AddStudentRequest params) {
        List<String> result = new ArrayList<>();
        validatorString.validate(
                params.getFirstName(),
                maxLength,
                result,
                "firstName"
        );

        validatorString.validate(
                params.getLastName(),
                maxLength,
                result,
                "lastName"
        );

        validatorString.validate(
                params.getMiddleName(),
                maxLength,
                result,
                "middleName"
        );

        validatorId.validate(
                params.getGroupId(),
                result,
                "groupId",
                "id <= 0"
        );
        validatorString.validate(
                params.getStatus(),
                maxLength,
                result,
                "status"
        );
        return result;
    }
}
