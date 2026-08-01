package com.jhonatapers.topogen.wg.core.config.core;

import com.jhonatapers.topogen.wg.core.config.Config;

public final class PersistentKeepalive extends WgCoreConfig {

    private static final String NAME = "PersistentKeepalive";
    private final String value;

    private PersistentKeepalive(String value) {
        super(Config.Section.PEER);
        this.value = value;
    }

    public static PersistentKeepalive ofValue(String value) {
        return new PersistentKeepalive(value);
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
