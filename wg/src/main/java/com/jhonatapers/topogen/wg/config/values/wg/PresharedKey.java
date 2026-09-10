package com.jhonatapers.topogen.wg.config.values.wg;

import com.jhonatapers.topogen.wg.config.section.Section;

public final class PresharedKey extends WgConfig {

    private static final String NAME = "PresharedKey";
    private final String value;

    private PresharedKey(String value) {
        super(Section.PEER);
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
