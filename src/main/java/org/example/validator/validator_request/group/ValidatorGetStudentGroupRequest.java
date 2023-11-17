package org.example.validator.validator_request.group;

import org.example.request.group.GetStudentGroupRequest;
import org.example.validator.validator_request.ValidatorRequest;

import java.util.List;

public class ValidatorGetStudentGroupRequest implements ValidatorRequest<GetStudentGroupRequest> {

    @Override
    public List<String> validate(GetStudentGroupRequest params) {
        return null;
    }
}
