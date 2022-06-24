package com.example.Exceptions.utils;

import com.example.Exceptions.exceptions.userException.MailSenderException;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Mailer {

    private static final String MESSAGE_ERROR = "ERROR AL ENVIAR EL MAIL";
    private static final String MESSAGE_SUCCESS = "SE ENVIO CORRECTAMENTE EL MAIL";

    public static boolean mailSender() {
        //This method should send an email and return true if it's ok and false if it fails
        MyProperties properties = new MyProperties();
        boolean statusMail  = properties.isStatusMail();
        if(!statusMail){
            Writer.operationWriter(MESSAGE_ERROR);
            throw new MailSenderException();
        }else{
            Writer.operationWriter(MESSAGE_SUCCESS);
        }
       return true;
    }
}
