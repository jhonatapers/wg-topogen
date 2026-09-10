package com.jhonatapers.topogen.wg.model.conf.values.quick;

public final class Address extends WgQuickConfig {

    private static final String NAME = "Address";
    private final String value;

    private Address(String value) {
        this.value = value;
    }

    public static Address ofValue(String value) {
        return new Address(value);
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
