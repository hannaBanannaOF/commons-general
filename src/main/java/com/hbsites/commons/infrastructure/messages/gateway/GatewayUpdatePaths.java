package com.hbsites.commons.infrastructure.messages.gateway;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Builder;
import lombok.Getter;

@RegisterForReflection
@Getter
@Builder
public class GatewayUpdatePaths {
    private String instance;
    private String url;
    private String pathRegex;
}
