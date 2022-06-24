package com.example.Exceptions.utils;
import com.example.Exceptions.exceptions.userException.SlackNotificationFails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component

public class Slacker {

    private static final String MESSAGE_ERROR = "ERROR AL ENVIAR EL MENSAJE SLACK";
    private static final String MESSAGE_SUCCESS = "SE ENVIO CORRECTAMENTE EL MENSAJE SLACK";


    public static boolean slackNotification() {
        MyProperties myProperties = new MyProperties();
        //This method should send an email and return true if it's ok and false if it fails
        boolean statusSalck = myProperties.isStatus_slack();
        if(!statusSalck){
            Writer.operationWriter(MESSAGE_ERROR);
            throw new SlackNotificationFails();
        }else{
            Writer.operationWriter(MESSAGE_SUCCESS);
        }
        return statusSalck;
    }
}
