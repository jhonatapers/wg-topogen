package com.jhonatapers.topogen.wg.model.conf.values.quick;

public final class MTU extends WgQuickConfig {

    private static final String NAME = "MTU";
    private final String value;

    private MTU(String value) {
        this.value = value;
    }

    public static MTU ofValue(String value) {
        return new MTU(value);
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
