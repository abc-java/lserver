package org.example.validator.validator_request.student;

import org.example.request.student.GetStudentsByGroupRequest;
import org.example.validator.validator_primitive.ValidatorId;
import org.example.validator.validator_request.ValidatorRequest;

import java.util.ArrayList;
import java.util.List;

public class ValidatorGetStudentsByGroupRequest implements ValidatorRequest<GetStudentsByGroupRequest> {
    private final ValidatorId validatorId;
    public ValidatorGetStudentsByGroupRequest() {
        validatorId = new ValidatorId();
    }

    @Override
    public List<String> validate(GetStudentsByGroupRequest params) {
        List<String> result = new ArrayList<>();
        validatorId.validate(params.getId(), result, "id", "id <= 0");
        return result;
    }
}
