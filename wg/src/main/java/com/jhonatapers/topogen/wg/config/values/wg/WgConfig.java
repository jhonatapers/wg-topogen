package com.jhonatapers.topogen.wg.config.values.wg;

import com.jhonatapers.topogen.wg.config.section.Section;
import com.jhonatapers.topogen.wg.config.values.ConfigValue;

public abstract class WgConfig implements ConfigValue {

    private final Section section;

    public WgConfig(Section section) {
        this.section = section;
    }

    @Override
    public boolean accept(Format format) {
        return Format.WG.equals(format);
    }

    @Override
    public boolean accept(Section section) {
        return this.section.equals(section);
    }

}
