package com.example.Exceptions.exceptions.userException;

public class FileAlreadyOpenException extends RuntimeException{
    public FileAlreadyOpenException() {
        super("El archivo de Log se encuentra abierto");
    }
}
