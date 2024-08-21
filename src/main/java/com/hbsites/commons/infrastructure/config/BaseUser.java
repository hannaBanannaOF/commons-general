package com.hbsites.commons.infrastructure.config;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public abstract class BaseUser {
    private UUID userId;
}
