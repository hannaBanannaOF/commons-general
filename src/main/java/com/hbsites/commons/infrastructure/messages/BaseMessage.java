package com.hbsites.commons.infrastructure.messages;

import com.hbsites.commons.domain.enumeration.EMicroservice;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@RegisterForReflection
@Getter
@Setter
public abstract class BaseMessage {
    private EMicroservice microservice;
    private UUID userRequested;
}
