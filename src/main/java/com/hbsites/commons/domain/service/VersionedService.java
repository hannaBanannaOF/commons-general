package com.hbsites.commons.domain.service;

public abstract class VersionedService<S> {

    protected abstract S getServiceByApiVersion(int apiVersion);

}
