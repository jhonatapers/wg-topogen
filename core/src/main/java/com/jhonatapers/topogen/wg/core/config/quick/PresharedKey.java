package com.jhonatapers.topogen.wg.core.config.quick;

public final class PresharedKey extends WgQuickConfig {

    private static final String NAME = "PresharedKey";
    private final String value;

    private PresharedKey(String value) {
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
