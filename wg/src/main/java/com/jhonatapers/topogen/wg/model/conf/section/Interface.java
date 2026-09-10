package com.jhonatapers.topogen.wg.model.conf.section;

import com.jhonatapers.topogen.wg.model.conf.values.quick.Address;
import com.jhonatapers.topogen.wg.model.conf.values.quick.DNS;
import com.jhonatapers.topogen.wg.model.conf.values.quick.MTU;
import com.jhonatapers.topogen.wg.model.conf.values.quick.PostDown;
import com.jhonatapers.topogen.wg.model.conf.values.quick.PostUp;
import com.jhonatapers.topogen.wg.model.conf.values.quick.PreDown;
import com.jhonatapers.topogen.wg.model.conf.values.quick.PreUp;
import com.jhonatapers.topogen.wg.model.conf.values.quick.Table;
import com.jhonatapers.topogen.wg.model.conf.values.wg.ListenPort;
import com.jhonatapers.topogen.wg.model.conf.values.wg.PrivateKey;

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

    public PrivateKey getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(PrivateKey privateKey) {
        this.privateKey = privateKey;
    }

    public ListenPort getListenPort() {
        return listenPort;
    }

    public void setListenPort(ListenPort listenPort) {
        this.listenPort = listenPort;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public DNS getDns() {
        return dns;
    }

    public void setDns(DNS dns) {
        this.dns = dns;
    }

    public MTU getMtu() {
        return mtu;
    }

    public void setMtu(MTU mtu) {
        this.mtu = mtu;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public PreUp getPreUp() {
        return preUp;
    }

    public void setPreUp(PreUp preUp) {
        this.preUp = preUp;
    }

    public PostUp getPostUp() {
        return postUp;
    }

    public void setPostUp(PostUp postUp) {
        this.postUp = postUp;
    }

    public PreDown getPreDown() {
        return preDown;
    }

    public void setPreDown(PreDown preDown) {
        this.preDown = preDown;
    }

    public PostDown getPostDown() {
        return postDown;
    }

    public void setPostDown(PostDown postDown) {
        this.postDown = postDown;
    }

}
