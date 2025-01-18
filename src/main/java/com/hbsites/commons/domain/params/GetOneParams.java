package com.hbsites.commons.domain.params;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.PathParam;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jboss.resteasy.reactive.RestPath;
import org.jboss.resteasy.reactive.RestQuery;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RegisterForReflection
public class GetOneParams extends DefaultParams {
    @PathParam("slug")
    private String slug;
}
