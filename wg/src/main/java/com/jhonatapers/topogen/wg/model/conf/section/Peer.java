package com.jhonatapers.topogen.wg.model.conf.section;

import com.jhonatapers.topogen.wg.model.conf.values.wg.AllowedIPs;
import com.jhonatapers.topogen.wg.model.conf.values.wg.Endpoint;
import com.jhonatapers.topogen.wg.model.conf.values.wg.PersistentKeepalive;
import com.jhonatapers.topogen.wg.model.conf.values.wg.PresharedKey;
import com.jhonatapers.topogen.wg.model.conf.values.wg.PublicKey;

public class Peer {

    private PublicKey publicKey;
    private PresharedKey presharedKey;
    private AllowedIPs allowedIPs;
    private Endpoint endpoint;
    private PersistentKeepalive persistentKeepalive;

    public PublicKey getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(PublicKey publicKey) {
        this.publicKey = publicKey;
    }

    public PresharedKey getPresharedKey() {
        return presharedKey;
    }

    public void setPresharedKey(PresharedKey presharedKey) {
        this.presharedKey = presharedKey;
    }

    public AllowedIPs getAllowedIPs() {
        return allowedIPs;
    }

    public void setAllowedIPs(AllowedIPs allowedIPs) {
        this.allowedIPs = allowedIPs;
    }

    public Endpoint getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    public PersistentKeepalive getPersistentKeepalive() {
        return persistentKeepalive;
    }

    public void setPersistentKeepalive(PersistentKeepalive persistentKeepalive) {
        this.persistentKeepalive = persistentKeepalive;
    }

}
