package com.harsha.learnj.services;

import com.harsha.learnj.contract.UserDTO;
import com.harsha.learnj.stores.IUserStore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    @Autowired
    private IUserStore userStore;

    public void create(final UserDTO.CreateUser user) {
        log.info("user info: " + user.toString());
    }
}
