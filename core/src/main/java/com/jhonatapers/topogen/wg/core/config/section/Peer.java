package com.jhonatapers.topogen.wg.core.config.section;

import com.jhonatapers.topogen.wg.core.config.values.core.AllowedIPs;
import com.jhonatapers.topogen.wg.core.config.values.core.Endpoint;
import com.jhonatapers.topogen.wg.core.config.values.core.PersistentKeepalive;
import com.jhonatapers.topogen.wg.core.config.values.core.PresharedKey;
import com.jhonatapers.topogen.wg.core.config.values.core.PublicKey;

public class Peer {

    private PublicKey publicKey;
    private PresharedKey presharedKey;
    private AllowedIPs allowedIPs;
    private Endpoint endpoint;
    private PersistentKeepalive persistentKeepalive;

}
