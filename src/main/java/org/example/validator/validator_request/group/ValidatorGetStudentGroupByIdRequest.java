package org.example.validator.validator_request.group;

import org.example.request.group.GetStudentGroupByIdRequest;
import org.example.validator.validator_primitive.ValidatorId;
import org.example.validator.validator_request.ValidatorRequest;

import java.util.ArrayList;
import java.util.List;

public class ValidatorGetStudentGroupByIdRequest implements ValidatorRequest<GetStudentGroupByIdRequest> {
    private final ValidatorId validatorId;

    public ValidatorGetStudentGroupByIdRequest() {
        validatorId = new ValidatorId();
    }


    @Override
    public List<String> validate(GetStudentGroupByIdRequest params) {
        List<String> result = new ArrayList<>();

        validatorId.validate(params.getId(), result, "id", "id <= 0");

        return result;
    }
}
