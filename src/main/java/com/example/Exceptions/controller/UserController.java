package com.example.Exceptions.controller;

import com.example.Exceptions.dto.TaskMessage;
import com.example.Exceptions.dto.UserDTO;
import com.example.Exceptions.service.UserService;
import net.bytebuddy.asm.Advice;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController

public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/api/v1/user")
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<TaskMessage> addUser(@Valid @RequestBody UserDTO userDTO){
        userService.addUser(userDTO);
        return ResponseEntity.ok().body(new TaskMessage("Usuario agregado con exito"));
    }
}
