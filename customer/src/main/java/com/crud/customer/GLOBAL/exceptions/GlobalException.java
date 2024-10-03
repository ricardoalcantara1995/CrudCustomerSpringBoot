package com.crud.customer.GLOBAL.exceptions;

import com.crud.customer.GLOBAL.dto.MessageDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(ResourceNotFoundException.class)
    ResponseEntity<MessageDTO>throwNotFoundException(ResourceNotFoundException exception){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new MessageDTO(HttpStatus.NOT_FOUND,exception.getMessage()));
    }
    @ExceptionHandler(AttributeException.class)
    ResponseEntity<MessageDTO>throwAttributeException(AttributeException exception){
        return ResponseEntity.badRequest()
                .body(new MessageDTO(HttpStatus.BAD_REQUEST,exception.getMessage()));
    }
}
