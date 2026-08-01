package com.jhonatapers.topogen.wg.core.config;

public interface Config {

    String name();

    String value();

    default boolean validate() {
        return true;
    }

    boolean accept(Format format);

    boolean accept(Section section);

    public enum Format {
        WG_CORE,
        WG_QUICK,
    }

    public enum Section {
        INTERFACE,
        PEER
    }

}
