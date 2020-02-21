package com.yorkmass.demo.model;

public class User {
    private Integer id;
    private String username;
    private String emp_id;
    private String password;


    public User(Integer id,String username, String password, String emp_id) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.emp_id = emp_id;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_iid) {
        this.emp_id = emp_iid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User(String username, String password){
        this.username=username;
        this.password=password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", emp_id='" + emp_id + '\'' +
                '}';
    }
}
