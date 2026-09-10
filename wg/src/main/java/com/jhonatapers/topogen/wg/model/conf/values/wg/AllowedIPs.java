package com.jhonatapers.topogen.wg.model.conf.values.wg;

import com.jhonatapers.topogen.wg.model.conf.section.Section;

public final class AllowedIPs extends WgConfig {

    private static final String NAME = "AllowedIPs";
    private final String value;

    private AllowedIPs(String value) {
        super(Section.PEER);
        this.value = value;
    }

    public static AllowedIPs ofValue(String value) {
        return new AllowedIPs(value);
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
