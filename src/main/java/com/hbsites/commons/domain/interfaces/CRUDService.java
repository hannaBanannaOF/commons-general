package com.hbsites.commons.domain.interfaces;

import com.hbsites.commons.domain.model.BasicListItem;
import com.hbsites.commons.domain.params.CRUDDeleteParams;
import com.hbsites.commons.domain.params.CRUDGetAllParams;
import com.hbsites.commons.domain.params.CRUDGetOneParams;
import com.hbsites.commons.domain.params.CRUDUpdateParams;
import com.hbsites.commons.domain.params.DefaultParams;
import io.smallrye.mutiny.Uni;

import java.util.List;

public interface CRUDService<DTO> {

    Uni<List<BasicListItem>> getAll(CRUDGetAllParams params);

    Uni<DTO> create(DefaultParams params, DTO create);

    Uni<DTO> getOne(CRUDGetOneParams params);

    Uni<DTO> update(CRUDUpdateParams params, DTO updated);

    Uni<Void> delete(CRUDDeleteParams params);
}