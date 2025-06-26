package collabhubbr.projects.exceptions;

import jakarta.validation.UnexpectedTypeException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.naming.directory.InvalidAttributesException;
import java.rmi.UnexpectedException;
import java.util.List;


@ControllerAdvice
public class ValidationExceptionHandler {

    @ExceptionHandler(InvalidAttributesException.class)
    protected ResponseEntity<MessageError> handleCredentialsException(
            InvalidAttributesException ex) {
        return ResponseEntity.status(401).body(
                new MessageError(ex.getMessage(), HttpStatus.FORBIDDEN)
        );
    }

    @ExceptionHandler(UnexpectedException.class)
    protected ResponseEntity<MessageError> handleUnexpectedException(
            UnexpectedTypeException ex) {
        return ResponseEntity.status(401).body(
                new MessageError(ex.getMessage(), HttpStatus.FORBIDDEN)
        );
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<List<DataException>> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        var errors = ex.getFieldErrors()
                .stream()
                .map(DataException::new)
                .toList();

        return ResponseEntity.badRequest().body(errors);
    }

    private record MessageError(String message, HttpStatus status) {}

    private record DataException(String label, String message) {
        DataException(FieldError error) {
            this(
                    error.getField(),
                    error.getDefaultMessage()
            );
        }
    }
}
