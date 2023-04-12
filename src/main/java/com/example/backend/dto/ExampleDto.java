package com.example.backend.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class ExampleDto {
    int seq;
    String name;
    Date birth;
    String sex;
    String phone;
    String addr;
    String email;
}
