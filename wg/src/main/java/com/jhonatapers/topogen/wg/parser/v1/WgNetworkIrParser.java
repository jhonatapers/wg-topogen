package com.jhonatapers.topogen.wg.parser.v1;

import java.util.Set;

import com.jhonatapers.topogen.core.networkir.v1.NetworkIrParser;
import com.jhonatapers.topogen.core.networkir.v1.model.NetworkIr;
import com.jhonatapers.topogen.wg.model.conf.WgConf;

public class WgNetworkIrParser implements NetworkIrParser<Set<WgConf>> {

    @Override
    public Set<WgConf> parse(NetworkIr networkIr) {
        return null;
    }

}
