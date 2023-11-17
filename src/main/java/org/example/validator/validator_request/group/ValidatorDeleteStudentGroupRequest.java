package org.example.validator.validator_request.group;

import org.example.request.group.DeleteStudentGroupRequest;
import org.example.validator.validator_primitive.ValidatorId;
import org.example.validator.validator_request.ValidatorRequest;

import java.util.ArrayList;
import java.util.List;

public class ValidatorDeleteStudentGroupRequest implements ValidatorRequest<DeleteStudentGroupRequest> {
    private final ValidatorId validatorId;
    public ValidatorDeleteStudentGroupRequest() {
        validatorId = new ValidatorId();
    }

    @Override
    public List<String> validate(DeleteStudentGroupRequest params) {
        List<String> result = new ArrayList<>();
        validatorId.validate(params.getId(), result, "id", "id <= 0");

        return result;
    }
}
