package com.jhonatapers.topogen.wg.core.config.values.core;

import com.jhonatapers.topogen.wg.core.config.section.Section;
import com.jhonatapers.topogen.wg.core.config.values.ConfigValue;

public abstract class WgCoreConfig implements ConfigValue {

    private final Section section;

    public WgCoreConfig(Section section) {
        this.section = section;
    }

    @Override
    public boolean accept(Format format) {
        return Format.WG_CORE.equals(format);
    }

    @Override
    public boolean accept(Section section) {
        return this.section.equals(section);
    }

}
