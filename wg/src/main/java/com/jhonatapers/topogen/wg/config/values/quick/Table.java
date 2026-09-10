package com.jhonatapers.topogen.wg.config.values.quick;

public final class Table extends WgQuickConfig {

    private static final String NAME = "Table";
    private final String value;

    private Table(String value) {
        this.value = value;
    }

    public static Table ofValue(String value) {
        return new Table(value);
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
