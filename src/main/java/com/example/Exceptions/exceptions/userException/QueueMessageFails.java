package com.example.Exceptions.exceptions.userException;

public class QueueMessageFails extends RuntimeException{
    public QueueMessageFails() {
        super("No se pudo escribir el mensaje en cola");
    }
}
