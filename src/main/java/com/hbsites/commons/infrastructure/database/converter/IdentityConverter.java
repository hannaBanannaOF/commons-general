package com.hbsites.commons.infrastructure.database.converter;

import com.hbsites.commons.infrastructure.database.entity.Identity;
import org.seasar.doma.DomainConverters;
import org.seasar.doma.jdbc.domain.DomainConverter;

import java.util.UUID;

@DomainConverters
public class IdentityConverter implements DomainConverter<Identity<?>, String> {
    @Override
    public String fromDomainToValue(Identity<?> identity) {
        return identity.getValue().toString();
    }

    @Override
    public Identity<?> fromValueToDomain(String s) {
        if (s == null) {
            return null;
        }
        return new Identity<>(UUID.fromString(s));
    }
}
