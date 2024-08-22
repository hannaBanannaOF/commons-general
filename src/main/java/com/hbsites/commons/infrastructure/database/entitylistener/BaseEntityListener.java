package com.hbsites.commons.infrastructure.database.entitylistener;

import com.hbsites.commons.infrastructure.database.entity.BaseEntity;
import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

import java.time.LocalDateTime;

public class BaseEntityListener<T extends BaseEntity> implements EntityListener<T> {
    @Override
    public void preInsert(T baseEntity, PreInsertContext<T> context) {
        baseEntity.setCreationDate(LocalDateTime.now());
        baseEntity.setUpdateDate(LocalDateTime.now());
        EntityListener.super.preInsert(baseEntity, context);
    }

    @Override
    public void preUpdate(T baseEntity, PreUpdateContext<T> context) {
        baseEntity.setUpdateDate(LocalDateTime.now());
        EntityListener.super.preUpdate(baseEntity, context);
    }
}
