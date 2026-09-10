package com.jhonatapers.topogen.core.networkir.v1.model;

import java.util.List;

public record NodeEndpoint(
        List<String> roles,
        List<String> networks) implements Endpoint {

}
