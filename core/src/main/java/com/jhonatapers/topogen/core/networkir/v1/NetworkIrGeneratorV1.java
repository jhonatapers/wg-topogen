package com.jhonatapers.topogen.core.networkir.v1;

import com.jhonatapers.topogen.core.networkir.v1.model.NetworkIrV1;

@FunctionalInterface
public interface NetworkIrGeneratorV1 {

    NetworkIrV1 generate();

}
