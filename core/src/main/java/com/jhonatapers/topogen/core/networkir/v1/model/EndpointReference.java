package com.jhonatapers.topogen.core.networkir.v1.model;

public record EndpointReference(IdReference id, SelectorReference selector) {

    public static record IdReference(String id) {
    }

    public static record SelectorReference(Selector selector) {
    }

}
