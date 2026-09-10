package com.jhonatapers.topogen.wg.model.conf.values.quick;

import com.jhonatapers.topogen.wg.model.conf.section.Section;
import com.jhonatapers.topogen.wg.model.conf.values.ConfigValue;

public abstract class WgQuickConfig implements ConfigValue {

    @Override
    public boolean accept(Format format) {
        return Format.WG.equals(format) || Format.WG_QUICK.equals(format);
    }

    @Override
    public boolean accept(Section section) {
        return Section.INTERFACE.equals(section);
    }

}
