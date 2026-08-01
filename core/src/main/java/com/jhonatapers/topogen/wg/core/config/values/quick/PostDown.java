package com.jhonatapers.topogen.wg.core.config.values.quick;

public final class PostDown extends WgQuickConfig {

    private static final String NAME = "PostDown";
    private final String value;

    private PostDown(String value) {
        this.value = value;
    }

    public static PostDown ofValue(String value) {
        return new PostDown(value);
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
