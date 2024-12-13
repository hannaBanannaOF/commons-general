package com.hbsites.commons.domain.interfaces;

import com.hbsites.commons.domain.model.BasicListItem;
import com.hbsites.commons.domain.params.CRUDDeleteParams;
import com.hbsites.commons.domain.params.CRUDGetAllParams;
import com.hbsites.commons.domain.params.CRUDGetOneParams;
import com.hbsites.commons.domain.params.CRUDUpdateParams;
import com.hbsites.commons.domain.params.DefaultParams;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;

import java.util.List;

public interface CRUDResource<DTO> {

    @GET
    Uni<List<BasicListItem>> getAll(@BeanParam CRUDGetAllParams params);

    @POST
    Uni<DTO> create(@BeanParam DefaultParams params, DTO create);

    @GET
    @Path("/{uuid}")
    Uni<DTO> getOne(@BeanParam CRUDGetOneParams params);

    @PUT
    @Path("/{uuid}")
    Uni<DTO> update(@BeanParam CRUDUpdateParams params, DTO updated);

    @DELETE
    @Path("/{uuid}")
    Uni<Void> delete(@BeanParam CRUDDeleteParams params);
}
