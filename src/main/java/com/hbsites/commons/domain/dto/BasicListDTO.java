package com.hbsites.commons.domain.dto;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@SuperBuilder
@RegisterForReflection
public class BasicListDTO {
    private final UUID uuid;
    private final String description;
}
