package com.wassup.springboottest.model.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long userKey;

    private String name;
}
