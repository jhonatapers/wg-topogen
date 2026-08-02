package com.jhonatapers.topogen.wg.core.config.values.core;

import com.jhonatapers.topogen.wg.core.config.section.Section;

public final class AllowedIPs extends WgCoreConfig {

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
