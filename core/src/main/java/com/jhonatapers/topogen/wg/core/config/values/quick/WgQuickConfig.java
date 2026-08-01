package com.jhonatapers.topogen.wg.core.config.values.quick;

import com.jhonatapers.topogen.wg.core.config.section.Section;
import com.jhonatapers.topogen.wg.core.config.values.ConfigValue;

public abstract class WgQuickConfig implements ConfigValue {

    @Override
    public boolean accept(Format format) {
        return Format.WG_CORE.equals(format) || Format.WG_QUICK.equals(format);
    }

    @Override
    public boolean accept(Section section) {
        return Section.INTERFACE.equals(section);
    }

}
