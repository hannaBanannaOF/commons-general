package com.hbsites.commons.infrastructure.database.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class Identity<T> {
    private final UUID value;
}
