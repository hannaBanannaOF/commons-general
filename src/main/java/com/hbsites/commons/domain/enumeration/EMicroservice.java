package com.hbsites.commons.domain.enumeration;

import lombok.Getter;

@Getter
public enum EMicroservice {
    RPGTRACKER_CORE("core.user.response"),
    RPGTRACKER_COC("coc.user.response"),
    USER("");

    private final String userResponseRoutingKey;

    private EMicroservice(String userResponseRoutingKey) {
        this.userResponseRoutingKey = userResponseRoutingKey;
    }
}
