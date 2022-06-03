package com.harsha.learnj.controller.v1;

import com.harsha.learnj.contract.UserDTO;
import com.harsha.learnj.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/v1/users")
public class UsersControllers {

    @Autowired
    private UserService userService;

    @PostMapping
    void signUp(final @RequestBody UserDTO.CreateUser user) {
        this.userService.create(user);
    }
}
