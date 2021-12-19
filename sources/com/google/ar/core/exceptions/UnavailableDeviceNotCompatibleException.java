package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class UnavailableDeviceNotCompatibleException extends UnavailableException {
    static {
        Covode.recordClassIndex(33096);
    }

    public UnavailableDeviceNotCompatibleException() {
    }

    public UnavailableDeviceNotCompatibleException(String str) {
        super(str);
    }
}
