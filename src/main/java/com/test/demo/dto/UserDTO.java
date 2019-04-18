package com.test.demo.dto;

import com.test.demo.domain.User;

public class UserDTO {

    private String name;

    private String hashedPassword;

    public UserDTO() {
    }

    public UserDTO(final User user) {
        this.name = user.getName();
        this.hashedPassword = user.getPassword();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }
}
