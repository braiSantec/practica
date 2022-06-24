package com.example.Exceptions.repository;

import com.example.Exceptions.exceptions.userException.DatabaseFailedOnSave;
import com.example.Exceptions.utils.MyProperties;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository  {


    public boolean saveInDataBase(){
        MyProperties properties = new MyProperties();
        boolean statusDataBase = properties.isStatus_dataBase();
        if(!statusDataBase){
            throw new DatabaseFailedOnSave();
        }
        return statusDataBase;
    }

}
