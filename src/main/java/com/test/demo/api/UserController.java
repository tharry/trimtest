package com.test.demo.api;

import com.test.demo.dto.UserDTO;
import com.test.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    @ResponseBody
    public UserDTO save(@RequestParam("name") final String name, @RequestParam("password") final String password) {
        return new UserDTO(userService.createUser(name, password));
    }

}
