package com.example.Exceptions.exceptions.userException;

public class FileNotFoundException extends RuntimeException{
    public FileNotFoundException() {
        super("No se encontro el archivo de log");
    }
}
