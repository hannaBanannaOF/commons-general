package com.hbsites.commons.infrastructure.messages.gateway;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Getter;

@RegisterForReflection
public record GatewayUpdatePaths(String instance, String url, String regex) {}
