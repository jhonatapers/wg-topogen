package com.jhonatapers.topogen.wg.config.section;

import com.jhonatapers.topogen.wg.config.values.wg.AllowedIPs;
import com.jhonatapers.topogen.wg.config.values.wg.Endpoint;
import com.jhonatapers.topogen.wg.config.values.wg.PersistentKeepalive;
import com.jhonatapers.topogen.wg.config.values.wg.PresharedKey;
import com.jhonatapers.topogen.wg.config.values.wg.PublicKey;

public class Peer {

    private PublicKey publicKey;
    private PresharedKey presharedKey;
    private AllowedIPs allowedIPs;
    private Endpoint endpoint;
    private PersistentKeepalive persistentKeepalive;

}
