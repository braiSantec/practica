package com.example.Exceptions.utils;

import com.example.Exceptions.exceptions.userException.FileAlreadyOpenException;
import com.example.Exceptions.exceptions.userException.FileNotFoundException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Writer {

    public static boolean operationWriter(String message) {
        //This method should write the operation status and return true if it's ok and false if it fails
        MyProperties properties = new MyProperties();
        try {
            boolean isFileOpen = properties.isStatus_fileOpen();
            if (!isFileOpen) throw new FileAlreadyOpenException();
            Files.write(Paths.get("src/main/resources/ErrorLogger"), ("\n -"+message+" at: "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"))).getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            throw new FileNotFoundException();
        }
        return true;
    }

}
