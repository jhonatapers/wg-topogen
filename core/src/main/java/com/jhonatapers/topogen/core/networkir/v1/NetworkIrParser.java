package com.jhonatapers.topogen.core.networkir.v1;

import com.jhonatapers.topogen.core.networkir.v1.model.NetworkIr;

@FunctionalInterface
public interface NetworkIrParser<T extends Object> {

    T parse(NetworkIr networkIr);

}
