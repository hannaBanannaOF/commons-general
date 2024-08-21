package com.hbsites.commons.infrastructure.config;

import io.smallrye.mutiny.Uni;

public interface UserProviderManager {

    public Uni<Void> populateUserProvider();
}
