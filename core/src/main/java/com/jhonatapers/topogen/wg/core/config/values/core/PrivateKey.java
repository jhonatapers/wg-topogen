package com.jhonatapers.topogen.wg.core.config.values.core;

import com.jhonatapers.topogen.wg.core.config.section.Section;

public final class PrivateKey extends WgCoreConfig {

    private static final String NAME = "PrivateKey";
    private final String value;

    private PrivateKey(String value) {
        super(Section.INTERFACE);
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
