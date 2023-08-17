package com.itscreen.dataentryapp.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private String title;
    private String hometown;
}
