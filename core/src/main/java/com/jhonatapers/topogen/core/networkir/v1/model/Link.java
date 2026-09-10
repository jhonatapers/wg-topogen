package com.jhonatapers.topogen.core.networkir.v1.model;

public record Link(
        String id,
        EndpointReference source,
        EndpointReference target,
        String direction // bidirectional | unidirectional
) {

}
