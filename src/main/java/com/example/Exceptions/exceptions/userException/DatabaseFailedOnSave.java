package com.example.Exceptions.exceptions.userException;

public class DatabaseFailedOnSave extends RuntimeException{
    public DatabaseFailedOnSave() {
        super("No se pudo persistir en base de datos");
    }
}
