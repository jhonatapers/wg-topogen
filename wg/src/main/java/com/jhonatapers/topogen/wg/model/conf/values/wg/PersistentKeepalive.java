package com.jhonatapers.topogen.wg.model.conf.values.wg;

import com.jhonatapers.topogen.wg.model.conf.section.Section;

public final class PersistentKeepalive extends WgConfig {

    private static final String NAME = "PersistentKeepalive";
    private final String value;

    private PersistentKeepalive(String value) {
        super(Section.PEER);
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
