package com.jhonatapers.topogen.core.networkir.v1.model;

public record Policy(
        String id,
        EndpointReference source,
        EndpointReference destination,
        String action // allow | deny
) {

}
