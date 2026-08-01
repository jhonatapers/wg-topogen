package com.jhonatapers.topogen.wg.core.config.quick;

public final class DNS extends WgQuickConfig {

    private static final String NAME = "DNS";
    private final String value;

    private DNS(String value) {
        this.value = value;
    }

    public static DNS ofValue(String value) {
        return new DNS(value);
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
