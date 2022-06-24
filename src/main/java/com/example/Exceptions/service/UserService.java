package com.example.Exceptions.service;

import com.example.Exceptions.dto.UserDTO;
import com.example.Exceptions.exceptions.userException.*;
import com.example.Exceptions.repository.UserRepository;
import com.example.Exceptions.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.core.env.Environment;

@Service
public class UserService {

private UserRepository userRepository;

public UserService(UserRepository userRepository){
    this.userRepository = userRepository;
}


    public boolean addUser(UserDTO userDTO) {
        MyProperties myProperties = new MyProperties();
        //Check database disponibility

        if(!myProperties.isStatus_dataBaseOnline()) throw new DatabaseNotAvailable();
        //Check user existence:
        if(myProperties.isStatus_userExist()) {
            Mailer.mailSender();
            throw new UserAlreadyExistException();
        }else {
            userRepository.saveInDataBase();
            Slacker.slackNotification();
            Queuer.queueMessage();

        }
        Writer.operationWriter("Operacion exitosa");




        return true;
    }


}
