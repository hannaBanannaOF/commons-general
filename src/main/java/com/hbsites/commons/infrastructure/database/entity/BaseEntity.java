package com.hbsites.commons.infrastructure.database.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.Column;

import java.time.LocalDateTime;

@RegisterForReflection
@Getter
@Setter
public abstract class BaseEntity {
    @Column(name = "create_date")
    private LocalDateTime creationDate;

    @Column(name = "update_date")
    private LocalDateTime updateDate;

}
