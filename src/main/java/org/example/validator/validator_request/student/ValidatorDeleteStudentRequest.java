package org.example.validator.validator_request.student;

import org.example.request.student.DeleteStudentRequest;
import org.example.validator.validator_primitive.ValidatorId;
import org.example.validator.validator_request.ValidatorRequest;

import java.util.ArrayList;
import java.util.List;

public class ValidatorDeleteStudentRequest implements ValidatorRequest<DeleteStudentRequest> {
    private final ValidatorId validatorId;
    public ValidatorDeleteStudentRequest() {
        validatorId = new ValidatorId();
    }


    @Override
    public List<String> validate(DeleteStudentRequest params) {
        List<String> result = new ArrayList<>();
        validatorId.validate(
                params.getId(),
                result,
                "id",
                "id <= 0");
        return result;
    }
}
