package com.jhonatapers.topogen.wg.core.config.values;

import com.jhonatapers.topogen.wg.core.config.section.Section;

public interface ConfigValue {

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

}
