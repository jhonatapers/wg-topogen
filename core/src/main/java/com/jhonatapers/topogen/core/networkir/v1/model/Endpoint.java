package com.jhonatapers.topogen.core.networkir.v1.model;

import java.util.List;

public interface Endpoint {

    List<String> roles();

    List<String> networks();

}
