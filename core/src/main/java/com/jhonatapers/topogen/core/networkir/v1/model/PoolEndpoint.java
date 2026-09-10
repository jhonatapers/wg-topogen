package com.jhonatapers.topogen.core.networkir.v1.model;

import java.util.List;

public record PoolEndpoint(
        List<String> roles,
        List<String> networks,
        int capacity) implements Endpoint {

}
