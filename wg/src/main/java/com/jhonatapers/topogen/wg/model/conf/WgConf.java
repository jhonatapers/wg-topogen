package com.jhonatapers.topogen.wg.model.conf;

import java.util.Set;

import com.jhonatapers.topogen.wg.model.conf.section.Interface;
import com.jhonatapers.topogen.wg.model.conf.section.Peer;

public class WgConf {

    private Interface wgInterface;
    private Set<Peer> peers;

    public Interface getWgInterface() {
        return wgInterface;
    }

    public void setWgInterface(Interface wgInterface) {
        this.wgInterface = wgInterface;
    }

    public Set<Peer> getPeers() {
        return peers;
    }

    public void setPeers(Set<Peer> peers) {
        this.peers = Set.copyOf(peers);
    }

}
