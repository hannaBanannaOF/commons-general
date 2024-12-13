package com.hbsites.commons.domain.model;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.UUID;

@RegisterForReflection
public record BasicListItem<T>(T id, String description) {}
