package com.example.erecruit.model;

public class Admin {

    private String username;
    private String password;

    public Admin(){}
    public Admin(String user, String pwd){
        username=user;
        password=pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
