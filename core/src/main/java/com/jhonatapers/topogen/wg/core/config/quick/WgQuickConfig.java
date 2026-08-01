package com.jhonatapers.topogen.wg.core.config.quick;

import com.jhonatapers.topogen.wg.core.config.Config;

public abstract class WgQuickConfig implements Config {

    @Override
    public boolean accept(Format format) {
        return Format.WG_CORE.equals(format) || Format.WG_QUICK.equals(format);
    }

    @Override
    public boolean accept(Section section) {
        return Config.Section.INTERFACE.equals(section);
    }

}
