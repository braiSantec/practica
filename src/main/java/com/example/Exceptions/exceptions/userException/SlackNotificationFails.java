package com.example.Exceptions.exceptions.userException;

public class SlackNotificationFails extends RuntimeException{
    public SlackNotificationFails() {
        super("No se pudo enviar la notificacion por slack");
    }
}
