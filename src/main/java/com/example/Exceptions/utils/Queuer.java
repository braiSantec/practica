package com.example.Exceptions.utils;
import com.example.Exceptions.exceptions.userException.QueueMessageFails;


public class Queuer {

     private static final String MESSAGE_ERROR = "ERROR AL GUARDAR EN LA COLA";
    private static final String MESSAGE_SUCCESS = "SE GUARDO CORRECTAMENTE EN LA COLA";

    public static boolean queueMessage() {
        //This method should send an email and return true if it's ok and false if it fails
        MyProperties properties = new MyProperties();
        boolean statusQueueMessage = properties.isStatus_queue();
        if(!statusQueueMessage){
            Writer.operationWriter(MESSAGE_ERROR);
            throw new QueueMessageFails();
        }else{
            Writer.operationWriter(MESSAGE_SUCCESS);
        }

        return statusQueueMessage;
    }
}
