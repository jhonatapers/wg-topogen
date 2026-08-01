package com.jhonatapers.topogen.wg.core.config.quick;

public final class PreUp extends WgQuickConfig {

    private static final String NAME = "PreUp";
    private final String value;

    private PreUp(String value) {
        this.value = value;
    }

    public static PreUp ofValue(String value) {
        return new PreUp(value);
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
