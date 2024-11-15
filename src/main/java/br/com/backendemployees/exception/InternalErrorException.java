package br.com.backendemployees.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalErrorException extends InternalError{
    public InternalErrorException(String message) {
        super(message);
    }
}
