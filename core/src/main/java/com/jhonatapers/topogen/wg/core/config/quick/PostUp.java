package com.jhonatapers.topogen.wg.core.config.quick;

public final class PostUp extends WgQuickConfig {

    private static final String NAME = "PostUp";
    private final String value;

    private PostUp(String value) {
        this.value = value;
    }

    public static PostUp ofValue(String value) {
        return new PostUp(value);
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
