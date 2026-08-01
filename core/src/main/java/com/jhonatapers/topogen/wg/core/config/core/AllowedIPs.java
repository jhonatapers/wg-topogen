package com.jhonatapers.topogen.wg.core.config.core;

import com.jhonatapers.topogen.wg.core.config.Config;

public final class AllowedIPs extends WgCoreConfig {

    private static final String NAME = "AllowedIPs";
    private final String value;

    private AllowedIPs(String value) {
        super(Config.Section.PEER);
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

    @Override
    public boolean accept(Section section) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'accept'");
    }

}
