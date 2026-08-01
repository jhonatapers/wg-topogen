package com.jhonatapers.topogen.wg.core.device;

import static java.util.Objects.isNull;

import java.util.HashSet;
import java.util.Set;

public class Device {

    private String name;
    private Set<DeviceLabel> labels;

    public Device(String name, Set<DeviceLabel> labels) {
        this.name = name;
        this.labels = isNull(labels) ? new HashSet<>() : new HashSet<>(labels);
    }

    public String getName() {
        return name;
    }

    public Set<DeviceLabel> getLabels() {
        return Set.copyOf(labels);
    }

}
