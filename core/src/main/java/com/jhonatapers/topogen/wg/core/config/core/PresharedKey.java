package com.jhonatapers.topogen.wg.core.config.core;

import com.jhonatapers.topogen.wg.core.config.Config;

public final class PresharedKey extends WgCoreConfig {

    private static final String NAME = "PresharedKey";
    private final String value;

    private PresharedKey(String value) {
        super(Config.Section.PEER);
        this.value = value;
    }

    public static PresharedKey ofValue(String value) {
        return new PresharedKey(value);
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
