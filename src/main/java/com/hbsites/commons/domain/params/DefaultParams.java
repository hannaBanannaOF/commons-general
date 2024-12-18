package com.hbsites.commons.domain.params;

import com.hbsites.commons.domain.enumeration.EApiParams;
import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.ws.rs.DefaultValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jboss.resteasy.reactive.RestHeader;
import org.jboss.resteasy.reactive.RestQuery;

@Getter
@Setter
@AllArgsConstructor
@RegisterForReflection
@NoArgsConstructor
public class DefaultParams {
    @RestHeader(EApiParams.Constants.HBSITES_API_VERSION)
    @DefaultValue("1")
    private int apiVersion = 1;
}
