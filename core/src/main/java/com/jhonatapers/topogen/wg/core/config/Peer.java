package com.jhonatapers.topogen.wg.core.config;

import com.jhonatapers.topogen.wg.core.config.core.AllowedIPs;
import com.jhonatapers.topogen.wg.core.config.core.Endpoint;
import com.jhonatapers.topogen.wg.core.config.core.PersistentKeepalive;
import com.jhonatapers.topogen.wg.core.config.core.PresharedKey;
import com.jhonatapers.topogen.wg.core.config.core.PublicKey;

public class Peer {

    private PublicKey publicKey;
    private PresharedKey presharedKey;
    private AllowedIPs allowedIPs;
    private Endpoint endpoint;
    private PersistentKeepalive persistentKeepalive;

}
