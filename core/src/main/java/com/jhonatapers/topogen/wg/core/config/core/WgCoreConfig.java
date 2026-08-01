package com.jhonatapers.topogen.wg.core.config.core;

import com.jhonatapers.topogen.wg.core.config.Config;

public abstract class WgCoreConfig implements Config {

    private final Config.Section section;

    public WgCoreConfig(Config.Section section) {
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
