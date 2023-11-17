package org.example.validator.validator_request.student;

import org.example.request.student.GetStudentByIdRequest;
import org.example.validator.validator_primitive.ValidatorId;
import org.example.validator.validator_request.ValidatorRequest;

import java.util.ArrayList;
import java.util.List;

public class ValidatorGetStudentByIdRequest implements ValidatorRequest<GetStudentByIdRequest> {
    private final ValidatorId validatorId;
    public ValidatorGetStudentByIdRequest() {
        validatorId = new ValidatorId();
    }

    @Override
    public List<String> validate(GetStudentByIdRequest params) {
        List<String> result = new ArrayList<>();
        validatorId.validate(params.getId(), result, "id", "id <= 0");

        return result;
    }
}
