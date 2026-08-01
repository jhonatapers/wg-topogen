package com.jhonatapers.topogen.wg.core.config.core;

import com.jhonatapers.topogen.wg.core.config.Config;

public final class PrivateKey extends WgCoreConfig {

    private static final String NAME = "PrivateKey";
    private final String value;

    private PrivateKey(String value) {
        super(Config.Section.INTERFACE);
        this.value = value;
    }

    public static PrivateKey ofValue(String value) {
        return new PrivateKey(value);
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
