package com.example.padegich.vaar;

/**
 * @author padegich on 9/23/18.
 * @project VaAR
 */
public class User {
    private String username, email, gender;

    public User(int anInt, String username, String email, String gender) {
        this.username = username;
        this.email = email;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }
}
