package com.jhonatapers.topogen.core.networkir.v1.model;

public record Route(
        String id,
        EndpointReference source,
        EndpointReference target,
        String type // explicit | dynamic
) {

}
