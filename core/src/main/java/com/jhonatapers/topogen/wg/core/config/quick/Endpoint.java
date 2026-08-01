package com.jhonatapers.topogen.wg.core.config.quick;

public final class Endpoint extends WgQuickConfig {

    private static final String NAME = "Endpoint";
    private final String value;

    private Endpoint(String value) {
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
