package com.hbsites.commons.application.interfaces;

import com.hbsites.commons.domain.model.BasicListItem;
import com.hbsites.commons.domain.params.DefaultParams;
import com.hbsites.commons.domain.params.GetAllParams;
import com.hbsites.commons.domain.params.GetOneParams;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;

import java.util.List;

public interface CRUDResource<T, U> {
    @GET
    Uni<List<BasicListItem<T>>> getAll(@BeanParam GetAllParams params);

    @GET @Path("/{slug}")
    Uni<U> getOne(@BeanParam GetOneParams params);

    @POST
    Uni<U> create(@BeanParam DefaultParams params, U create);

    @PUT @Path("/{slug}")
    Uni<U> update(@BeanParam GetOneParams params, U update);

    @DELETE @Path("/{slug}")
    Uni<Void> delete(@BeanParam GetOneParams params);
}
