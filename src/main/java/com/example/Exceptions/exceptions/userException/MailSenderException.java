package com.example.Exceptions.exceptions.userException;

public class MailSenderException extends RuntimeException{
    public MailSenderException() {
        super("Fallo el envio del email");
    }
}
