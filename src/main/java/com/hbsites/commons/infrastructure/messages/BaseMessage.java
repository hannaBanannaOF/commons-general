package com.hbsites.commons.infrastructure.messages;

import com.hbsites.commons.domain.enumeration.EMicroservice;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@RegisterForReflection
public record BaseMessage(EMicroservice microservice, UUID userRequested) {}
