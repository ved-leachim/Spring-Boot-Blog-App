package ch.deepsphere.learning.blog.springbootblogrestapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

public class BlogAPIException extends RuntimeException {

    public BlogAPIException(HttpStatus httpStatus, String message) {
        super(message);
    }
}
