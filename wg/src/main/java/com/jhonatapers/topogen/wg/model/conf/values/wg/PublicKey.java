package com.jhonatapers.topogen.wg.model.conf.values.wg;

import com.jhonatapers.topogen.wg.model.conf.section.Section;

public final class PublicKey extends WgConfig {

    private static final String NAME = "PublicKey";
    private final String value;

    private PublicKey(String value) {
        super(Section.PEER);
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
