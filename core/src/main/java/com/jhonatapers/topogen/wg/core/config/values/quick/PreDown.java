package com.jhonatapers.topogen.wg.core.config.values.quick;

public final class PreDown extends WgQuickConfig {

    private static final String NAME = "PreDown";
    private final String value;

    private PreDown(String value) {
        this.value = value;
    }

    public static PreDown ofValue(String value) {
        return new PreDown(value);
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
