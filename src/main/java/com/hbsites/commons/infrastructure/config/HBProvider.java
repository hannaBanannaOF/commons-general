package com.hbsites.commons.infrastructure.config;

import jakarta.inject.Provider;
import lombok.Setter;

@Setter
public abstract class HBProvider<T> implements Provider<T> {

    private T providerValue;

    @Override
    public T get() {
        return this.providerValue;
    }
}
