package com.hbsites.commons.domain.enumeration;

import lombok.Getter;

@Getter
public enum EMicroservice {
    RPGTRACKER_CORE("rpgtracker-core"),
    RPGTRACKER_COC("rpgtracker-coc"),
    RPGTRACKER_GB("rpgtracker-gb"),
    USER("");

    private final String updatePathsRoutingKey;

    private EMicroservice(String updatePathsRoutingKey) {
        this.updatePathsRoutingKey = updatePathsRoutingKey;
    }
}
