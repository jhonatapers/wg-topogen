package com.jhonatapers.topogen.wg.config.values;

import com.jhonatapers.topogen.wg.config.section.Section;

public interface ConfigValue {

    String name();

    String value();

    boolean accept(Format format);

    boolean accept(Section section);

    default boolean validate() {
        return true;
    }

    public enum Format {
        WG,
        WG_QUICK,
    }

}
