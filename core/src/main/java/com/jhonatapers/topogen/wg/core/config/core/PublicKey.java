package com.jhonatapers.topogen.wg.core.config.core;

import com.jhonatapers.topogen.wg.core.config.Config;

public final class PublicKey extends WgCoreConfig {

    private static final String NAME = "PublicKey";
    private final String value;

    private PublicKey(String value) {
        super(Config.Section.PEER);
        this.value = value;
    }

    public static PublicKey ofValue(String value) {
        return new PublicKey(value);
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
