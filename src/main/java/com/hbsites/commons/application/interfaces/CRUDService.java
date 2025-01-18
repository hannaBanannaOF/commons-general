package com.hbsites.commons.application.interfaces;

import com.hbsites.commons.domain.model.BasicListItem;
import com.hbsites.commons.domain.params.DefaultParams;
import com.hbsites.commons.domain.params.GetAllParams;
import com.hbsites.commons.domain.params.GetOneParams;
import io.smallrye.mutiny.Uni;

import java.util.List;

public interface CRUDService<T, U> {
    Uni<List<BasicListItem<T>>> getAll(GetAllParams params);

    Uni<U> getOne(GetOneParams params);

    Uni<U> create(DefaultParams params, U create);

    Uni<U> update(GetOneParams params, U update);

    Uni<Void> delete(GetOneParams params);
}
