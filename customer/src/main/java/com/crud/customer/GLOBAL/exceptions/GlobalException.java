package com.crud.customer.GLOBAL.exceptions;

import com.crud.customer.GLOBAL.dto.MessageDTO;
import com.crud.customer.GLOBAL.utils.Operation;
import org.hibernate.internal.ExceptionConverterImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<MessageDTO>throwNotFoundException(ResourceNotFoundException exception){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new MessageDTO(HttpStatus.NOT_FOUND,exception.getMessage()));
    }
    @ExceptionHandler(AttributeException.class)
    public ResponseEntity<MessageDTO>throwAttributeException(AttributeException exception){
        return ResponseEntity.badRequest()
                .body(new MessageDTO(HttpStatus.BAD_REQUEST,exception.getMessage()));
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<MessageDTO>generalException(Exception exception){
        return ResponseEntity.internalServerError()
                .body(new MessageDTO(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage()));
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<MessageDTO>validateException(MethodArgumentNotValidException exception){
        List<String>errorMessages = new ArrayList<>();
        exception.getBindingResult().getAllErrors().forEach((error) -> {
            errorMessages.add(error.getDefaultMessage());
        });
        return ResponseEntity.badRequest()
                .body(new MessageDTO(HttpStatus.BAD_REQUEST, Operation.trimBrackets(errorMessages.toString())));
    }
}
