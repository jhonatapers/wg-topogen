package com.jhonatapers.topogen.wg.core.config.core;

import com.jhonatapers.topogen.wg.core.config.Config;

public final class Endpoint extends WgCoreConfig {

    private static final String NAME = "Endpoint";
    private final String value;

    private Endpoint(String value) {
        super(Config.Section.PEER);
        this.value = value;
    }

    public static Endpoint ofValue(String value) {
        return new Endpoint(value);
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public String value() {
        return this.value;
    }

}
