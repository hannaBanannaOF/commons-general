package com.hbsites.commons.domain.interfaces;

public interface CRUDSpecificDTO<ENTITY> {

    ENTITY toEntity(boolean newEntity);

}
