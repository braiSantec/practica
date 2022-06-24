package com.example.Exceptions.exceptions.handler;

import com.example.Exceptions.dto.TaskMessage;
import com.example.Exceptions.exceptions.userException.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;
import java.nio.file.FileAlreadyExistsException;

@ControllerAdvice
public class ExceptionConfig {
    @ExceptionHandler(UserAlreadyExistException.class)
    ResponseEntity<TaskMessage> handleValidationExceptions(UserAlreadyExistException e){
        TaskMessage taskMessage = new TaskMessage(e.getMessage());
        return new ResponseEntity<>(taskMessage,HttpStatus.CONFLICT);
    }
    @ExceptionHandler(DatabaseFailedOnSave.class)
    ResponseEntity<TaskMessage> handleValidationExceptions(DatabaseFailedOnSave e){
        TaskMessage taskMessage = new TaskMessage(e.getMessage());
        return new ResponseEntity<>(taskMessage,HttpStatus.SERVICE_UNAVAILABLE);
    }
    @ExceptionHandler(DatabaseNotAvailable.class)
    ResponseEntity<TaskMessage> handleValidationExceptions(DatabaseNotAvailable e){
        TaskMessage taskMessage = new TaskMessage(e.getMessage());
        return new ResponseEntity<>(taskMessage,HttpStatus.SERVICE_UNAVAILABLE);
    }
    @ExceptionHandler(QueueMessageFails.class)
    ResponseEntity<TaskMessage> handleValidationExceptions(QueueMessageFails e){
        TaskMessage taskMessage = new TaskMessage(e.getMessage());
        return new ResponseEntity<>(taskMessage,HttpStatus.SERVICE_UNAVAILABLE);
    }
    @ExceptionHandler(FileAlreadyExistsException.class)
    ResponseEntity<TaskMessage> handleValidationExceptions(FileAlreadyExistsException e){
        TaskMessage taskMessage = new TaskMessage(e.getMessage());
        return new ResponseEntity<>(taskMessage,HttpStatus.CONFLICT);
    }
    @ExceptionHandler(FileAlreadyOpenException.class)
    ResponseEntity<TaskMessage> handleValidationExceptions(FileAlreadyOpenException e){
        TaskMessage taskMessage = new TaskMessage(e.getMessage());
        return new ResponseEntity<>(taskMessage,HttpStatus.CONFLICT);
    }
    @ExceptionHandler(FileNotFoundException.class)
    ResponseEntity<TaskMessage> handleValidationExceptions(FileNotFoundException e){
        TaskMessage taskMessage = new TaskMessage(e.getMessage());
        return new ResponseEntity<>(taskMessage,HttpStatus.CONFLICT);
    }
    @ExceptionHandler(SlackNotificationFails.class)
    ResponseEntity<TaskMessage> handleValidationExceptions(SlackNotificationFails e){
        TaskMessage taskMessage = new TaskMessage(e.getMessage());
        return new ResponseEntity<>(taskMessage,HttpStatus.SERVICE_UNAVAILABLE);
    }
    @ExceptionHandler(MailSenderException.class)
    ResponseEntity<TaskMessage> handleValidationExceptions(MailSenderException e){
        TaskMessage taskMessage = new TaskMessage(e.getMessage());
        return new ResponseEntity<>(taskMessage,HttpStatus.SERVICE_UNAVAILABLE);
    }



    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<TaskMessage> handleValidationExceptions(ConstraintViolationException e) {
        TaskMessage taskMessage = new TaskMessage(e.getMessage());
        return new ResponseEntity<>(taskMessage, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<TaskMessage> handleValidationExceptions() {
        TaskMessage taskMessage = new TaskMessage("Argumentos no validos");
        return new ResponseEntity<>(taskMessage, HttpStatus.BAD_REQUEST);
    }


}
