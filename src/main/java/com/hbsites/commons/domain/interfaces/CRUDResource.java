package com.hbsites.commons.domain.interfaces;

import com.hbsites.commons.domain.dto.BasicListDTO;
import com.hbsites.commons.domain.params.CRUDGetAllParams;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import org.jboss.resteasy.reactive.RestPath;
import org.jboss.resteasy.reactive.RestQuery;

import java.util.List;
import java.util.UUID;

public interface CRUDResource<SPECIFICDTO> {

    @GET
    Uni<List<BasicListDTO>> getAll(@BeanParam CRUDGetAllParams params);

    @POST
    Uni<SPECIFICDTO> create(SPECIFICDTO create);

    @GET
    @Path("/{uuid}")
    Uni<SPECIFICDTO> getOne(@RestPath UUID uuid);

    @PUT
    @Path("/{uuid}")
    Uni<SPECIFICDTO> update(@RestPath UUID uuid, SPECIFICDTO updated);

    @DELETE
    @Path("/{uuid}")
    Uni<Void> delete(@RestPath UUID uuid);
}
