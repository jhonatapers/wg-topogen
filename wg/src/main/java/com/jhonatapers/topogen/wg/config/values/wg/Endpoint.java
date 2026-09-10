package com.jhonatapers.topogen.wg.config.values.wg;

import com.jhonatapers.topogen.wg.config.section.Section;

public final class Endpoint extends WgConfig {

    private static final String NAME = "Endpoint";
    private final String value;

    private Endpoint(String value) {
        super(Section.PEER);
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
