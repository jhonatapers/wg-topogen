package com.jhonatapers.topogen.core.networkir.v1.model;

public record Network(Address ipv4, Address ipv6) {

    public static record Address(String cidr) {
    }

}
