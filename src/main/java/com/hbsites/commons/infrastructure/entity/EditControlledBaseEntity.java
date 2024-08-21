package com.hbsites.commons.infrastructure.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@RegisterForReflection
@MappedSuperclass
@Getter
@Setter
public abstract class EditControlledBaseEntity extends BaseEntity {
    @Column(name = "creator_id", columnDefinition = "uuid")
    private UUID creatorId;
}
