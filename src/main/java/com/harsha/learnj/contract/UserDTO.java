package com.harsha.learnj.contract;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public interface UserDTO {

    @Data
    @Getter
    @Setter
    @NoArgsConstructor
    class CreateUser {

        @NotNull
        String name;

        @JsonProperty(value = "org_name")
        @NotNull
        String orgName;

        @JsonProperty(value = "nickname")
        @NotNull
        String nickName;

        @NotNull
        String password;
    }

}
