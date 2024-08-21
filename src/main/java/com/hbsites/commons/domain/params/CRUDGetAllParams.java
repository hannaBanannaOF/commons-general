package com.hbsites.commons.domain.params;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.ws.rs.DefaultValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jboss.resteasy.reactive.RestQuery;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RegisterForReflection
public class CRUDGetAllParams extends DefaultParams {
    @RestQuery
    @DefaultValue("0")
    private int page = 0;
}
