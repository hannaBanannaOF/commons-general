package com.hbsites.commons.domain.interfaces;

import com.hbsites.commons.domain.dto.BasicListDTO;
import io.smallrye.mutiny.Uni;

import java.util.List;
import java.util.UUID;

public interface CRUDService<SPECIFICDTO> {

    Uni<List<BasicListDTO>> getAll(int page);

    Uni<SPECIFICDTO> create(SPECIFICDTO create);

    Uni<SPECIFICDTO> getOne(UUID uuid);

    Uni<SPECIFICDTO> update(UUID uuid, SPECIFICDTO updated);

    Uni<Void> delete(UUID uuid);
}