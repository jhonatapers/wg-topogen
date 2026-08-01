package com.jhonatapers.topogen.wg.core.config;

import com.jhonatapers.topogen.wg.core.config.core.ListenPort;
import com.jhonatapers.topogen.wg.core.config.core.PrivateKey;
import com.jhonatapers.topogen.wg.core.config.quick.Address;
import com.jhonatapers.topogen.wg.core.config.quick.DNS;
import com.jhonatapers.topogen.wg.core.config.quick.MTU;
import com.jhonatapers.topogen.wg.core.config.quick.PostDown;
import com.jhonatapers.topogen.wg.core.config.quick.PostUp;
import com.jhonatapers.topogen.wg.core.config.quick.PreDown;
import com.jhonatapers.topogen.wg.core.config.quick.PreUp;
import com.jhonatapers.topogen.wg.core.config.quick.Table;

public class Interface {

    private PrivateKey privateKey;
    private ListenPort listenPort;
    private Address address;

    private DNS dns;
    private MTU mtu;
    private Table table;

    private PreUp preUp;
    private PostUp postUp;

    private PreDown preDown;
    private PostDown postDown;

}
