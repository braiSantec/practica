package com.example.Exceptions.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MyProperties {
    private boolean statusMail= true;
    private boolean status_slack=true;
    private boolean status_queue=false;
    private boolean status_userExist=false;
    private boolean status_dataBaseOnline=true;
    private boolean status_dataBase=true;
    private boolean status_fileOpen = true;

}
