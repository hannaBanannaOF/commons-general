package com.hbsites.commons.infrastructure.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@RegisterForReflection
@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity {
    @Column(name = "create_date", columnDefinition = "timestamp")
    private LocalDateTime creationDate;

    @Column(name = "update_date", columnDefinition = "timestamp")
    private LocalDateTime updateDate;

    @PrePersist
    void onCreate() {
        this.setCreationDate(LocalDateTime.now());
        this.setUpdateDate(LocalDateTime.now());
    }

    @PreUpdate
    void onUpdate() {
        this.setUpdateDate(LocalDateTime.now());
    }

}
