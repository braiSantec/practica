package com.example.Exceptions.exceptions.userException;

public class DatabaseNotAvailable extends RuntimeException{
    public DatabaseNotAvailable() {
        super("La base de datos no esta disponible");
    }
}
