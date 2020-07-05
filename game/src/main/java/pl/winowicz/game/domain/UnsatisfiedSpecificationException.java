package pl.winowicz.game.domain;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UnsatisfiedSpecificationException extends ResponseStatusException {
    public UnsatisfiedSpecificationException(String message) {
        super(HttpStatus.BAD_REQUEST, message);
    }
}
