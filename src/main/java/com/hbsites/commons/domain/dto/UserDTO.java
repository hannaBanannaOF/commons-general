package com.hbsites.commons.domain.dto;

import io.quarkus.runtime.util.StringUtil;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
public class UserDTO {
    private UUID uuid;
    private String firstName;
    private String lastName;
    private String userName;

    public String getDisplayName() {
        String name = "";
        if (!StringUtil.isNullOrEmpty(this.firstName) && !StringUtil.isNullOrEmpty(this.lastName)) {
            name = this.getFirstName().concat(" ").concat(this.getLastName());
        }

        if (!StringUtil.isNullOrEmpty(this.userName) && !StringUtil.isNullOrEmpty(name)) {
            name = name.concat(" (").concat(this.getUserName()).concat(")");
        }

        if (StringUtil.isNullOrEmpty(name) && !StringUtil.isNullOrEmpty(this.userName)) {
            name = this.getUserName();
        }

        return name;
    }
}
