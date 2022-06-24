package com.example.Exceptions.exceptions.userException;

public class UserAlreadyExistException extends RuntimeException{
    public UserAlreadyExistException() {
        super("User already exist");
    }
}
