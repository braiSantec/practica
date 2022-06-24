package com.example.Exceptions.dto;

import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    @NotBlank(message = "El campo usuario no puede estar en blanco")
    @NotEmpty
    private String username;
    @NotBlank(message = "El campo usuario no puede estar en blanco")
    @NotEmpty
    private String password;
}
