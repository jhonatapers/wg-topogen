package com.jhonatapers.topogen.wg.core.config.section;

import com.jhonatapers.topogen.wg.core.config.values.core.ListenPort;
import com.jhonatapers.topogen.wg.core.config.values.core.PrivateKey;
import com.jhonatapers.topogen.wg.core.config.values.quick.Address;
import com.jhonatapers.topogen.wg.core.config.values.quick.DNS;
import com.jhonatapers.topogen.wg.core.config.values.quick.MTU;
import com.jhonatapers.topogen.wg.core.config.values.quick.PostDown;
import com.jhonatapers.topogen.wg.core.config.values.quick.PostUp;
import com.jhonatapers.topogen.wg.core.config.values.quick.PreDown;
import com.jhonatapers.topogen.wg.core.config.values.quick.PreUp;
import com.jhonatapers.topogen.wg.core.config.values.quick.Table;

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
