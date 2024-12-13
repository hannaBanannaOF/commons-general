package com.hbsites.commons.domain.model;

import io.quarkus.runtime.util.StringUtil;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

public record UserInfo(UUID uuid, String firstName, String lastName, String userName) {
    public String getDisplayName() {
        String name = "";
        if (!StringUtil.isNullOrEmpty(this.firstName()) && !StringUtil.isNullOrEmpty(this.lastName())) {
            name = this.firstName().concat(" ").concat(this.lastName());
        }

        if (!StringUtil.isNullOrEmpty(this.userName()) && !StringUtil.isNullOrEmpty(name)) {
            name = name.concat(" (").concat(this.userName()).concat(")");
        }

        if (StringUtil.isNullOrEmpty(name) && !StringUtil.isNullOrEmpty(this.userName())) {
            name = this.userName();
        }
        return name;
    }
}
