package org.example.validator.validator_request.group;

import org.example.request.group.AddStudentGroupRequest;
import org.example.validator.validator_primitive.ValidatorString;
import org.example.validator.validator_request.ValidatorRequest;

import java.util.ArrayList;
import java.util.List;

public class ValidatorAddStudentGroupRequest implements ValidatorRequest<AddStudentGroupRequest> {
    private final ValidatorString validatorString;
    private final int maxLength;
    public ValidatorAddStudentGroupRequest() {
        validatorString = new ValidatorString();
        maxLength = 1000;
    }

    @Override
    public List<String> validate(AddStudentGroupRequest params) {
        List<String> result = new ArrayList<>();
        validatorString.validate(params.getName(), maxLength, result, "name");
        
        return result;
    }
}
