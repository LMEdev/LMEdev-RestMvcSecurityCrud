package ru.leonid.springCrudApp.files.dto;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String name;
    private String surname;
    private Integer age;
    private Integer benchPressWeight;
    private String password;
}