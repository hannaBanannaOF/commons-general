package com.hbsites.commons.infrastructure.config;

import io.smallrye.mutiny.Uni;

public interface ProviderManager {

    Uni<Void> populate();
}
