package com.jhonatapers.topogen.wg.config.values.wg;

import com.jhonatapers.topogen.wg.config.section.Section;

public final class ListenPort extends WgConfig {

    private static final String NAME = "ListenPort";
    private final int value;

    private ListenPort(int value) {
        super(Section.INTERFACE);
        this.value = value;
    }

    public static ListenPort ofValue(int value) {
        return new ListenPort(value);
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public String value() {
        return String.valueOf(this.value);
    }

}
