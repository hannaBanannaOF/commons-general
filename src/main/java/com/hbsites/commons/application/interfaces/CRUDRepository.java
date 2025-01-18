package com.hbsites.commons.application.interfaces;

import io.smallrye.mutiny.Uni;

import java.util.List;

public interface CRUDRepository<T, U> {
    Uni<List<U>> getAll(int page);

    Uni<U> getOne(T id);

    Uni<U> create(U create);

    Uni<U> update(T id, U update);

    Uni<Void> delete(T id);
}
