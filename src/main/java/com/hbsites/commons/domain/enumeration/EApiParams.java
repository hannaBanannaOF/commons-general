package com.hbsites.commons.domain.enumeration;

public enum EApiParams {
    HBSITES_API_VERSION("HBSITES-API-VERSION");

    EApiParams(String apiParam) {
        if(!apiParam.equals(this.name()))
            throw new IllegalArgumentException();
    }

    public static class Constants {
        public static final String HBSITES_API_VERSION = "HBSITES-API-VERSION";
    }
}
