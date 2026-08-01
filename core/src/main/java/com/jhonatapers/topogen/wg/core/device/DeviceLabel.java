package com.jhonatapers.topogen.wg.core.device;

import static java.util.Objects.isNull;

public record DeviceLabel(String value) {

    public DeviceLabel {

        if (isNull(value))
            throw new IllegalArgumentException("Device label cannot be null");

        if (value.isBlank())
            throw new IllegalArgumentException("Device label cannot be blank");

        value = value.trim().toUpperCase();

    }

    public static DeviceLabel ofValue(String value) {
        return new DeviceLabel(value);
    }

}
