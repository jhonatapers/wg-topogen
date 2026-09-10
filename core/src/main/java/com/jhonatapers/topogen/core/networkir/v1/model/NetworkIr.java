package com.jhonatapers.topogen.core.networkir.v1.model;

import java.util.List;
import java.util.Map;

public record NetworkIr(
        String version,
        Map<String, Network> networks,
        Map<String, Endpoint> endpoints,
        List<Link> links,
        List<Route> routes,
        List<Policy> policies) {

}
