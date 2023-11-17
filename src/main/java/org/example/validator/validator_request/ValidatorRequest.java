package org.example.validator.validator_request;

import java.util.List;

public interface ValidatorRequest<T> {
    List<String> validate(T params);
}
