package com.harsha.learnj.controller.v1;

import com.harsha.learnj.contract.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/v1/users")
public class UsersControllers {

    @PostMapping
    void signUp(final @RequestBody UserDTO.CreateUser user) {
        log.info("user info: " + user.toString());
    }
}
