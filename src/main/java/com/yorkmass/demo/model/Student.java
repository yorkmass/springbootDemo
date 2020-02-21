package com.yorkmass.demo.model;

public class Student {
    private String username;
    private String gender;
    private Integer id;

    public Student(String username, String gender, Integer id) {
        this.username = username;
        this.gender = gender;
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
