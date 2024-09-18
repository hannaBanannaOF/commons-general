package com.hbsites.commons.domain.interfaces;

import io.smallrye.mutiny.Uni;

import java.util.List;
import java.util.UUID;

public interface CRUDRepository<ENTITY> {
    Uni<List<ENTITY>> getAll(int page);

    Uni<ENTITY> create(ENTITY create);

    Uni<ENTITY> getOne(UUID uuid);

    Uni<ENTITY> update(UUID uuid, ENTITY updated);

    Uni<Void> delete(UUID uuid);
}
